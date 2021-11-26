
public class Point {
	// Creates private double variables
	private double x;
	private double y;
	private double d;
	// Creates String class
	private String s="";
	
	// Assigns points to have coordinates of 0,0.
	public Point() {
		this.x=0.0;
		this.y=0.0;
	}
	// Assigns point with coordaintes of a,b.
	public Point(double a,double b) {
		this.x=a;
		this.y=b;
	}
	// Calculates point's distance from origin.
	public double distanceFromOrigin() {
		d=Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) );
		return this.d;
		
	}
	// Makes the point readable as a string.
	public String toString() {
		s = s +"("+x+"),("+y+")";
		return this.s;
	}

}
