package test;

import java.util.List;

import dao.CatDAO;
import model.Cat;

public class test {
	public static void main(String[] args) {
		CatDAO cat_Dao = new CatDAO();
		List<Cat> list = cat_Dao.selectAll();
		for (Cat cat : list) {
			System.out.println(cat);
		}
	}
}
