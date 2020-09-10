package abstracts;

public class Cat extends Animal {
	private String name;

	public Cat() {
	}

	public Cat(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	void sayHi() {
		System.out.println("Hi, " + this.name);
	}

}
