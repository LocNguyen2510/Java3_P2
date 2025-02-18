package test;

import dao.CatDAO;
import model.Cat;

public class test {
	public static void main(String[] args) {
		CatDAO cat_Dao = new CatDAO();
//		List<Cat> list = cat_Dao.selectAll();
//		for (Cat cat : list) {
//			System.out.println(cat);
//		}
//		Cat c = new Cat();
//		c.setId(2);
//		Cat c2 = cat_Dao.selectById(c);
//		System.out.println(c2);
//	}

		// Test insert
//		Cat c3 = new Cat("Jerry 2", new Date(System.currentTimeMillis()), true);
//		c3.setId(3);
////		cat_Dao.insert(c3);
//		cat_Dao.delete(c3);
		Cat cat1 = new Cat();
		cat1.setId(1);
//		cat_Dao.selectById(cat1);
		System.out.println(cat1);
	}
}