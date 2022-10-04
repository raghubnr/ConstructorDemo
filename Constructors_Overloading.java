package Constructor;

public class Constructors_Overloading {

	String language;

	Constructors_Overloading() {
		this.language = "Java";
	}

	Constructors_Overloading(String language) {
		this.language = language;
	}

	public void getName() {
		System.out.println("Programming Langauage: " + this.language);
	}

	public static void main(String[] args) {

		Constructors_Overloading obj1 = new Constructors_Overloading();

		Constructors_Overloading obj2 = new Constructors_Overloading("Python");

		obj1.getName();
		obj2.getName();
	}
}
