package exercises;

public class Ex3 {
	// Basic functions and algorithms
	
	public Ex3() {}
	
	/* Given an array of integers, return the largest integer
	 * 
	 * ex.
	 * Input: {3, 5, -2, 10}
	 * Output: 10
	 * */
	public static int findMax(int[] ints) {
		if (ints.length < 1) {
			return 0;
		}
		int max = ints[0];
		
		for (int i = 1; i < ints.length; i++) {
			if (ints[i] > max) {
				max = ints[i];
			}
		}
		return max;
	}
	
	/* Given an array of integers, return the smallest integer
	 * 
	 * ex.
	 * Input: {3, 5, -2, 10}
	 * Output: -2
	 * */
	public static int findMin(int[] ints) {
		if (ints.length < 1) {
			return 0;
		}
		int min = ints[0];
		
		for (int i = 1; i < ints.length; i++) {
			if (ints[i] < min) {
				min = ints[i];
			}
		}
		return min;
	}
}
