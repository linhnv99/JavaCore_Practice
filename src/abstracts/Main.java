package abstracts;

public class Main {
	public static void main(String[] args) {
//		Animal a = new Animal(); // sai vì không thể khởi tạo trực tiếp đối tượng abstract class bằng từ khóa new
		Animal c = new Cat("Cat");
		c.sayHi();
		c.eating();
	}
	
	/*
	 * Abstract class:
	 * 1- Đc khai bao abstract 
	 * 2- có  0,1 or nhiều phương thức abstract.
	 * 3- Không thể khởi tạo đối tượng trực tiếp bằng từ khóa new 
	 * 
	 * */
}
