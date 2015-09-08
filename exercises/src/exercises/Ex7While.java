package exercises;

public class Ex7While {
	
	public Ex7While() {}
	
	/* Given an array of integers and an integer i, return the smallest index
	 * of the integer i in the array. If i is not in the array, return -1.
	 * 
	 * ex.
	 * Input: {0, 0, 1, 5, -3, 5, 7}, i = 5
	 * Output: 3
	 * */
	public static int q1_findIndexOfInt(int[] arr, int i) {
		int x = 0;
		while (x < arr.length) {
			if (arr[x] != i) {
				x++;
			} else {
				return x;
			}
		}
		return -1;
	}
	
	
	/* Given an array of integers, return the number of 0s at the
	 * start of the array
	 * 
	 * Note: This function can be written using a for loop, although
	 * you will be forced to look through the entire array
	 * 
	 * ex.
	 * Input: {0, 0, 1, 5, -3}
	 * Output: 2
	 * */
	public static int q2_zerosAtStart(int[] arr) {
		int startingZeros = 0;
		int i = 0;
		while (i < arr.length && arr[i] == 0) {
			startingZeros++;
			i++;
		}
		return startingZeros;
	}
	
}
