package int_bag;

public class NestedLoop {

	public static void main(String[] args) 
	{	
		int n = 10;
		//for every i repeat j n times, 10^2 = 100;
		//BigO = n^2
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println("\n");
		}
		//No such index 5, but compiler allows, unchecked exception still crashes, red lines are checked
//		int[] numbers = new int[5];
//		numbers[5] = 1000;
	}
	

}
