package Constructor;

public class No_Arg_Constructor {

	int i;

	private No_Arg_Constructor() {
		i = 5;
		System.out.println("Constructor is called");
	}

	public static void main(String[] args) {

		No_Arg_Constructor obj = new No_Arg_Constructor();
		System.out.println("Value of i: " + obj.i);
	}
}
