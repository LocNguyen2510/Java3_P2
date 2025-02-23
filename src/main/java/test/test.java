package test;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Person;
import util.HibernateUtil;

public class test {
	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		if (sessionFactory != null) {
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			// thực thi câu lệnh HQL
			Person p1 = new Person("Nguyen Dinh Loc", new Date(System.currentTimeMillis()), null);
			session.save(p1);
			tr.commit();
			session.close();
		}
	}

}
