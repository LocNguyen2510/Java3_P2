package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Person;
import util.HibernateUtil;

public class PersonDAO implements DAOInterface<Person> {

	@Override
	public List<Person> selectAll() {
		List<Person> list = new ArrayList<>();
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if (sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();
				// thực thi câu lệnh HQL
				String hql = "from Person p";
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
	public Person selectById(Person t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(Person t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Person t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Person t) {
		// TODO Auto-generated method stub
		return false;
	}

}
