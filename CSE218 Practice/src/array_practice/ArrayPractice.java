package array_practice;

public class ArrayPractice {
/*Need to add:
 * - remove function
 * - sort function
 * - Iterator*/
	public static void main(String[] args)
	{
		Student student1 = new Student(1, "Robert", "Comsci", true);
		Student student2 = new Student(1, "Robert", "Comsci", true);
		Student student3 = new Student(1, "Robert", "Comsci", true);
		Student student4 = new Student(1, "Robert", "Comsci", true);
		Student student5 = new Student(116, "Robert", "Comsci", true);
		Student student6 = new Student(1, "Robert", "Comsci", true);
		Student student7 = new Student(1, "Robert", "Comsci", true);
		Student student8 = new Student(1, "Robert", "Comsci", true);
		Student student9 = new Student(1, "Robert", "Comsci", true);
		Student student10 = new Student(1, "Robert", "Comsci", true);
		Student student11 = new Student(11, "Robert", "Comsci", true);
		
		
		StudentBag bag = new StudentBag(10);
		
		System.out.println("Is bag empty? " + bag.isEmpty());
		
		bag.add(student1);
		bag.add(student2);
		bag.add(student3);
		bag.add(student4);
		bag.add(student5);
		bag.add(student6);
		bag.add(student7);
		bag.add(student8);
		bag.add(student9);
		bag.add(student10);
		bag.add(student11);
	
		
		System.out.println("Is bag empty? " + bag.isEmpty());
		
		bag.remove(student5);
		
		bag.displayStudents();
	}

}
