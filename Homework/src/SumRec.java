
public class SumRec {
	public static void main(String args[]) {
		System.out.println(fact(3));
	}
	
	public static int rec(int n) {
		 if (n==0)
			 return 0;
		 else
			 return n + rec(n-1);
	}
	
	public static int fact(int n) {
		int x =n;
		if (n==0)
			return 1;
		else {
			x = n * fact(n-1);
			System.out.println(x);

			return x;
		}
	}
}
