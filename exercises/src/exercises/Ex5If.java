package exercises;

public class Ex5If {
	
	public Ex5If() {}
	
	/* Given an integer, return true if it is greater than 0,
	 * false otherwise
	 * 
	 * ex.
	 * Input: 0
	 * Output: false
	 * */
	public static boolean q1_greaterThan0(int num) {
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
	public static int q2_stringLengthOrNum(String str, int num) {
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
	public static String q3_getDayOfWeek(int day) {
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
	
	/* Given an integer grade between 0 and 100, return the
	 * corresponding letter grade.
	 * 
	 * "A" = 86-100
	 * "B" = 70-85
	 * "C" = 60-69
	 * "D" = 50-59
	 * "F" = 0-49
	 * 
	 * Input: 85
	 * Output: "B"
	 * 
	 * */
	public static String q4_getLetterGrade(int grade) {
		String letter = "F";
		if (grade >= 86 && grade <= 100) {
			letter = "A";
		} else if (grade >= 70 && grade <= 85) {
			letter = "B";
		} else if (grade >= 60 && grade <= 69) {
			letter = "C";
		} else if (grade >= 50 && grade <= 59) {
			letter = "D";
		}
		return letter;
	}

}
