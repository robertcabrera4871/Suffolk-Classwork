package compareObjects;

public class Country implements Comparable<Country> {
	private String name;
	private Double area;

	public Country(String name, double area) {
		this.name = name;
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String toString() {
		return "Country [name=" + name + ", area=" + area + "]";
	}

	public int compareTo(Country country) {
		//return this.name.compareTo(country.name);
		return this.area.compareTo(country.area);
	}

}
