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
		Cat c = new Cat();
		c.setId(1);
		Cat c1 = cat_Dao.selectById(c);
		System.out.println(c1);

	}
}
