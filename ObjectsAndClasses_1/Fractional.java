
package ObjectsAndClasses_1;

public final class Fractional {
	final int numerator;
	final int denominator;
	
	Fractional() {
		numerator=0;
                denominator=1;
	}
	
	Fractional(int p_numerator) {
		numerator=p_numerator;
                denominator=1;
	}
	
	Fractional(int p_numerator, int p_denominator) {
		if(p_denominator<0){
                    p_numerator *=-1;
                    p_denominator *=-1;
                }
                int gcd =computeGCD(p_numerator, p_denominator);
                if(gcd>0){
                p_numerator = p_numerator/gcd;
                p_denominator = p_denominator/gcd;
                }
                numerator = p_numerator;
                denominator = p_denominator;
                
	}
	
	Fractional negate() {
		return new Fractional(-numerator,denominator);
	}
	
	Fractional scale(int s) {
		return new Fractional(s*numerator,denominator);
	}	
	
	double get() {
		return ((double)numerator/denominator);
	}
	
	int computeGCD(int n1, int n2) {
	    if (n2 == 0) {
	        return n1;
	    }
	    return computeGCD(n2, n1 % n2);
	}	
	
    /**
     *
     * @return
     */
    @Override
	public String toString() {
		return numerator + " / " + denominator; 
	}
}

