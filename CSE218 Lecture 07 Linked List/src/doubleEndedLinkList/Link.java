package doubleEndedLinkList;

public class Link {
	//Just public for purposes of the class no get/set
	public double dData;
	public Link next;
	
	public Link(double dData) {
		this.dData = dData;
		next = null;
	}
	
	public void displayLink() {
		System.out.print(dData + " ");
	}
}
