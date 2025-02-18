package test;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Cat;
import util.HibernateUtil;

public class test2 {
	public static void main(String[] args) {
		Cat cat_1 = new Cat("Meo mun", new Date(System.currentTimeMillis()), true);
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if (sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();
//				Persistence
				session.save(cat_1);
				tr.commit();
//				detached => persistence
				session.refresh(cat_1);
				session.close();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(cat_1);

	}
}
