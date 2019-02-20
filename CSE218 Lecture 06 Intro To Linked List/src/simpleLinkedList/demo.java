package simpleLinkedList;

public class demo {

	public static void main(String[] args) {
		LinkList theList = new LinkList();
		
		theList.insert(22,  22.22);
		theList.insert(33,  33.33);
		theList.insert(55,  55.55);
		theList.insert(11,  11.11);
		
		theList.displayList();
		
		Link f = theList.find(33);
		f.displayLink();
		
		Link d = theList.delete(55);
		d.displayLink();
		
		System.out.println(theList.isEmpty());
		
		theList.displayList();
	}

}
