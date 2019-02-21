package doubleEndedLinkList;

public class FirstLastLinkList {
	private Link first;
	private Link last;
	
	public FirstLastLinkList() {
		first = null;
		last = null;
	}
	public double deleteFirst() {
		double temp = first.dData;
		if(first.next == null) {
			last = null;
		}
		first = first.next;
		return temp;
	}
	public void displayList() {
		Link current = first;
		while(current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println();
	}
	public void insertLast(double dData) {
		Link newLink = new Link(dData);
		if(isEmpty()) {
			first = newLink;
		}
		last.next = newLink;
		last = newLink;
	}
	public void insertFirst(double dData) {
		Link newLink = new Link(dData);
		if(isEmpty()) {
			last = newLink;
		}
		newLink.next = first;
		first = newLink;
	}
	public boolean isEmpty() {
		return first == null;
	}
}
