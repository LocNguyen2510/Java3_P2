package test;

import dao.PersonDAO;
import model.Person;

public class test2 {
	public static void main(String[] args) {

		PersonDAO pr = new PersonDAO();
		Person person1 = new Person("Nguyen Van C", new Date(System.currentTimeMillis()), null);
		pr.insert(person1);
		PersonDAO pd = new PersonDAO();
		Person pr2 = new Person();
		pr2.setId(4);
		pd.delete(pr2);
	}
}
