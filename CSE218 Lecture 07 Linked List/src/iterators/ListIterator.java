package iterators;

public class ListIterator {
	private Link current;
	private Link previous;
	private LinkList ourList;
	
	public ListIterator(LinkList list) {
		this.ourList = list;
		//set the current to the first, move cursor to beginning of the list
		//Hiding complexity, chains current to first
		reset();
	}
	public void insertAfter(long dd) {
		Link newLink = new Link(dd);
		if(ourList.isEmpty()) {
			ourList.setFirst(newLink);
			current = newLink;
		} else {
			newLink.next = current.next;
			current.next = newLink.next;
			nextLink();
		}
	}
	public void insertBefore(long dd) {
		Link newLink = new Link(dd);
		if(previous == null) { // at the beginning or empty list
			newLink = ourList.getFirst();
			ourList.setFirst(newLink);
			reset();
		} else {
			newLink.next = previous.next;
			previous.next = newLink;
			current = newLink;
		}
	}
	public long deleteCurrent() {
		long value = current.dData;
		if(previous == null) { //beginning of the list
			ourList.setFirst(current.next);
			reset();
		} else {
			previous.next = current.next;
			if(atEnd()) {
				reset();
			} else {
				current = current.next;
			}
			
		}
		return value;
	}
	public void reset() {
		current = ourList.getFirst();
		previous = null;
	}
	public boolean atEnd() {
		return current.next == null;
	}
	public void nextLink() {
		previous = current;
		current = current.next;
	}
	public Link getCurrent() {
		return current;
	}
	
}
