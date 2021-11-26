/**
 * This program prints out a truth table with the inverted versions of the booleans p and q.
 * 
 * References: 
 * None
 *
 * @author Tyrell To
 * @version <Created: 2/05/19, Modified: 2/05/19 - Problem 3>
 */

public class TruthTable {
	public static void main(String[] args) {
		// Assigns booleans p and q with false statements
		boolean p = false;
		boolean q = false;
		
		// Creates strings a and b
		String a,b;
		// Converts the booleans into two separate strings
		a = Boolean.toString(p);
		b = Boolean.toString(q);
		// Prints the labels
		System.out.println("p     q     !p&&!q");
		// Prints the first row of table
		System.out.printf(a +" "+ b +" "+ "%b%n",!p&&!q);
		
		// Changes values of p and q
		p = true;
		q = true;
		// Converts the booleans into two separate strings
		a = Boolean.toString(p);
		b = Boolean.toString(q);
		// Prints out second row of table
		System.out.printf(a +"  "+ b +"  "+ "%b%n",!p&&!q);
		
		// Changes values of p and q
		p = true;
		q = false;
		// Converts the booleans into two separate strings
		a = Boolean.toString(p);
		b = Boolean.toString(q);
		// Prints out the third row of table
		System.out.printf(p +"  "+ q +" "+ "%b%n",!p&&!q);
	
		// Changes values of p and q
		p = false;
		q = true;
		// Converts the booleans into two separate strings
		a = Boolean.toString(p);
		b = Boolean.toString(q);
		// Prints out the fourth row of table
		System.out.printf(a +" "+ b +"  "+ "%b%n",!p&&!q);
		
	}
}
