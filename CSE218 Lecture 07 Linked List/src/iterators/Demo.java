package iterators;

public class Demo {

	public static void main(String[] args) {
		//Look on github getting error
		LinkList theList = new LinkList();
		ListIterator iter1 = theList.getIterator();
		
		iter1.insertAfter(21);
		iter1.insertAfter(40);
		iter1.insertAfter(30);
		iter1.insertAfter(7);
		iter1.insertAfter(45);
		
		theList.displayList();
	}

}
