package queues;

public class QueueX {
	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	private int nElems;

	public QueueX(int maxSize) {
		this.maxSize = maxSize;
		queArray = new long[maxSize];
		front = 0;
		rear = -1;
		nElems = 0;
	}
	public long peakFront() {
		return queArray[front];
	}
	public boolean isEmpty() {
		return nElems == 0;
	}
	public boolean isFull() {
		return nElems == maxSize;
	}

	public int size() {
		return nElems;
	}
	//O(1)
	public void insert(long x) {
		if (rear == maxSize - 1) // wrap around
		{
			rear = -1;
		}
		queArray[++rear] = x;
		nElems++;
	}
	//O(1)
	public long remove() {
		long temp = queArray[front++];
		if (front == maxSize) {
			front = 0;
		}
		nElems--;
		return temp;
	}
}
