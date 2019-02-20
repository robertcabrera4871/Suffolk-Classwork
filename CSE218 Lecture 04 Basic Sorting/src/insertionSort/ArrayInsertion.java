package insertionSort;

public class ArrayInsertion {
	private int[] a;
	private int nElems;
	
	public ArrayInsertion(int max) {
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
	public void insertionSort() {
		int in;
		int out;
		//out is 0 because we assume its naturally sorted
		//nElems - 1 is last element
		for(out = 1; out < nElems; out++) {
			int temp = a[out];
			in = out;
			//when condition breaks...
			while(in > 0 && a[in - 1] >= temp) {
				a[in] = a[in - 1];
				in--;
			}
			//...we put the new number where it broke and it is less
			a[in] = temp;
		}
	}
	
}
