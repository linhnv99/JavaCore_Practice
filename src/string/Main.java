package string;

public class Main {
	public static void main(String[] args) {
		// == so sánh địa chỉ vùng nhớ
		// .equals() so sánh về mặt nội dung của chuỗi
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");
		String s4 = new String("hello");

		System.out.println(s1 == s2);// instance giống nhau
		System.out.println(s1 == s3);
		System.out.println(s3 == s4);
		System.out.println(s1.equals(s4));

		/*- String là immutable(bất biến) không thể thay đổi
		 * mỗi lần nối 1 chuối mới bằng toán tử + sẽ tạo ra 1 instance mới của string (tốn bộ nhớ, chậm hơn buffer và buider)
		 * 
		 * - StringBuffer: (mutable)- đồng bộ áp - sync
		 * 
		 * - StringBuilder: (mutable)- bất đồng bộ - async
		 * 
		 * */

		StringBuffer sbuffer = new StringBuffer("Hello world");// mặc định 16 kí tự, tự động co dãn nếu chuỗi dài ra
		System.out.println(sbuffer.append(" abc xyz"));
//		System.out.println(sbuffer.reverse());
		System.out.println(sbuffer.insert(2, " chèn "));
		System.out.println(sbuffer.delete(sbuffer.length() - 5, sbuffer.length()));
		
		StringBuilder sbuilder = new StringBuilder(sbuffer);
		// tương tự
	}
}
