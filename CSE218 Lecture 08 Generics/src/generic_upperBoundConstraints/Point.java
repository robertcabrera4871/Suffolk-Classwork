package generic_upperBoundConstraints;

//extends Number CONSTRAINS t to a number and its subclasses
public class Point<T extends Number> {
	private T x;
	private T y;

	public Point(T x, T y) {
		super();
		this.x = x;
		this.y = y;
	}

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	public T getY() {
		return y;
	}

	public void setY(T y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public void display(Point point) {
		System.out.println(point);
	}
}
