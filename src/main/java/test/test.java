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
			for (int i = 0; i < 10000; i++) {

				ChiTietDonHang ctdh1 = new ChiTietDonHang();
				ctdh1.setTenSanPham(i + " Iphone 12");
				ctdh1.setGiaBan(13000000);
				ctdh1.setSoLuong(2);
				ctdh1.setThanhTien(ctdh1.getGiaBan() * ctdh1.getSoLuong());
				ctdh1.setDonHang(dh1);
				dh1.addCTDH(ctdh1);
			}
			session.save(dh1);
//			ChiTietDonHang ctdh2 = new ChiTietDonHang();
//			ctdh2.setTenSanPham("Iphone 13");
//			ctdh2.setGiaBan(15300000);
//			ctdh2.setSoLuong(4);
//			ctdh2.setThanhTien(ctdh2.getGiaBan() * ctdh2.getSoLuong());
//			ctdh2.setDonHang(dh1);
//			dh1.addCTDH(ctdh1);
//			dh1.addCTDH(ctdh2);
//			session.save(dh1);
//			DonHang dh = session.load(DonHang.class, 1);
//			session.remove(dh);
			long batDau = System.currentTimeMillis();
			DonHang dh = session.load(DonHang.class, 1);
			System.out.println(dh.toString());
			long ketThuc = System.currentTimeMillis();
			System.out.println("Thời gian thực hiện là : " + (ketThuc - batDau));
			tr.commit();
			session.close();
		}
	}
}