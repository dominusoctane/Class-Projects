/**This program determines the sine and cosine of a degree value
 * 
 * References: 
 *
 * @author Tyrell To
 * @version <Created: 3/5/19, Modified: 3/5/19 - Problem 2>
 */
import java.util.Scanner;

public class TrigFunction {

	public static void main(String[] args) {
		// Prompts the user
		System.out.println("Please enter a degree value");
		// Creates a Scanner object
		Scanner sc = new Scanner(System.in);
		// Stores the next integer input
		double x = sc.nextInt();
		// Determines the cosine of x using the cosine() method
		double r = cosine(x);
		// Determines the sine of x using the sine() method
		double t = sine(x);
		// Formats the strings
		String a = String.format("Cos("+x+") is %1.9f", r);
		String b = String.format("Sin("+x+") is %1.9f", t);
		// Prints out the results
		System.out.println(a);
		System.out.println(b);
		// Closes the keyboard
		sc.close();
	}
	public static double fact(double a) {
		// Assigns int values
		double i = 1;
		double count = 1;
		// Computes the factorial as long count is less than or equal to num
		if (a!=0) {
			while (count<=a) 
			{
				i=count*i;
				// Counter adds
				count=count+1;
			}
		}
		// Returns the value of i
		return i;
	}

	public static double taylor(double k,double deg, double count) {
		// Converts degree to rad
		double rad = deg / 180 * 3.14159265359;
		// Initialize variables
		double sum =0;
		double b = 0;
		// A while loop that determines the sum of taylor series
		while (count<(k+100)) {
			double np = Math.pow(-1, b);
			sum += np * Math.pow(rad, count) / fact(count);
			
			// Counter for power number
			count = count + 2;
			// Counter for negative
			b++;
		}
		// Returns the sum
		return sum;
	}
	
	public static double sine(double deg) {
		// Initialize variables
		double i = 0;
		double keep=0;
		// A while loop that runs until i<=100
		while (i<=10) {
			// Keep is equal to the result of using the taylor method for sumnation
			keep = taylor(i,deg,1);
			// Counter for i
			i++;
			//System.out.println(keep);
			
		}
		// Returns the value of keep at whatever i was equal to.
		return keep;
	}
	public static double cosine(double deg) {
		// Initialize variables
		double i = 0;
		double keep=0;
		// A while loop that runs until i<=100
		while (i<=10) {
			// Keep is equal to the result of using the taylor method for sumnation
			keep = taylor(i,deg,0);
			// Counter for i
			i++;
			
		}
		// Returns the value of keep at whatever i was equal to.
		return keep;
	}
}
	
