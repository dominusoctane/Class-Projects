/**This program determines if a number is a palindrome
 * 
 * References: 
 *
 * @author Tyrell To
 * @version <Created: 3/5/19, Modified: 3/5/19 - Problem 1>
 */

import java.util.Scanner;
public class Palindrome
{
    public static void main(String args[])
    {
    	// Identify Scanner object
        Scanner s = new Scanner(System.in);
        // Prompts the user
        System.out.print("Enter any number:");
        // Assigns the next integer input as n
        int n = s.nextInt();
        // A boolean that is the result of using revNum()
        boolean state = revNum(n);
        // Prints out the result
        System.out.println("It is "+ state + " that "+ n +" is a palidrome");
        // Closes the keyboard
        s.close();
  
    }
    public static boolean revNum(int n) {
    	// Initialize the returning boolean, state
    	boolean state = true;
    	// Initialized variables
    	int m, a = 0,x;
        // Stores the initial value of n
    	m = n;
    	// A while loop that runs until n=0
        while(n > 0)
        {
        	System.out.println("Start new line");
            // Finds the remainder
        	x = n % 10;
        	System.out.println(x);
        	// Adds the remainder to a
            a = a * 10 + x;
            System.out.println(a);
            // Divides n by 10 to find the next remainder
            n = n / 10;
            System.out.println(n);
 
        }
        // If the integer aren't equal, then it will print out false
        if(a != m)
        {
            state = false;
        }
        // Returns the value of state
    	return state;
    	
    }
}