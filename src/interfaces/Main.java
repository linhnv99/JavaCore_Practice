package interfaces;

public class Main {
	public static void main(String[] args) {
		A a = new C();
		a.print();
		a.sayHiA();
		
	}
	/*
	 * Interface 
	 * - interface trong Java là một tập hợp các phương thức trừu tượng (abstract)
	 * 
	 * 1. Tất cả phương thức đều phải là public
	 * 2. Không thể khởi tạo interface bằng new
	 * 3. Không có constructor.
	 * 4. Một interface có thể kế thừa từ 1 interface khác
	 * 5. Có thể đa kế thừa
	 * 6. Có thể  lồng Interface 
	 *  Chú y: Trong 1 interface chi có bien final và static. mặc định java sẽ gắn thêm public
	 *  trước các phương thức của interface
	 * 
	 * */
	
	
	
}
