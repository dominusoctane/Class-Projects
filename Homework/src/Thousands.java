/**This program prints out 5 numbers per line from 1000 to 2000
 * 
 * References: 
 * Anthony/Tony, Justin
 *
 * @author Tyrell To
 * @version <Created: 2/19/19, Modified: 2/19/19 - Problem 1>
 */

public class Thousands {

    public static void main(String[] args) {
    	// Initialize integer variables
        int x1 = 1000;
        int x2 = 2000;
        int xc = x2-x1;
        // Use a for loop to print out new values of i everytime
        for(int i = 1; i <= xc+1; i++) {
            int xprev = x1;
            //The counter
            x1++;
            // A conditional statement to determine if year is divisible by 5
            if (i%5==0){
            	//Prints out on new line
                System.out.println(xprev);
            }
            else {
            	//Prints out on the present line
                System.out.print(xprev + " ");
            }
        }

    }
}
