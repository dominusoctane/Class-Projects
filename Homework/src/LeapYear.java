/**This program determines if a year is a leap year
 * 
 * 
 * References:
 * Anthony/Tony
 *
 * @author Tyrell To
 * @version <Created: 2/12/19, Modified: 2/12/19 - Problem 1>
 */

// Obtains Scanner method from library
import java.util.Scanner;


public class LeapYear {
	public static void main(String args[]) {
		// Assigns a Scanner variable
		Scanner sc = new Scanner(System.in);
		// Prints out a prompt
		System.out.println("Input a year");
		
		// The next int input will be assigned to this int variable
		int year= sc.nextInt();
		
		// If the remainder is equal to 0, then its a leap year.
		if ((year%4==0) && (year%100!=0) || (year%400==0))
			System.out.println("" + year + " is a leap year.");
		// Else it prints this prompt
		else
			System.out.println("" + year + " is not a leap year.");
		// Closes input
		sc.close();
	}
}
