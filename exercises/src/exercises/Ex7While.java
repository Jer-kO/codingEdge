package exercises;

public class Ex7While {
	
	public Ex7While() {}
	
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
	public static int q1_zerosAtStart(int[] arr) {
		int startingZeros = 0;
		int i = 0;
		while (i < arr.length && arr[i] == 0) {
			startingZeros++;
			i++;
		}
		return startingZeros;
	}
	
}
