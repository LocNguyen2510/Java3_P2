package util;

import org.hibernate.SessionFactory;

public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			return new Configuration().configue().buildSessionFactory();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
