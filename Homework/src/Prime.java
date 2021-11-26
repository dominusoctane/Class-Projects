/**This program determines if a number input is a prime, and prints out the result
 * 
 * References: 
 * Anthony/Tony, Justin
 *
 * @author Tyrell To
 * @version <Created: 2/28/19, Modified: 2/28/19 - Problem 1>
 */

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// Prompts the user
		System.out.println("Enter an integer");
		// Creates a scanner object
		Scanner sc = new Scanner(System.in);
		// Next integer input will be assigned to x
		int x = sc.nextInt();
		// Boolean variable that is equal to the isPrime() method
		boolean prime = isPrime(x);
		// Prints out the boolean result
		System.out.println(prime);
		sc.close();
	}
	
	public static boolean isPrime(int a) {
		// Initializes variable
		boolean n = true;
		// Conditional statement that checks if number is divisible by 2, 3, 5, or 7
		if ((a%2==0) || (a%3==0) || (a%5==0) || (a%7==0)) {
			// If they are not equal to any of these numbers, the number is not a prime
			if ((a!=0) && (a!=1) && (a!=2) && (a!=3) && (a!=5) && (a!=7)) {
				n = false;
				}
		}
		// Returns the boolean result
		return n;
	}

}
