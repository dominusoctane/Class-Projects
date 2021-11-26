/**This program calculates the factorial of any numbers that register within a low range
 * 
 * 
 * References:
 * None
 *
 * @author Tyrell To
 * @version <Created: 2/12/19, Modified: 2/12/19 - Problem 2>
 */

// Obtains Scanner method
import java.util.Scanner;

public class Factorial {
	public static void main(String args[]) {
		// Prints out a prompt
		System.out.println("Find the factorial of:");
		// Assigns a scanner variable
		Scanner sc = new Scanner(System.in);
		
		// Assigns an int value with the next int value put in
		int num = sc.nextInt();
		// Assigns int values
		int i = 1;
		int count = 1;
		
		// Computes the factorial as long count is less than or equal to num
		while (count<=num) 
		{
			i=count*i;
			System.out.println(i);
			count=count+1;
		}
		// Closes input
		sc.close();
		
	}
}
