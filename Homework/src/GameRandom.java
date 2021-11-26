import java.util.Random;
import java.util.Scanner;

public class GameRandom {

	public static void main(String[] args) {
		// Creates Random object
		Random r = new Random();
		// Creates Scanner object
		Scanner m = new Scanner(System.in);
		// Assigns booleans so do while loop will run
		//boolean user = true,cpu = true;
		boolean end = false;
		// Determines a random straw value
		int k = r.nextInt(11)+10;
		// If the remainder is 1, then adds one to k
		if (k%4==1) {
			k++;	
		}
		// Prints out number of straws
		System.out.println("There are "+k+" straws left.");
		// a do while loop that runs until user or cpu is false.
		do {
			// Determines cpu's next straw
			int c = r.nextInt(3)+1;
			// Prompts the user
			System.out.println("Please enter 1, 2, or 3 for number of straws");
			// Obtains next int value from user
			int p = m.nextInt();
			// A while loop that runs until p==1,2,or 3
			while ((p!=1) || (p!=2) || (p!=3)) {
				if ((p==1) || (p==2) || (p==3)) {
					break;
				}
				else {
					// Prompts the user
					System.out.println("That is not a valid value. Please enter 1, 2, or 3 for number of straws");
					// Obtains next int value from user
					p = m.nextInt();
				}		
			}
			
			// if remaining straws is less than picked straws then user loses
			if ((k<=p)) {
				System.out.println("You lost!");
				// Makes user fa
				end = true;
			}
			else {
				//Otherwise subtracts p from k
				k=k-p;
				// if remaining straws is less than picked straws then cpu loses
				if ((k<=c)) {
					System.out.println("The computer lost!");
					end=true;
				}
				else {
					//Otherwise subtracts c from k
					k=k-c;
				}
			}
			// If cpu or user is false(lost), then prompts user
			if ((end==true)) {
				System.out.println("Do you want to play another game: yes/no");
				// Obtains next string value from user
				String answer = m.next();
				// If string is equal to yes, then makes cpu and user true
				if (answer.equals("yes")) {
					end = false;
					// Assigns new value of k, or number of straws
					k = r.nextInt(11)+10;
					if (k%4==1) {
						k++;	
					}
					// Prints out number of straws
					System.out.println("There are "+k+" straws left.");
				}
				else {
					// Otherwise, close user input
					m.close();
				}
			}

		}
		while (end==false);
		System.out.println("antman will defeat thanos");
	}

}
