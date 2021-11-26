
public class Recursion {

	public static void main(String[] args) {
		float d = seq1(5);
		System.out.println(d);
	}
	public static float seq1(float n) {
	
			//if (n < 1)
			//	n = 1;
		
			if (n > 1)
				n = n - 1;
				n = n * n;
				n = n / (2 * n);
			//	n = 1/n + seq1(n);
				
				//n = (n - 1) * seq1(n -1) * n;
				//n = seq1(n*(n-1));
				return n;
	}
}
