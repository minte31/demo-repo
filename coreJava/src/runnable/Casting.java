package runnable;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Java type Casting
		 * Type casting is when you assign a value of one primitive data type to another type.
			In Java, there are two types of casting:
			Widening Casting (automatically) - converting a smaller type to a larger type size
			byte -> short -> char -> int -> long -> float -> double
			-> Widening Casting is done automatically when passing a smaller size type to a larger size type
			Narrowing Casting (manually) - converting a larger type to a smaller size type
			double -> float -> long -> int -> char -> short -> byte
			
		 */
		int myInt =5;
		double myDouble = myInt;
		System.out.println(myDouble); // Widening Casting
		
		float myFloat = 5.99f;
		double doub1 = myFloat;
		System.out.println(doub1);
		System.out.println(myFloat);
		
		// Narrowing Casting Example
		double doub2 = 9.81;
		int myInt1 = (int) doub2; // Manual Casting : double to int.
		System.out.println(myInt1);
	
		double doub3 = 10.8444;
		float float2 = (float)doub3;
		int int4 = (int)float2;
		System.out.println(float2);
		System.out.println(int4);
		
		
	}

}
