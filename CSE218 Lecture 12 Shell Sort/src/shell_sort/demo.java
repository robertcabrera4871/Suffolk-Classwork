package shell_sort;

public class demo {

	public static void main(String[] args) {
		ArraySh shell = new ArraySh(30);
		long[] array = {7, 10, 1, 9, 2, 5, 8, 6, 4, 3, 10, 124, 2, 5, 11, 6, 2, 4,  99, 43, 8, 11, 23, 2, 5};
		for(int i= 0; i < array.length; i++) {
			shell.insert(array[i]);
		}
		shell.display();
		shell.shellSort();
		shell.display();
	}

}
