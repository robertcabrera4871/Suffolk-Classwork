package doubleLinkLinkedList;

public class Demo {

	public static void main(String[] args) {
		doubleLinkedList dl = new doubleLinkedList();
		dl.insertFirst(22);
		dl.insertFirst(44);
		dl.insertFirst(66);
		
		dl.displayForward();
		dl.deleteKey(44);
		dl.displayForward();
		
		dl.insertBefore(22, 55);
		dl.displayForward();
	}

}
