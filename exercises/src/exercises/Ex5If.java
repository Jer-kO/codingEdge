package exercises;

public class Ex5If {
	
	public Ex5If() {}
	
	/* Given an integer i, return the String "zero" if the integer
	 * is 0, otherwise return the String "non-zero".
	 * 
	 * Input: 0
	 * Output: "zero"
	 * */
	public static String q1_isZero(int i) {
		if (i == 0) {
			return "zero";
		}
		return "non-zero";
	}
	
	/* Given an integer x, return it absolute value (convert
	 * negative integers to positive integers by dropping the 
	 * negative sign).
	 * 
	 * Input: -4
	 * Output: 4
	 * */
	public static int q2_absoluteValue(int x) {
		if (x > 0) {
			return x;
		} else {
			return -1*x;
		}
	}
	
	/* Given two integers x and y, return the larger integer.
	 * 
	 * Input: x = 3, y = 5
	 * Output: 5
	 * */
	public static int q3_getMax(int x, int y) {
		if (x > y) {
			return x;
		} else {
			return y;
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
	public static String q4_getDayOfWeek(int day) {
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
	 * */
	public static String q5_getLetterGrade(int grade) {
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
