package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.Cat;
import util.HibernateUtil;

public class test {
	public static void main(String[] args) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if (sessionFactory != null) {
				Session session = sessionFactory.openSession();
				try {
					Cat cat1 = new Cat();
					cat1.setName("Tom");
					cat1.setSex(true);
					session.save(cat1);
				} finally {
					session.close();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
