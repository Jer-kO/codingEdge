package exercises;

public class Ex3 {
	// Basic functions and algorithms
	
	public Ex3() {}
	
	/* Given an array of integers, return the largest integer.
	 * You can assume the array has at least 1 integer.
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
	
	/* Given an array of integers, return the smallest integer.
	 * You can assume the array has at least 1 integer.
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
	
	/* Given an array of integers, return true if the integers
	 * are sorted from smallest to largest
	 * 
	 * ex.
	 * Input: {-4, 1, 3, 5, 6, 100}
	 * Output: true
	 * */
	public static boolean isSorted(int[] ints) {
		if (ints.length < 1) {
			return true;
		}
		int first = ints[0];
		int second;
		for (int i = 1; i < ints.length; i++) {
			second = ints[i];
			if (second < first) {
				return false;
			}
			first = second;
		}
		return true;
	}
	
	/* An easy but inefficient algorithm to sort an array of integers from
	 * smallest to largest is to:
	 * 1) Find the smallest integer between index 0 and the end
	 * 2) Swap the smallest integer into the array index 0
	 * 3) Find the smallest integer between index 1 and the end
	 * 4) Swap the smallest integer into the array index 1
	 * etc...
	 * 
	 * Implement this sorting algorithm.
	 * 
	 * ex.
	 * Input: {-3, -1, 3, 2, 1, 0, -2}
	 * Output: {-3, -2, -1, 0, 1, 2, 3}
	 * */
	public static int[] sortInts(int[] ints) {
		if (ints.length < 1) {
			return ints;
		}

		int minIndex;
		int temp;		
		for (int i = 0; i < ints.length; i++) {
			// Find the smallest index of the smallest 
			// int between index i and the end
			minIndex = i;
			for (int j = i; j < ints.length; j++) {
				if (ints[j] < ints[minIndex]) {
					minIndex = j;
				}
			}

			// Swap the smallest element into position
			temp = ints[i];
			ints[i] = ints[minIndex];
			ints[minIndex] = temp;
		}
		return ints;
	}
	
	/* Given an array of Integers (either 1 or 2), return 1 if there
	 * are four 1's in a row, 2 if there are four 2's in a row, and 0 
	 * otherwise.
	 * 
	 * Note: an algorithm similar to this can be used to see if a player
	 * wins in a game of Connect 4.
	 * 
	 * ex.
	 * Input: {2, 1, 1, 1, 1, 2, 1}
	 * Output: true
	 * 
	 * */
	public static int fourInARow(int[] row) {
		String rowString = "";
		for (int i = 0; i < row.length; i++){
			rowString = rowString.concat(Integer.toString(row[i]));
		}
		
		if (rowString.contains("1111")) {
			return 1;
		} else if (rowString.contains("2222")) {
			return 2;
		}
		return 0;
	}

}
