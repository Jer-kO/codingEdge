package exercises;

public class Ex4Arrays {
	
	public Ex4Arrays() {}
	
	/* Given an array of strings, return the first string in the array
	 * You may assume the array has at least 1 string
	 * 
	 * ex.
	 * Input: {"abc", "def", "ghi"}
	 * Ouput: "def"
	 * */
	public static String q1_firstString(String[] strs) {
		if (strs.length < 1) {
			return "";
		}
		return strs[0];
	}
	
	/* Given an array of strings, return the second string in the array
	 * You may assume the array has at least 2 strings
	 * 
	 * ex.
	 * Input: {"abc", "def", "ghi"}
	 * Ouput: "def"
	 * */
	public static String q2_secondString(String[] strs) {
		if (strs.length < 2) {
			return "";
		}
		return strs[1];
	}
	
	/* Given an array of integers, return the length of the array
	 * (the number of elements in the array).
	 * 
	 * ex.
	 * Input: {1, 2, 3, 4, 5}
	 * Ouput: 5
	 * */
	public static int q3_getArrayLength(int[] intArr) {
		return intArr.length;
	}
	
	/* Given an array of integers, return the last integer in the array
	 * 
	 * You may assume there is at least 1 integer in the array
	 * 
	 * ex.
	 * Input: {-1, 5, 3, 6, 8, 10}
	 * Ouput: 10
	 * */
	public static int q4_getLastInteger(int[] intArr) {
		if (intArr.length == 0) {
			return 0;
		}
		return intArr[intArr.length - 1];
	}
	
}
