package stackOverflowError;

public class Demo {

	static int n = 0;

	public static void main(String[] args) {
		displayHello();
	}

	private static void displayHello() {
		n++;
		if (n > 5) { //base case
			return;
		}
		System.out.println("Hello");
		displayHello();
	}
}
