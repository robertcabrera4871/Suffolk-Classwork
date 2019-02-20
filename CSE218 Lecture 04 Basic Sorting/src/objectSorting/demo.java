package objectSorting;

public class demo {

	public static void main(String[] args) {
		int maxSize = 100;
		ArrayInOb arr = new ArrayInOb(maxSize);
		
		arr.insert("Berners-Lee", "Tim", (2019 - 1955));
		arr.insert("Job", "Steve", (2011 - 1955));
		arr.insert("Gates", "Bill", (2019 - 1955));
		arr.insert("Einstein", "Albert", (1955 - 1879));
		arr.insert("Maxwell", "James", (1879 - 1831));
		arr.insert("Newton", "Isaac", (1727 - 1642));
		arr.insert("Gallilei", "Galileo", (1642 - 1564));
		
		System.out.println("Before Sorting: ");
		arr.display();
		arr.insertionSort();
		System.out.println("After Sorting: ");
		arr.display();
	}

}
