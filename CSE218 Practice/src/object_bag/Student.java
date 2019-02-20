package object_bag;

public class Student
{
	private int gpa;
	private String name;
	public Student(int gpa, String name) {
		super();
		this.gpa = gpa;
		this.name = name;
	}
	public int getGpa() {
		return gpa;
	}
	public void setGpa(int gpa) {
		this.gpa = gpa;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [gpa=" + gpa + ", name=" + name + "]";
	}
	
	
}
