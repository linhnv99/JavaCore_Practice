package abstracts;

public abstract class Animal {
	String name = "Animal";
	
	void eating() {
		System.out.println("eating");
	}
	
	abstract void sayHi();
}
