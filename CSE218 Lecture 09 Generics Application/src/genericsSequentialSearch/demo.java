package genericsSequentialSearch;

public class demo {

	public static void main(String[] args) {
		String[] letters = {"A", "B", "C", "D"};
		Integer[] numbers = {1, 2, 3, 4, 5, 6};
		System.out.println(sequentialSearch(letters, "C"));
		System.out.println(sequentialSearch(numbers, 4));
	}

	public static <E extends Comparable<E>> int sequentialSearch(E[] array, E value) {
		int index = 0;
		int position = -1;
		boolean found = false;
		
		while(!found && index < array.length) {
			if(array[index].compareTo(value) == 0) {
				found = true;
				position = index;
			}
			index++;
		}
		return position;
	}
}
