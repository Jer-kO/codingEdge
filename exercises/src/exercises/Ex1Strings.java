package exercises;

public class Ex1Strings {
	// TODO: Maybe add some really basic string manipulation,
	// like checking if the string is empty?
	
	
	/* Given two Strings str1 and str2, return the first string
	 * followed by the second string, separated by a single space
	 * 
	 * Input: "Hello", "World"
	 * Output: "Hello World"
	 * */
	public static String q1_concatTwoStrings(String str1, String str2) {
		return str1 + " " + str2;
	}
	
	/* Given three strings str1, str2, and str3, return a single string
	 * of the three strings joined in order and separated by a space.
	 * 
	 * Input: "A", "B", "C"
	 * Output: "A B C"
	 * */
	public static String q2_concatThreeStrings(String str1, String str2, String str3) {
		return str1 + " " + str2 + " " + str3;
	}
	
	/* Given a string, return the first character of the string
	 * You may assume the string has at least 1 character.
	 * 
	 * Input: "Hello World"
	 * Output: "H"
	 * */
	public static String q3_getFirstChar(String str1) {
		return str1.substring(0, 1);
	}
	
	/* Given a string, return the same string except for the first character
	 * You may assume the string has at least 1 character.
	 * 
	 * Input: "Hello World"
	 * Output: "ello World"
	 * */
	public static String q4_allButFirstChar(String str1) {
		return str1.substring(1, str1.length());
	}
}
