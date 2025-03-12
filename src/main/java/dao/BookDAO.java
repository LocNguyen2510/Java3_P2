package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Book;
import util.HibernateUtil;

public class BookDAO implements DAOInterface<Book> {

	@Override
	public List<Book> selectAll() {
		List<Book> list = new ArrayList<>();
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if (sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();
				String hql = "from book b";
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
	public Book selectById(Book t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(Book t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Book t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Book t) {
		// TODO Auto-generated method stub
		return false;
	}

}
