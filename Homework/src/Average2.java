import java.util.ArrayList;
import java.util.Scanner;

public class Average2 {
	// Creates an int array with number of elements
	//private int[] z = new int[10];
	// Constructor that assigns values to the z array
	/*public Average2(int a1, int b1, int c1, int d1, int e1, int f1, int g1, int h1, int i1, int j1) {
		Integer[] va= {a1,b1,c1,d1,e1,f1,g1,h1,i1,j1};
		for (int i=0;i<z.length;i++) {
			z[i]=va[i];
		}
	}*/
	
	//Creates an ArrayList based on Integer
	private ArrayList<Integer> b = new ArrayList<Integer>();
	// Constructor that takes in the input, and adds integers into the arraylist until the user inputs n.
	public Average2(Scanner a) {
		boolean state = true;
		do {
			if (a.hasNextInt()) {
				b.add(a.nextInt());		
			}
			System.out.println("Another input? y or n");
			String str= a.next();
			if (str.equals("n")) {
				state= false;
				System.out.println("You have entered "+ b.size() + " int values");
				System.out.println("These numbers are larger than the average");
			}
		}while(state==true);
	}
	// Constructor that returns the average value of the 10 int values in the z array
	public double compute() {
		int sum=0;
		for (int i=0;i<b.size();i++) {
			sum+=b.get(i);
		}
		return sum/(double) b.size();
	}
	// Constructor that allows the Average2 object to compare with the average of its numbers, and prints out which numbers>average.
	public void compare(Average2 r) {
		for (int i=0;i<b.size();i++) {
			if (b.get(i)>r.compute()) {
				System.out.println(b.get(i));
			}
		}
	}
	// Main method
	public static void main(String[] args) {
		//Scanner object
		System.out.println("Please enter an int value");
		Scanner sc = new Scanner(System.in);
		// Creates an int array called x with 10 elements
		//int[] x = new int[10];
		// A for loop that assigns the next 10 int inputs from user into array at index(i)
		//for (int i=0; i<x.length;i++) {
			//x[i]=sc.nextInt();
		//}
		//System.out.println("Done");
		// Creates an Average2 object that has the values in the x array at different indexes
		//Average2 y = new Average2(x[0],x[1],x[2],x[3],x[4],x[5],x[6],x[7],x[8],x[9]);
		Average2 y = new Average2(sc);
		//Compares object's int values with the average
		System.out.println(y.compute());
		y.compare(y);
		sc.close();
	}

}
