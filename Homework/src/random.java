/**This program prints out a number of random integers based off user input
 * 
 * References: 
 *
 * @author Tyrell To
 * @version <Created: 3/5/19, Modified: 3/5/19 - Problem 3>
 */

import java.util.Random;
import java.util.Scanner;

public class random {

	public static void main(String[] args) {
		// Creates Scanner object
		Scanner sc = new Scanner(System.in);
		// Prompts the user
		System.out.println("Please enter the number of expected outputs, and two numbers of different values");
		// Int variables are equal to next user inputs
		int z = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		// Initialize low and high
		int low=0;
		int high=0;
		// A conditional statement that determines which input is a low or high
		if (x>y) {
			high = x;
			low = y;
		}
		else if (x<y) {
			high = y;
			low = x;
		}
		else if (x==y) {
			System.out.println("Please enter two different integers.");
		}
		// Increment difference between the two numbers
		int diff = high-low;
		// Creates a Random object
		Random a = new Random();
		// A for loop that runs until i=z, while it prints out a random number between low and high
		for (int i = 0;i<z;i++) {
			int b = a.nextInt(diff+1)+low;
			System.out.println(b);
		}
	}
}
