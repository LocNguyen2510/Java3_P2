package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Cat;
import util.HibernateUtil;

public class CatDAO implements DAOInterface<Cat> {

	@Override
	public List<Cat> selectAll() {
		List<Cat> list = new ArrayList<>();
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if (sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();
				// thực thi câu lệnh HQL
				String hql = "from Cat c";
				Query query = session.createQuery(hql);
				list = query.getResultList();
				tr.commit();
				session.close();
			} else {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Cat selectById(Cat t) {
		List<Cat> list = new ArrayList<>();
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if (sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();
				// thực thi câu lệnh HQL
				String hql = "from Cat c where c.id=id";
				Query query = session.createQuery(hql);
				list = query.getResultList();
				query.setParameter("id", t.getId());
				tr.commit();
				session.close();
			} else {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (list.size() > 0) {
			return list.get(0);
		} else {
			return null;
		}
	}

//	public Cat selectById(Cat t) {
//		if (t == null || t.getId() == null) {
//			return null; // Tránh lỗi NullPointerException
//		}
//
//		Cat cat = null;
//		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//			Transaction tr = session.beginTransaction();
//
//			// Sửa lại câu lệnh HQL đúng cú pháp
//			String hql = "from Cat c where c.id = :id";
//			Query query = session.createQuery(hql, Cat.class);
//			query.setParameter("id", t.getId());
//
//			cat = (Cat) ((org.hibernate.query.Query) query).uniqueResult(); // Trả về một đối tượng duy nhất thay vì
//																			// danh sách
//
//			tr.commit();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return cat;
//	}

	public boolean saveOrUpdate(Cat t) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if (sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();
				// thực thi câu lệnh HQL
				// (save) chỉ lưu khi chưa tồn tại
				// session.save(t);
				// (saveOrUpdate) thêm mới khi chưa tồn tại hoặc cập nhật nếu đã tồn tại
				session.saveOrUpdate(t);
				tr.commit();
				session.close();
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean insert(Cat t) {
		return saveOrUpdate(t);
	}

	@Override
	public boolean update(Cat t) {

		return saveOrUpdate(t);
	}

	@Override
	public boolean delete(Cat t) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if (sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();
				session.delete(t);
				tr.commit();
				session.close();
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
