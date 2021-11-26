/**This program determines if a number is an Armstrong number
 * 
 * References: 
 * Anthony/Tony, Justin
 *
 * @author Tyrell To
 * @version <Created: 2/19/19, Modified: 2/19/19 - Problem 2>
 */

import java.util.Scanner;

public class Armstrong {
	public static void main(String args[]) {
		// Assigns a Scanner object
		Scanner sc = new Scanner(System.in);
		// Prompts the user for input
		System.out.println("Enter a positive number.");
		// Determines if next input is an integer
		if (sc.hasNextInt()) {
			int x = sc.nextInt();
			int keep = x;
			// Determines length of number
			String len = Integer.toString(x);
			int l = len.length();
			//Initialize variables
			int a,prev,sum=0;
			// Calculcates if input is an Armstrong number
			while (x>0){
				a = x % 10;
				prev = (int) Math.pow(a, l);
				x = x / 10;
				sum=sum+prev;
			}
			// Determines if calculated value is equal to user input, or not.
			if (sum==keep) {
				System.out.println(keep + " is an Armstrong number.");
			}
			else {
				System.out.println(keep + " is not an Armstrong number.");
			}
		}
		// Prints out a prompt that states that input is not a valid number
		else {
			System.out.println("Not a valid number");
		}
		sc.close();
	}
}

