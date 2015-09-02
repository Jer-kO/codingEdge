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
	
}
