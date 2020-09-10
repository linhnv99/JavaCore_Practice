package interfaces;

public class C implements A, B{

	@Override
	public void print() {
		System.out.println("C");
	}

	@Override
	public void sayHiA() {
		System.out.println("Hello A");
	}
}
