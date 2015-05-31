package exercises;

public class Ex1 {
	
	public Ex1() {}
	
	/* Exercise 1 
	 * Given two Strings str1 and str2, return the first string
	 * followed by the second string, separated by a single space
	 * 
	 * ex.
	 * Input: "Hello", "World"
	 * Output: "Hello World"
	 * */
	public static String Question1(String str1, String str2) {
		return str1 + " " + str2;
	}
	
	/* Exercise 2 
	 * Given a string, return the same string except for the first character
	 * 
	 * ex.
	 * Input: "Hello World"
	 * Output: "ello World"
	 * */
	public static String Question2(String str1) {
		return str1.substring(1, str1.length());
	}
}
