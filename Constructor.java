package Constructor;

public class Constructor {
	private String name;

	Constructor() {
		System.out.println("Constructor Called:");
		name = "Programiz";
	}

	public static void main(String[] args) {

		Constructor obj = new Constructor();
		System.out.println("The name is " + obj.name);
	}
}
