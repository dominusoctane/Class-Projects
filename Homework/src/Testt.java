
public class Testt {
	public static void main(String[] args) {
		int i = 1; 
		while (i <= 5) {
		System.out.println("before continue i = " + ++i);
		 if (i%3 == 0) continue; 
		System.out.println("after continue i = " + i);
		}

	}
}
