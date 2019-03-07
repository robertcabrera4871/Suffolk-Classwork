package merge;

public class MergeApp {

	public static void main(String[] args) {
		int[] arrayA = {1, 3, 6, 8, 10};
		int[] arrayB = {4, 7, 11, 13, 16, 17, 28 , 31, 33};
		int[] arrayC = new int[arrayA.length + arrayB.length]; 
		
		merge(arrayA, arrayA.length, arrayB, arrayB.length, arrayC);
		display(arrayC, arrayC.length);

	}

	private static void merge(int[] arrayA, int lengthA, int[] arrayB, int lengthB, int[] arrayC) {
		int aIndex = 0;
		int bIndex = 0;
		int cIndex = 0;
		while(aIndex < lengthA && bIndex < lengthB) { //neither arrayA nor arrayB is finished
			if(arrayA[aIndex] < arrayB[bIndex]) {
				arrayC[cIndex++] = arrayA[aIndex++];
			} else {
				arrayC[cIndex++] = arrayB[bIndex++];
			}
		}
		while(aIndex < lengthA) { //arrayB is empty but arrayA isn't
			arrayC[cIndex++] = arrayA[aIndex++];
		}
		while(bIndex < lengthB) { //arrayA is empty but arrayB isn't
			arrayC[cIndex++] = arrayB[bIndex++];
		}
	}

	private static void display(int[] arrayC, int length) {
		for(int i = 0; i < length; i++) {
			System.out.println(arrayC[i] + " ");
		}
		System.out.println();
	}

}
