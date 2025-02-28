package test;

import java.sql.Date;

import dao.PersonDAO;
import model.Person;

public class test2 {
	public static void main(String[] args) {
//		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//		if (sessionFactory != null) {
//			Session session = sessionFactory.openSession();
//			Transaction tr = session.beginTransaction();
//			// thực thi câu lệnh HQL
//			String hql = "SELECT p.id, p.name, p.spouse.id, p.spouse.name FROM Person p";
//			List<Object[]> result = session.createQuery(hql).list();
//			for (Object[] rs : result) {
//				String id = rs[0] + "";
//				String name = rs[1] + "";
//				String spouseId = rs[2] + "";
//				String spouseName = rs[3] + "";
//				System.out.println(name + "(" + id + ")" + " is married with " + spouseName + "(" + spouseId + ")");
//			}
//			tr.commit();
//			session.close();
//		}
		PersonDAO pr = new PersonDAO();
		Person person1 = new Person("Nguyen Van C", new Date(System.currentTimeMillis()), null);
		pr.insert(person1);
	}
}
