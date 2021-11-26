
public class TestClass {

	public static void main(String[] args) {
		// Creates a Point object
		Point d = new Point(5.0,7.0);		
		// Makes point coordinates be read as a string
		String s = d.toString();
		//Computes the distance from origin from point object
		double x = d.distanceFromOrigin();
		//Prints out stuff
		System.out.println("The distance from the origin is "+x);
		System.out.println("The point is at "+s);
		

	}

}
