package test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Customer;
import model.My_Order;
import util.HibernateUtil;

public class test {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		if (sessionFactory != null) {
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
//			Customer c1 = new Customer("001", "Nguyen Dinh Loc", "dinhloc2510@gmail.com");
//			My_Order o1 = new My_Order("1", "Da Nang", c1);
//			My_Order o2 = new My_Order("2", "Da Nang", c1);
//			My_Order o3 = new My_Order("3", "Da Nang", c1);
//			My_Order o4 = new My_Order("4", "Da Nang", c1);
//			List<My_Order> list = new ArrayList<>();
//			list.add(o1);
//			list.add(o2);
//			list.add(o3);
//			list.add(o4);
//			c1.setOrder(list);
//			session.saveOrUpdate(c1);
//			session.saveOrUpdate(o1);
//			session.saveOrUpdate(o2);
//			session.saveOrUpdate(o3);
//			session.saveOrUpdate(o4);
			Customer c2 = new Customer("002", "Phan Manh Quynh", "cochangtraivietlencay@gmail.com");
			My_Order o5 = new My_Order("5", "HCM", c2);
			My_Order o6 = new My_Order("6", "HCM", c2);
			My_Order o7 = new My_Order("7", "HCM", c2);
			My_Order o8 = new My_Order("8", "HCM", c2);
			List<My_Order> list = new ArrayList<>();
			list.add(o5);
			list.add(o6);
			list.add(o7);
			list.add(o8);
			c2.setOrder(list);
			session.saveOrUpdate(c2);
			session.saveOrUpdate(o5);
			session.saveOrUpdate(o6);
			session.saveOrUpdate(o7);
			session.saveOrUpdate(o8);
			tr.commit();
			session.close();
		}
	}
}