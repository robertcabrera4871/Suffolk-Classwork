package merge_sort;

public class DArray {
	private long[] theArray;
	private int nElems;

	public DArray(int max) {
		theArray = new long[max];
		nElems = 0;
	}

	public void mergeSort() {
		long[] workSpace = new long[nElems];
		recursiveMergeSort(workSpace, 0, nElems - 1);
	}

	private void recursiveMergeSort(long[] workSpace, int lowerBound, int upperBound) {
		if(lowerBound == upperBound) {
			return;
		} else {
			int mid = (lowerBound + upperBound) / 2;
			recursiveMergeSort(workSpace, lowerBound, mid);
			recursiveMergeSort(workSpace, mid+1, upperBound);
			merge(workSpace, lowerBound, mid+1, upperBound);
		}
	}

	private void merge(long[] workSpace, int lowPtr, int highPtr, int upperBound) {
		int j = 0;
		int lowerBound = lowPtr;
		int mid = highPtr - 1;
		int n = upperBound - lowerBound + 1; //number of items
		
		while(lowPtr <= mid && highPtr <= upperBound) {
			if(theArray[lowPtr] < theArray[highPtr]) {
				workSpace[j++] = theArray[lowPtr++];
 			} else {
 				workSpace[j++] = theArray[highPtr++];
 			}
		}
		
		while(lowPtr <= mid) { //high half is empty
			workSpace[j++] = theArray[lowPtr++];
		}
		while(highPtr <= upperBound) { //low half is empty
			workSpace[j++] = theArray[highPtr++];
		}
		for(int i = 0; i < n; i++) {
			theArray[lowerBound + i] = workSpace[i]; 
		}
	}

	public void insert(long value) {
		theArray[nElems++] = value;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(theArray[i] + ", ");
		}
		System.out.println();
	}
}
