/**
 * This program uses the Scanner method to attain two different inputs from the user, and prints a string that is a combination of the inputs.
 * 
 * References: 
 * Anthony/Tony
 *
 * @author Tyrell To
 * @version <Created: 2/05/19, Modified: 2/05/19 - Problem 2>
 */
// Scanner method is attained from library
import java.util.Scanner;

public class Concat {

	public static void main(String[] args) {
		// Assigns a Scanner to interpret information from user input
		Scanner sc = new Scanner(System.in);
		// This string will be the next string input
		String a = sc.next();
		// This string will be the previous string input and next string input combined
		String b = a.concat(sc.next());
		// Prints out String b
		System.out.println(b);
	}
}
