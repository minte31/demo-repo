package runnable;

public class JavaOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Java Operators
 * Operators are used to perform operations on variables and values
	 * + Operator -> adds to values
	 * - Operator -> Subtracts one value from another
	 * * Multiplication -> Multiplies two values
	 *  a/b Division -> Divides one value with the other
	 *  % Modulus -> Returns the division remainder (x % y)
	 *  ++ Increment -> Increases the value of a variable by 1 (++x)
	 *  -- Decrement -> Decreases the value of a variable by 1 (--x)
	 *  Java Assignment Operators -> Assignment operators are used to assign values to variables.
	 *  
 */
	int x = 10; // (=) sign used as assignment operator, assigns  the value 10 to a variable to (X)
	System.out.println(x);
	x += 5;// adds 5 to the already assigned value for X (which is 10 + 5)-- x = x+3
	System.out.println(x);
	x -= 5; // Subtracts to the value of x ( same as x = x -5)
	System.out.println(x);
	x *= 5; // multiplies 5 to the value of x ( same as x = x*5)
	System.out.println(x);
	x/= 5; // divides the value of x by 5 (same as x = x/5)
	System.out.println(x);
	x %= 5; // gives the remainder of x/5 (same as x = x% 5)
	System.out.println(x);
	int y = 15;
	y&=5; // Same as x = x&5
	System.out.println(y);
	y|=5; // Same as y = y|5
	System.out.println(y);
	y^=5; // Same as y = y^5
	System.out.println(y);
	y>>=5; // Same as y = y>>5
	System.out.println(y);
	int z =100;
	z<<=5; // Same as z = z<<5
	System.out.println(z);
	z>>=5; // Same as z = z>>5
	System.out.println(z);

	// Java Comparison Operators
	/* Comparison operators are used to compare two values/ Variables.
	 * The return value of a comparison is either true or false (these values
	 * are also known as Boolean Values)
	 */
	int m = 10;
	int n = 8;
	System.out.println(m>n);
	System.out.println(n>m);
	System.out.println(m==n); // m is equal to n (m==n)
	System.out.println(m!=n); // m is not equal to n (m!=n)
	
	int s = 4;
	int t = 4;
	System.out.println(s>=t);// s is Greater than or equal to t
	System.out.println(s<=t); // s is Less than or equal to t
	
	// Java Logical Operators
	/* You can also test for true or false values with logical operators
	 * Logical operators are used to determine the logic between variables or values
	 * &&(Logical and) -> Returns true if the both statements are true
	 * ||(Logical or) -> Returns true if one of the statements is true
	 * ! (Logical not) -> Reverse the result, returns false if the result is true
	 */
	int l = 10;
	System.out.println(5< l && l < 20);// if all statement is true and returns true value
	int o = 15;
	System.out.println(o>20||o <30); // if one of the statement is true then returns true value
	int c = 70;
	System.out.println(!(c >100 || c < 20));
	}

}
