package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import util.HibernateUtil;

public class test {
	public static void main(String[] args) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory()
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
