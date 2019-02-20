package selectionSort;

public class ArraySelection {
	private int[] a;
	private int nElems;
	
	public ArraySelection(int max) {
		a = new int[max];
		nElems = 0;		
	}
	
	public void insert(int n) {
		a[nElems++] = n;
	}
	
	public void display()
	{
		for(int i = 0; i < nElems; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	public void selectionSort()
	{
		//index of last element is nElemes + 1
		//Big0 = n^2
		int out;
		int in;
		//index value of smallest value
		int min = 0;
		for(out = 0; out < nElems - 1; out++){
			min = out;
			for(in = out + 1; in < nElems; in++) {
				if(a[in] < a[min]) {
					min = in;
				}
			}
			
			swap(out, min);
		}
	}

	private void swap(int one, int two) {
		int temp = a[one];
		a[one] = a[two];
		a[two] = temp;	
	}
}
