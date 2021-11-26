import java.util.Scanner;

public class test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a positive number.");
		
		int x = sc.nextInt();
		int keep = x;
		String len = Integer.toString(x);
		int l = len.length();
		int a,prev,sum=0;
		
		while (x>0){
			a = x % 10;
			prev = (int) Math.pow(a, l); //a^l
			x = x / 10;
			sum=sum+prev;
		}
		if (sum==keep) {
			System.out.println(sum + " is an Armstrong number.");
		}
		else {
			System.out.println(sum + " is not an Armstrong number.");
		}
		sc.close();
		
	}
}
