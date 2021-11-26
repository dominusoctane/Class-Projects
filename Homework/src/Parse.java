/**This program adds up the numbers present in a string that is the input of the user. 
 * 
 * References: 
 * Anthony/Tony, Justin
 *
 * @author Tyrell To
 * @version <Created: 2/28/19, Modified: 2/28/19 - Problem 3>
 */


import java.util.Scanner;


public class Parse {

	public static void main(String[] args) {
		// Prompts the user
		System.out.println("Please enter a string that consists of numbers and letters");
		// Creates a scnaner object
		Scanner sc = new Scanner(System.in);
		// Next string input
		String a1 = sc.next();
		// Stores the value of parse as an integer
		int su = parse(a1);
		// Prints out the value
		System.out.println(su);
		// Closes the keyboard
		sc.close();
	}
	
	public static int parse(String a) {
		// Stores length of string as int
		int len = a.length();
		// Initializes the sum
		int sum = 0;
		// A For loop that determines if a char is a number
		for (int i=0;i<len;i++) {
			// Selects the char in a string, based off from i
			char c = a.charAt(i);
			// A For loop that determines if the char is equal to a number between 0-9
			for (int k=0;k<=9;k++) {
				String o = Integer.toString(k);
				Character j = o.charAt(0);
				// If this is true, it adds the value of whatever number the char was equal to a sum
				if (j.equals(c)) {
					sum = sum +k;
				}
			}
		}
		// Returns the sum of integers
		return sum;
	}

}
