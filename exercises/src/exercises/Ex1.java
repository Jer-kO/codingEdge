package exercises;

public class Ex1 {
	// Questions for primitive types
	
	public Ex1() {}
	
	/* Given two Strings str1 and str2, return the first string
	 * followed by the second string, separated by a single space
	 * 
	 * ex.
	 * Input: "Hello", "World"
	 * Output: "Hello World"
	 * */
	public static String stringQ1(String str1, String str2) {
		return str1 + " " + str2;
	}
	
	/* Given a string, return the same string except for the first character
	 * 
	 * ex.
	 * Input: "Hello World"
	 * Output: "ello World"
	 * */
	public static String stringQ2(String str1) {
		return str1.substring(1, str1.length());
	}
	
	/* Given a boolean, return true if the boolean is false, and false
	 * if the boolean is true
	 * 
	 * ex.
	 * Input: true
	 * Output: false
	 * */
	public static boolean booleanQ1(boolean bool1) {
		return !bool1;
	}
	
	/* Given two booleans, return true if and only if both are true
	 * 
	 * ex.
	 * Input: true, true
	 * Output: true
	 * */
	public static boolean booleanQ2(boolean bool1, boolean bool2) {
		return bool1 && bool2;
	}
	
	/* Given two booleans, return true if at least 1 is true
	 * 
	 * ex.
	 * Input: true, false
	 * Output: true
	 * */
	public static boolean booleanQ3(boolean bool1, boolean bool2) {
		return bool1 || bool2;
	}
	
	/* Given two booleans, return true if and only if exactly one of them is 
	 * true
	 * 
	 * ex.
	 * Input: true, false
	 * Output: true
	 * */
	public static boolean booleanQ4(boolean bool1, boolean bool2) {
		return (bool1 || bool2) && !(bool1 && bool2);
	}
	
}
