package simpleLinkedList;

public class LinkList {
	private Link first;

	public LinkList() {
		first = null;
	}
	public void displayList() {
		System.out.println("-----------------------");
		System.out.println("List (First --> Last): ");
		Link current = first;
		while(current != null) {
			current.displayLink();
			current = current.getNext();
		}
		System.out.println("-----------------------");
	}
	public Link delete(int key) {
		Link current = first;
		Link previous = first;
		while(current.getiData() != key) {
			if (current.getNext() == null) {
				return null;
			} else {
				previous = current;
				current = current.getNext();
			}
		}
		if(current == first) {
			first = first.getNext();
		} else {
			previous.setNext(current.getNext());
		}
		return current;
	}
	public Link find(int key) {
		Link current = first;
		while(current.getiData() != key) {
			if(current.getNext() == null) {
				return null;
			} else {
				current = current.getNext();
			}
		}
		return current;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insert(int i, double d) {
		Link newLink = new Link(i, d);
		newLink.setNext(first);
		first = newLink;
	}

	public Link deleteFirst() {
		Link temp = first;
		first = first.getNext();
		return temp;
	}
}
