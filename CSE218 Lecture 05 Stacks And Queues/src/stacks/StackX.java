package stacks;

public class StackX {
	private long[] stackArray;
//	private int nElems;
	private int maxSize;
	private int top;

	public StackX(int maxSize) {
		this.maxSize = maxSize;
		this.stackArray = new long[maxSize];
		top = -1;
	}
	//O(1)
	public void push(long n) {
		stackArray[++top] = n;
	}
	//O(1)
	public long pop() {
		return stackArray[top--];
	}

	public long peek() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}
	public boolean isFull() {
		return top == maxSize - 1;
	}
}
