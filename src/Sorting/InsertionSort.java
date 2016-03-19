package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 *
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] unsortedArray) {

		for(int i = 0; i < unsortedArray.length; i++){
			int j = unsortedArray[i];
			int step = i;
			while(j > unsortedArray[step-1]){
				int temp = unsortedArray[step -1];
				unsortedArray[step - 1] = j;
				unsortedArray[step] = temp;
				step --;
			}
		}

		return unsortedArray;
	}
}
