package runnable;

public class JavaIdentifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/* All Java Variables must be identified with Unique Names
	 * Identifiers can be short Names (like x and Y) or More descriptive
	 * names (like age, sum,totalVolume)	
	 */
		int minutesPerHour = 60;
		
		int m = 60;
		/* Names can contain letters, digits, underscores, and dollar signs
Names must begin with a letter
Names should start with a lower case letter, and cannot contain whitespace
Names can also begin with $ and _ (but we will not use it in this tutorial)
Names are case-sensitive ("myVar" and "myvar" are different variables)
Reserved words (like Java keywords, such as int or boolean) cannot be used as names */
	//Java Data types
	/* A variable in java must be a specified data type: */
		
		int myNum = 5; // Integer (whole number)
		float myFloatNum = 5.99f; // Floating point Number
		char myLetter = 'D';// Character
		boolean myBool = true; // Boolean - takes true/false value
		String myText = "Hello";
		
	/* Data types divided into two groups:
	 * Primitive data types- include byte,short,int,long,float,
	 * double,boolean and char
	 * Primitive number types divided in to Two ( Integer Types and Floating Point Types)
	 * Integer Types ( Whole numbers, +ve or -ve) without decimals
	 * Floating Point types : represent numbers with fractional parts containing one or more decimals
	 * float and double are types of Floating point types
	 * Non Primitive data type Such as String, Arrays, and Classes
	 */
		// Integer types
		// Byte -> a data type that stores whole numbers from -128 to 127
		byte myNum1 = -128; 
				System.out.println(myNum1);
		// Short -> a data type that can store whole numbers from -32768 to 32767
		short myNum2 = -32000;
		System.out.println(myNum2);
		// int -> is a data type that can store whole numbers from -2147483648 to 2147463647
		// int data type is the preferred data type when creating a numeric value
		int myNum3 = 30000;
		System.out.println(myNum3);
		// Long ->  a data type that can store whole numbers from -9223372036854775808 to 9223372036854775807
		// Note we should end the value with a letter 'L'
		long myNum4 = 1500000000000L;
		System.out.println(myNum4);
		// Floating Point Types
		/* Use a floating point type whenever you need a number with a decimal,
		 *such as 9.99 or 3.14515.
		 *float and double data types can store fractional numbers.Note you should end the values 
		 *with an "f" for floats and "d" for doubles: */
			float myNum5 = 54.455f;
			System.out.println(myNum5);
		    double myNum6 = 0.75;
		    System.out.println(myNum6);
		 // Scientific Numbers -> A floating point Number can also be a scientific number with an "e" to indicate the power of 10
		    float f1 = 35e3f;
		    double d1 = 12e4;
		    System.out.println(f1);
		    System.out.println(d1);
		    
		  // Java Boolean Data Types
		  // Boolean types -> java has a Boolean data type, which can only take true or false
		    boolean isJavaFun = true;
		    boolean isFishTasty = false;
		    System.out.println(isJavaFun);
		    System.out.println(isFishTasty);
		  
		  // Characters
		    
		    char myGrade = 'B';
		    System.out.println(myGrade);
		 
		    // ASCII VALUES
		    char myVar1 = 65, myVar2 = 66, myVar3 = 67;
		    
		    System.out.println(myVar1);// display letter 'A'
		    System.out.println(myVar2);// display letter 'B'
		    System.out.println(myVar3); // display letter 'C'
		    
		    // Strings
		    /* The String data type is used to store a sequence of characters(text).
		     * String Values must be surrounded by double quotes
		     * String in Java is actually a non- Primitive data type, because it refers to an object.
		     */
		    String greeting = "Hello World ";
		    System.out.println(greeting);
		    
		   // Non-Primitive data types
		   /* Non Primitive data types are called reference types because they refer to objects
		    * Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).
			Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
			A primitive type has always a value, while non-primitive types can be null.
			A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
			Examples of non-primitive types are Strings, Arrays, Classes, Interface, etc. You will learn more about these in a later chapter.
		    */
	}

}
