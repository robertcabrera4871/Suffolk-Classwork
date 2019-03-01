package generic_upperBoundConstraints;

public class demo {

	public static void main(String[] args) {
		Point<Integer> p1 = new Point<>(1, 2);
		//not allowed now bc of extends
		//Point<String> p2 = new Point<>("1", "2");
		p1.display(p1);
	}

}
