package doubleLinkLinkedList;

public class doubleLinkedList {
	private Link first;
	private Link last;
	
	public doubleLinkedList() {
		first = null;
		last = null;
	}
	public Link deleteLast() {
		Link temp = last;
		if(first.next == null) {
			first = null;
		}
		last.previous.next = null;
		last = last.previous;
		return temp;
	}
	public Link deleteFirst() {
		Link temp = first;
		if(first.next == null) {
			last = null;
		}
		first.next.previous = null;
		first = first.next;
		return temp;
	}
	public void insertLast(long dData) {
		Link newLink = new Link(dData);
		if(isEmpty()) {
			first = newLink;
		}
		last.next = newLink;
		newLink.previous = last;
		last = newLink;
	}
	public void insertFirst(long dData) {
		Link newLink = new Link(dData);
		if(isEmpty()) {
			last = newLink;
		}
		first.previous = newLink;
		newLink.next = first;
		first = newLink;
	}
	public boolean isEmpty() {
		return first == null;
	}
}
