package int_bag;
// 1/31/2019
public class Bag {
	
	private int[] array;
	private int nElems;
	private int maxSize;
	
	//Effort to create bag is not proportional or dependent on the size of the array
	//BigO = 1, constant
	public Bag(int maxSize)
	{
		array = new int[maxSize];
		nElems = 0;
		this.maxSize = maxSize;
	}
	//BigO = 1, constant
	public void add(int number)
	{
		//1 step add ++ to nElems same as two step
		array[nElems++] = number;
		//2 step
		//nElems++;
	}
	//BigO = 1
	public boolean isFull()
	{
		if(nElems == maxSize)
		{
			return true;
		}
		return false;
	}
	//BigO = n, depends on number of items, nElems
	public void display()
	{
		for(int i = 0; i < nElems; i++)
		{
			System.out.println(array[i]);
		}	
	}
	//BigO = n, but could have luck with finding number. Average is n/2. Same order of magnitude, BigO still n
	public boolean find(int number)
	{
		for(int i = 0; i < nElems; i++)
		{
			if(array[i] == number)
			{
				return true;
			}
		}
		return false;
	}
	//BigO = n, technically + n, but still drop
	public boolean delete(int number)
	{
		int count = 0;
		for(count = 0; count < nElems; count++)
		{
			if(array[count] == number)
			{
				break;
			}
		}
		//Either one or the other for the +1, dropped anyways
		//BigO = 1
		if(count ==  nElems) {
			return false;
		} 
		//BigO = n
		else {
			for(int i = count; i < nElems - 1; i++)
			{
				array[i] = array[i + 1];
			}
			nElems--;
			return true;
		}
	}
	
}
