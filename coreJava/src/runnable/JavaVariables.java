package runnable;

public class JavaVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
    String - stores text, such as "Hello". String values are surrounded by double quotes
	int - stores integers (whole numbers), without decimals, such as 123 or -123
	float - stores floating point numbers, with decimals, such as 19.99 or -19.99
	char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
	boolean - stores values with two states: true or false*/
	// type variableName = value;
		String name = "John";
		System.out.println(name);
		int myNum = 15;
		System.out.println(myNum);
		int myNum1;
		myNum1 = 30;
		System.out.println(myNum1+ myNum);
		myNum = 20;// changes the value of myNum from 15 to 20
		System.out.println(myNum);
		// Final Variables - to avoid overwriting use Final keyword
		final int myNum2 = 90;
		System.out.println(myNum2);
		float myFloatNum = 5.99f;
		char myLetter = 'D';
		boolean myBool = true;
		String myText = "Minte";
		System.out.println(myFloatNum + " "+ myText);
		System.out.println(myLetter);
		System.out.println(myText + " "+ "Yirga");// + character used to combine the strings
		// + can be used to add a character to another variable
		String firstName = "Mintesnot";
		String lastName = "Yirga";
		String fullName = firstName + " " + lastName;
		System.out.println(fullName);
		// for numeric values the '+' character works as a mathematical operator
		int x = 10;
		int y = 20;
		int add = x+y;// adds the two variables
		int multiply = x*y;// multiplies
		int divide = x/y;// divides
		System.out.println(add);
		System.out.println(multiply);
		System.out.println(divide);
		// Declaring Multiple variables
		// To declare multiple variables of the same type, we can use comma separated list
		int a = 4,  b = 5,  c = 10;
		System.out.println(a+b+c);
		
		// One value to Multiple variables
		int d ,e,f;
		 d = e = f = 90;
		 System.out.println(d+e+f);
		
	}

}
