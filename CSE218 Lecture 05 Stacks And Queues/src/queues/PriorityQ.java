package queues;

public class PriorityQ {
	private int maxSize;
	private long[] queArray;
	private int nElems;
	
	public PriorityQ(int maxSize) {
		this.maxSize = maxSize;
		nElems = 0;
		queArray = new long[maxSize];
 	}
	
	public void insert(long item) {
		int j;
		if(nElems == 0) {//empty
			queArray[nElems++] = item;//insert at index 0
		} else {// if not empty
			for(j = nElems - 1; j >= 0; j--) {//start at end
				if(item > queArray[j]) {//shift upward
					queArray[j+1] = queArray[j];
				} else {
					break;
				}
			} //end for
			queArray[j+1] = item;//insert item
			nElems++;
		}
	}
	public long remove() {
		return queArray[--nElems];
	}
	public long peekMin() {
		return queArray[nElems - 1];
	}
	public boolean isEmpty() {
		return nElems == 0;
	}
	public boolean isFull() {
		return nElems == maxSize;
	}
	
}
