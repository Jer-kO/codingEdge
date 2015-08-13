package exercises;

public class Ex2 {
	// Questions for if statements and for-loops
	
	public Ex2() {}
	
	/* Given an integer, return true if it is greater than 0,
	 * false otherwise
	 * 
	 * ex.
	 * Input: 0
	 * Output: false
	 * */
	public static boolean ifQ1(int num) {
		if (num > 0) {
			return true;
		}
		return false;
	}
	
	/* Given a string and an integer, return the larger number between
	 * the length of the string and the integer
	 * 
	 * ex.
	 * Input: "Long string", 3
	 * Output: 11
	 * */
	public static int ifQ2(String str, int num) {
		int strLength = str.length();
		if (strLength > num) {
			return strLength;
		} else {
			return num;
		}
	}
	
	/* Given an integer between 1 and 7, return the name
	 * of the corresponding day of the week.  Assume that
	 * "Monday" is corresponds to the number 1.
	 * 
	 * (If the integer is not between 1 and 7, you may return
	 * "Invalid day")
	 * 
	 * Input: 2
	 * Output: "Tuesday"
	 * */
	public static String ifQ3(int day) {
		if (day == 1) {
			return "Monday";
		} else if (day == 2) {
			return "Tuesday";
		} else if (day == 3) {
			return "Wednesday";
		} else if (day == 4) {
			return "Thursday";
		} else if (day == 5) {
			return "Friday";
		} else if (day == 6) {
			return "Saturday";
		} else if (day == 7) {
			return "Sunday";
		} else {
			return "Invalid day";
		}
	}
	
	/* Given an positive integer n, return a string with n number of 1's
	 * 
	 * Input: 4
	 * Console Output: "1111"
	 * */
	public static String forQ1(int n) {
		String ones = "";
		for (int i = 0; i < n; i++) {
			ones = ones + "1";
		}
		return ones;
	}
	
	/* Given an array of integers, return true if there is an
	 * integer in the array that is larger than 10
	 * 
	 * Input: {1, -3, 5, -7, 9, -11, 13};
	 * Console Output: true
	 * */
	public static boolean forQ2(int[] strArr) {
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i] > 10) {
				return true;
			}
		}
		return false;
	}
	
	/* Given a non-empty array of integers, 
	 * return the largest integer in the array
	 * 
	 * Input: {1, -4, 10, 3, 22, -30}
	 * Output: 22
	 * */
	public static int forQ3(int[] strArr) {
		int largestSoFar = strArr[0];
		for (int i = 1; i < strArr.length; i++) {
			if (strArr[i] > largestSoFar) {
				largestSoFar = strArr[i];
			}
		}
		return largestSoFar;
	}
	
	/* Given a non-empty 2D array of integers, 
	 * return the largest integer in the 2D array
	 * 
	 * Input: {{3, 1, -5, 10, 23},
	 *         {1, 44, -2, -6, 4},
	 *         {-5, -1, 3, 43, 2}}
	 * Output: 44
	 * */
	public static int forQ4(int[][] str2DArr) {
		int largestSoFar = str2DArr[0][0];
		for (int i = 0; i < str2DArr.length; i++) {
			// Note: could also call forQ3 instead
			for (int j = 0; j < str2DArr[i].length; j++) {
				if (str2DArr[i][j] > largestSoFar) {
					largestSoFar = str2DArr[i][j];
				}
			}
		}
		return largestSoFar;
	}
	
	/* Given a non-empty array of integers,
	 * return the sum of all the elements
	 * 
	 * Input:{1, 2, 3, 4, 5}
	 * Output: 15
	 * */
	public static int forQ5(int[] strArr) {
		int sum = 0;
		for (int i = 0; i < strArr.length; i++) {
			sum += strArr[i];
		}
		return sum;
	}
	
	
	/* Given a non-empty 2D array of integers
	 * find the row that has the largest sum, and return the sum
	 * TODO: improve the wording
	 *  
	 * Input: {{3, 1, -5, 10, 23},
	 *         {1, 44, -2, -6, 4},
	 *         {-5, -1, 3, 43, 2}}
	 * Output: 42
	 * */
	public static int forQ6(int[][] str2DArr) {
		int largestSum = forQ5(str2DArr[0]);
		for (int i = 1; i < str2DArr.length; i++) {
			int rowSum = forQ5(str2DArr[i]);
			if (rowSum > largestSum) {
				largestSum = rowSum;
			}
		}
		return largestSum;
	}
}
