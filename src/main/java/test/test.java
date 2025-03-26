package test;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.ChiTietDonHang;
import model.DonHang;
import util.HibernateUtil;

public class test {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		if (sessionFactory != null) {
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			DonHang dh1 = new DonHang();
			dh1.setTenKhachHang("Nguyen Dinh Loc");
			dh1.setNgayMua(new Date(125, 1, 20));
			ChiTietDonHang ctdh1 = new ChiTietDonHang();
			ctdh1.setTenSanPham("Iphone 12");

			tr.commit();
			session.close();
		}
	}
}