package array_practice;

public class Student 
{
	int id;
	String name;
	String major;
	Boolean gender;
	
	public Student(int id, String name, String major, Boolean gender)
	{
		this.id = id;
		this.name = name;
		this.major = major;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Boolean getGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", major=" + major + ", gender=" + gender + "]";
	}
	
	
}
