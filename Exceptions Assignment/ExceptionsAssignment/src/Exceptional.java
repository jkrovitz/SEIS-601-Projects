import java.util.Scanner;

/**
 * Exceptional.java
 * @author Jeremy Krovitz
 *
 * This program demonstrates exception handling in Java. It prompts the user to enter
 * an age. If the user inputs an younger than 50, the message "You're pretty young!"
 * will be printed. If the user inputs an age 50 or older, an exception wil be thrown
 * with the message "Young at heart is a wonderful thing!"
 */

public class Exceptional {
	
	public static void main(String[] args) {
		
		int count;
		Scanner scan = new Scanner(System.in);
		
		for(count = 0; count < 4; count++) {
			System.out.print("Please enter your age: ");
			int age = scan.nextInt();
			try {
				exceptionGenerator(age);
			}
			catch (GettingUpThereException problem) {
				System.out.println(problem.getMessage() + "\n");
			}
		}	
	}
	
	public static void exceptionGenerator(int num) throws GettingUpThereException {
		final int BREAKING_POINT_TO_OLD_AGE = 49;
		
		GettingUpThereException gettingUpThere = new GettingUpThereException("Young at heart is a wonderful thing!");
		
		
		if(num > BREAKING_POINT_TO_OLD_AGE) {
			throw gettingUpThere;
		}
		
		System.out.println("You're pretty young!\n");
	}
}

class GettingUpThereException extends Exception {
	
	GettingUpThereException(String message) {
		super (message);
	}
}
