/**This program determines the greatest common demoninator of 4 number inputs
 * 
 * References: 
 * Anthony/Tony, Justin
 *
 * @author Tyrell To
 * @version <Created: 2/28/19, Modified: 2/28/19 - Problem 2>
 */

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// Prompts the user
		System.out.println("Please enter 4 numbers on 4 separate lines.");
		// Creates a scanner object
		Scanner sc = new Scanner(System.in);
		// Assigns int variables to next integer input values
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		// Stores the value from the gCD method as an int value
		int g = gCD(a,b,c,d);
		// Prints out the gcd
		System.out.println(g);
		// Closes the keyboard
		sc.close();
	}
	
	public static int gCD(int a, int b, int c, int d) {
		// Initializes variables
		int gcd=0;
		int z=0;
		// Conditional statements that determine the lowest integer
		if ((a<b) && (a<c) && (a<d)){
			z = a;
		}
		else if ((b<a) && (b<c) && (b<d)) {
			z = b;
		}
		else if ((c<a) && (c<b) && (c<d)) {
			z = c;
		}
		else if ((d<a) && (d<b) && (d<c)) {
			z = d;
		}
		else if ((a==b) && (a==c) && (a==d)) {
			z = a;
		}
		// Assigns the counter to z
		int i = z;
		// A while loop that ends when all numbers are divisible by the highest possible number
		while (i>=1) {
			int one = a%i;
			int two = b%i;
			int three = c%i;
			int four = d%i;
			if ((one==0)&&(two==0)&&(three==0)&&(four==0)) {
				gcd = i;
				break;
			}
			//Subtracts from the counter
			i--;	
		}
		// Returns the gcd
		return gcd;
	}


}
