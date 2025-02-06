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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(Cat t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Cat t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Cat t) {
		// TODO Auto-generated method stub
		return false;
	}

}
