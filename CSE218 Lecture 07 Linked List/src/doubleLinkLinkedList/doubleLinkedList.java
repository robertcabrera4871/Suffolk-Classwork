package doubleLinkLinkedList;

public class doubleLinkedList {
	private Link first;
	private Link last;
	
	public doubleLinkedList() {
		first = null;
		last = null;
	}
	public boolean insertBefore(long key, long dData) {
		Link current = first;
		while(current.dData != key) {
			current = current.next;
			if(current == null) {
				return false;
			}
		}
		
		Link newLink = new Link(dData);
		
		if(current == first) {
			newLink.next = first;
			first.previous = newLink;
			first = newLink;
		} else {
			newLink.next = current;
			current.previous.next = newLink;
			newLink.previous = current.previous;
			current.previous = newLink;
		}
		return true;
	}
	public boolean insertAfter(long key, long dData) {
		Link current = first;
		while(current.dData != key) {
			current = current.next;
			if(current == null) {
				return false;
			}
		}
		Link newLink = new Link(dData);
		if(current == last) {
			newLink.next = null;
			last = newLink;
		} else {
			newLink.next = current.next;
			current.next.previous = newLink;
		}
		newLink.previous = current;
		current.next = newLink;
		return true;
	}
	public Link deleteKey(long key) {
		Link current = first;
		while(current.dData != key) {
			current = current.next;
			if(current == null) {
				return null;
			}
		}
		if(current == first) {
			first = current.next;
		} else {
			current.previous.next = current.next;
		}
		
		if(current == last) {
			last = current.previous;
		} else {
			current.next.previous = current.previous;
		}
		return current;
	}
	
	public void displayForward() {
		System.out.println("list (first --> last:) \n");
		Link current = first;
		while(current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println();
	}
	public void displayBackwards() {
		System.out.println("list (last --> first:) \n");
		Link current = first;
		while(current != null) {
			current.displayLink();
			current = current.previous;
		}
		System.out.println();
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
		else {
		first.previous = newLink;
		}
		newLink.next = first;
		first = newLink;
	}
	public boolean isEmpty() {
		return first == null;
	}
}
