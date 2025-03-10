package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Author;
import util.HibernateUtil;

public class AuthorDAO implements DAOInterface<Author> {

	@Override
	public List<Author> selectAll() {
		List<Author> list = new ArrayList<>();
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if (sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();
				String hql = "from author ";
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
	public Author selectById(Author t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(Author t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Author t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Author t) {
		// TODO Auto-generated method stub
		return false;
	}

}
