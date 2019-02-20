package array_practice;

public class StudentBag 
{
	int bagLength;
	int count = 0;
	Student[] students;
	
	public boolean isEmpty()
	{
		return students[0] == null;
	}
	
	public StudentBag(int bagLength)
	{
		this.bagLength = bagLength;
		students = new Student[bagLength]; 
	}
	
	public void add(Student s)
	{
		try {
			students[count] = s;
			count++;
			System.out.println("Student " + s.name + " succesfully added");
		}
		catch(Exception e)
		{
			System.out.println("Error: Bag is full, cannot add more elements");
		}
	}
	
	public void remove(Student s)
	{
//		int n = 0;
		try {
			for(int i = 0; i < bagLength; i++)
			{
				if(students[i].id == s.id)
				{
					students[i] = null;
				}
			}
		}catch(Exception e)
		{
			System.out.println("Error: Could not find Student");
		}
	}
	
	public void displayStudents() throws NullPointerException
	{
//		int n = 0;
		try {
		for(int i = 0 ; i < students.length;i++)
		{
		
		}
		}
		catch(NullPointerException e)
		{
			System.out.println("Empty Spot");
		}
		
	}
}
