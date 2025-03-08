package test;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Author;
import model.Book;
import util.HibernateUtil;

public class test {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		if (sessionFactory != null) {
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();

//			Author author_1 = new Author("001", "Nguyen Nhat Anh", new Date(System.currentTimeMillis()));
//			Book b1 = new Book("B01", "Trên Đường Băng", 50000, author_1);
//			Book b2 = new Book("B02", "Tôi thấy hoa vàng trên cỏ xanh", 71000, author_1);
//			Book b3 = new Book("B03", "Tôi là Bêtô", 66000, author_1);
//
//			session.saveOrUpdate(author_1);
//			session.saveOrUpdate(b1);
//			session.saveOrUpdate(b2);
//			session.saveOrUpdate(b3);
			Author author_2 = new Author("002", "Napoleon Hill", new Date(System.currentTimeMillis()));
			Book b4 = new Book("B01", "Bí Quyết Làm Giàu Của Napolenon Hill", 64000, author_2);
			Book b5 = new Book("B02", "Sói Già Phố Wall", 120000, author_2);
			Book b6 = new Book("B03", "Chiến Thắng Con Quỷ Trong Bạn", 99000, author_2);

			session.saveOrUpdate(author_2);
			session.saveOrUpdate(b4);
			session.saveOrUpdate(b5);
			session.saveOrUpdate(b6);

			tr.commit();
			session.close();
		}
	}
}