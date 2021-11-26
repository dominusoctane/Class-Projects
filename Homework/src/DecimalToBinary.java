/**This program converts decimal values into their binary versions
 * 
 * References: 
 * Anthony/Tony
 * https://www.rapidtables.com/convert/number/decimal-to-binary.html
 * https://www.baeldung.com/java-add-items-array-list
 * https://stackoverflow.com/questions/15466205/adding-values-to-an-array-in-java
 *
 * @author Tyrell To
 * @version <Created: 2/12/19, Modified: 2/12/19 - Problem 3>
 */


// Arrays and Scanner methods obtained from library
//import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;


public class DecimalToBinary {

	public static void main(String[] args) {
		// Prints out a prompt that asks for decimal value.
		System.out.println("Please enter a decimal value");
		// Assigns scanner variable
		Scanner sc = new Scanner(System.in);
		
		
		// Determines if next input is a integer
		if (sc.hasNextInt())
			{
			// Int variables are assigned with initial values
			int input = sc.nextInt();
			int intt = input;
			//int state = input;
			int remain = 0;
			int ele=0;
			String val = "";
			
			//Determines the number of elements for an array as an int value.
			while (intt>0) 
				{
				ele++;
				//System.out.println(arr);
				intt=intt/2;
				}
			
			// Prints out the number of elements for decimal value.
			System.out.println("The number of elements is " + ele);
			
			// Assigns an array with arr elements.
			int[] num = new int[ele];
			
			/* A for loop that determines the binary value 
			 * by dividing the previous quotient by 2.
			 * This is done until input=0.
			 * 
			 * It puts the remainder(0 or 1) in num, 
			 * starting at num[j-1], and ending at num[0].
			 * 
			 * For example, it starts at num[5], and ends 
			 * at num[0].
			 */
			for(int j = ele;input>0;j--)
				{
				remain = input%2;
				num[j-1] = remain;
				val = remain + val;
				input = input/2;
				}
			System.out.println(val);
			System.out.println(Arrays.toString(num));
			//Prints out a prompt that states the binary version of the decimal value as a string.
			//System.out.println("The binary equivalent of " + state + " is " + Arrays.toString(num));
			}
		else
			{
			System.out.println("That is not a valid value");
			}
		
		int[] w = new int[10];
		int sav=0;
		int prev=1;
		int sum=0;
		for(int i=0;i<w.length;i++) {
			w[i]=sav;
			
			sav=prev+sum;
			sum=sav;
			prev++;

			System.out.println(w[i]);
		}
		// Closes input
		sc.close();
	}
}
