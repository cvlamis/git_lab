package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		//TODO: S1 implements bubble sort
		for (int i = 0; i < unsortedArray.length; i++) {
		    for (int j = 1; j < unsortedArray.length; j++) {
		        if (unsortedArray[j] < unsortedArray[j-1]) {
		            int temp = unsortedArray[j];
		            unsortedArray[j] = unsortedArray[j-1];
		            unsortedArray[j-1] = temp;
		        }
		    }
		}
		return unsortedArray;
	}
}
