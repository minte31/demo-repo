package runnable;

public class JavaMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Java Math
		 * The Java Math class has many methods that allows you to perform mathematical tasks on numbers.
		 * Math.max(x,y) -> method can be used to find the highest value of x and y:
		 */
		int x = 5, y = 10;
		Math.max(x,y); // Returns the highest number among the values of variables x and y.
		System.out.println("The highest number among the two is :" + Math.max(x,y));
		
		// Math.min(x,y) -> used to return the minimum value among variables x and y.
		
		int a = 3, b = 9;
		Math.min(a, b);
		System.out.println("The minimum value between the variables \'a\' and \'b\' :" + Math.min(a, b));
		
		// Math.sqrt(x) -> This method returns the square root value of x.
		
		int l = 81;
		Math.sqrt(l); // return a double value
		System.out.println(Math.sqrt(l));
		
		// Math.abs(x) -> This method return the absolute (positive) value of x
		 int n = (int) -8.5;
		 double doub4 = - 3.85;
		 Math.abs(n);
		 double c = Math.abs(doub4);
		 System.out.println(Math.abs(n));
		 System.out.println(c);
		 
		 // Random Numbers
		 /* Math.random() returns a random number between 0.0 (inclusive), and 1.0 (inclusive) 
		  */
		 double w = Math.random();
		 long k = (long)w* 10^5;
		 System.out.println(w);// picks a random number between 0.0 (inclusive), and 1.0 (inclusive)
		 System.out.println((int)w);// returns 0
		 System.out.println(k);
		 
		 int randomNum = (int)(Math.random()*101); // returns a whole number value between 0 and 100
		 System.out.println(randomNum);
		
		 /* All Math methods are STATIC
		  * Method	Description	Return Type
		abs(x)	Returns the absolute value of x	double|float|int|long
		acos(x)	Returns the arccosine of x, in radians	double
		addExact(x, y)	Returns the sum of x and y	int|long
		asin(x)	Returns the arcsine of x, in radians	double
		atan(x)	Returns the arctangent of x as a numeric value between -PI/2 and PI/2 radians	double
		atan2(y,x)	Returns the angle theta from the conversion of rectangular coordinates (x, y) to polar coordinates (r, theta).	double
		cbrt(x)	Returns the cube root of x	double
		ceil(x)	Returns the value of x rounded up to its nearest integer	double
		copySign(x, y)	Returns the first floating point x with the sign of the second floating point y	double|float
		cos(x)	Returns the cosine of x (x is in radians)	double
		cosh(x)	Returns the hyperbolic cosine of a double value	double
		decrementExact(x)	Returns x-1	int|long
		exp(x)	Returns the value of Ex	double
		expm1(x)	Returns ex -1	double
		floor(x)	Returns the value of x rounded down to its nearest integer	double
		floorDiv(x, y)	Returns the division between x and y rounded down	int|long
		floorMod(x, y)	Returns the remainder of a division between x and y where the result of the division was rounded down	int|long
		getExponent(x)	Returns the unbiased exponent used in x	int
		hypot(x, y)	Returns sqrt(x2 +y2) without intermediate overflow or underflow	double
		IEEEremainder(x, y)	Computes the remainder operation on x and y as prescribed by the IEEE 754 standard	double
		incrementExact(x)	Returns x+1	int|double
		log(x)	Returns the natural logarithm (base E) of x	double
		log10(x)	Returns the base 10 logarithm of x	double
		log1p(x)	Returns the natural logarithm (base E) of the sum of x and 1	double
		max(x, y)	Returns the number with the highest value	double|float|int|long
		min(x, y)	Returns the number with the lowest value	double|float|int|long
		multiplyExact(x, y)	Returns the result of x multiplied with y	int|long
		negateExact(x)	Returns the negation of x	int|long
		nextAfter(x, y)	Returns the floating point number adjacent to x in the direction of y	double|float
		nextDown(x)	Returns the floating point value adjacent to x in the negative direction	double|float
		nextUp(x)	Returns the floating point value adjacent to x in the direction of positive infinity	double|float
		pow(x, y)	Returns the value of x to the power of y	double
		random()	Returns a random number between 0 and 1	double
		rint(x)	Returns the double value that is closest to x and equal to a mathematical integer	double
		round(x)	Returns the value of x rounded to its nearest integer	long|int
		scalb(x, y)	Returns x multiplied by 2 to the power of y	double|float
		signum(x)	Returns the sign of x	double|float
		sin(x)	Returns the sine of x (x is in radians)	double
		sinh(x)	Returns the hyperbolic sine of a double value	double
		sqrt(x)	Returns the square root of x	double
		subtractExact(x, y)	Returns the result of x minus y	int|long
		tan(x)	Returns the tangent of an angle	double
		tanh(x)	Returns the hyperbolic tangent of a double value	double
		toDegrees(x)	Converts an angle measured in radians to an approx. equivalent angle measured in degrees	double
		toIntExact(x)	Converts a long value to an int	int
		toRadians(x)	Converts an angle measured in degrees to an approx. angle measured in radians	double
		ulp(x)	Returns the size of the unit of least precision (ulp) of x	double|float
		  */
	}

	
	

}
