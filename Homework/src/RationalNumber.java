
public class RationalNumber {
	// Initialize variables
	private int numerator,denominator;
	private int n,d;
	// null constructor
	public RationalNumber() {
		numerator=0;
		denominator=0;
	}
	// Constructor that establishes numerator and denominator
	public RationalNumber(int n, int d) {
		this.numerator=n;
		this.denominator=d;
	}
	/*
	public void nSet(int n) {
		this.numerator=n;
	}
	public void dSet(int d) {
		this.denominator=d;
	}
	public int nGet() {
		return this.numerator;
	}
	public int dGet() {
		return this.denominator;
	}
	*/
	// Constructor that adds two fractions together
	public RationalNumber add(RationalNumber r) {
		// adds the numerators together if denominators are the same
		if (this.denominator==r.denominator) {
			n=this.numerator+r.numerator;
			d=this.denominator;
		}
		// does cross multiplication and addition otherwise
		else {
			n=(this.numerator * r.denominator) + (this.denominator *r.numerator);		
			d= this.denominator * r.denominator;
			}
		// returns the new numerator and denominator values
		return new RationalNumber(n,d);
	}
	// Constructor that multiplies two fractions together
	public RationalNumber multiply(RationalNumber r) {

		n=this.numerator*r.numerator;
		d=this.denominator*r.denominator;
		// returns the new numerator and denominator values
		return new RationalNumber(n,d);
	}
	/*/ Constructor that divides one fraction by another
	public RationalNumber divide(RationalNumber r) {
		this.numerator=this.numerator*r.denominator;
		this.denominator=this.denominator*r.numerator;
		// returns the new numerator and denominator values
		return new RationalNumber(this.numerator,this.denominator);
	}*/
	// Constructor that reduces the numerator and denominator by their common factor
	public void reduce() {
		for(int j = this.denominator;j>1;j--) {
			if ((this.denominator%j==0)&&(this.numerator%j==0)) {
				this.denominator=this.denominator/j;
				this.numerator=this.numerator/j;
			}
		}
		
	}
	// Makes numerator and denominator readable as a String
	public String toString() {
		return "" + this.numerator + "/" + this.denominator;
		
	}
	
	// Main method that tests RationalNumber class
	public static void main(String[] args) {
		RationalNumber a = new RationalNumber(16,4);
		//RationalNumber c = a;
		RationalNumber b = new RationalNumber(1,4);
		RationalNumber c = b.add(a);
		System.out.println(c.toString());
		
		RationalNumber d = b.multiply(a);
		System.out.println(d.toString());
		d.reduce();
		System.out.println(d.toString());
	}

}
