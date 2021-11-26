
public class Average {
	private int a,b,c,d,e,f,g,h,i,j;
	public Average() {
		this.a=0;
		this.b=0;
		this.c=0;
		this.d=0;
		this.e=0;
		this.f=0;
		this.g=0;
		this.h=0;
		this.i=0;
		this.j=0;
	}
	public Average(int a1, int b1, int c1, int d1, int e1, int f1, int g1, int h1, int i1, int j1) {
		this.a=a1;
		this.b=b1;
		this.c=c1;
		this.d=d1;
		this.e=e1;
		this.f=f1;
		this.g=g1;
		this.h=h1;
		this.i=i1;
		this.j=j1;
	}
	public double compute() {
		return (a+b+c+d+e+f+g+h+i+j)/10.0;
		
	}
	public void compare(double r) {
		if (a>r) {
			System.out.println(a);
		}
		if (b>r) {
			System.out.println(b);
		}
		if (c>r) {
			System.out.println(c);
		}
		if (d>r) {
			System.out.println(d);
		}
		if (e>r) {
			System.out.println(e);
		}
		if (f>r) {
			System.out.println(f);
		}
		if (g>r) {
			System.out.println(g);
		}
		if (h>r) {
			System.out.println(h);
		}
		if (i>r) {
			System.out.println(i);
		}
		if (j>r) {
			System.out.println(j);
		}
	}
	public static void main(String[] args) {
		int a=1,b=2,c=3,d=4,e=5,f=6,g=7,h=8,i=9,j=30;
		Average y = new Average(a,b,c,d,e,f,g,h,i,j);
		double r =y.compute();
		System.out.println(r);
		y.compare(r);
	}

}
