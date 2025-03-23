package test;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.GiaoVien;
import model.SinhVien;
import util.HibernateUtil;

public class test {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		if (sessionFactory != null) {
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			GiaoVien gv1 = new GiaoVien("GV1", "Nguyen Dinh Loc", new Date(2001, 12, 30), "Toan");
			SinhVien sv1 = new SinhVien("SV1", "Nguyen Quang Minh", new Date(2005, 2, 12), 4.12);
			session.save(gv1);
			session.save(sv1);
			tr.commit();
			session.close();
		}
	}
}