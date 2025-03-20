package test;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.NhanVien;
import util.HibernateUtil;

public class test {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		if (sessionFactory != null) {
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			NhanVien nv1 = new NhanVien("NV1", "Nguyen Dinh Loc", new Date(2001, 10, 12));
			session.save(nv1);
			tr.commit();
			session.close();
		}
	}
}