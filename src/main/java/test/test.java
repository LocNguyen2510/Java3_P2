package test;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.CuocHop;
import model.NhanVien;
import util.HibernateUtil;

public class test {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		if (sessionFactory != null) {
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			NhanVien nv1 = new NhanVien("NV1", "Nguyen Dinh Loc", new Date(2001, 10, 12));
			// session.save(nv1);
			CuocHop ch1 = new CuocHop();
			ch1.setTenCuocHop("Hop Hoi Dong Quan Tri Cong Ty");
			ch1.setThoiGian(new Date(2025, 03, 20));
			ch1.setDiaDiem("Phong Hop 1");
			ch1.addNhanVien(nv1);
			session.save(ch1);
			tr.commit();
			session.close();
		}
	}
}