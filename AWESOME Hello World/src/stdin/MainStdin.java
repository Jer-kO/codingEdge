package stdin;

import java.util.Scanner;

public class MainStdin {

	public static String GLOBAL_STRING = "This is so awesome!!";
	
	public static void main(String[] args) {
		System.out.println("Please enter your name.");
		
		Scanner reader = new Scanner(System.in);
		
		String name = reader.nextLine();
		
		System.out.println("Hello " + name + ", hope you'll enjoy our class :)");
	}
	
}
