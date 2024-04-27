package runnable;

public class JavaStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /* Java Strings are used for storing text.
      * A String Variable contains a collection of characters surrounded by double quotes
      *  
      */
		String greeting = "Hello";
		System.out.println(greeting);
		// String Length
		/* A string in java is actually an object, which contains methods that
		 * can perform certain operation on strings. For example, the length of a string
		 * can be found with the length() method:
		 */
		System.out.println(greeting + " " + greeting.length()); // returns the value of greeting and its length in int value
		
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(alphabet.length()); // returns the length of the character
	
	// More String Methods
	/* Many more available methods for example toUpperCase() and toLowerCase()
	 */
		String firstName = "mintesnot";
		String lastName = "yirga";
		
		System.out.println(firstName.toUpperCase() + " " + lastName.toUpperCase());
		
		String city1 = "ATLANTA";
		String city2 = "NEW YORK";
		
		System.out.println(city1.toLowerCase());
		System.out.println(city2.toLowerCase());
	
	// Finding a Character in a String
	/* The indexOf() method returns the index(the Position) of the first occurrence
	 * of a specified text in a string (including whitespace)
	 */
		String find = "Please locate where 'locate' occurs ! ";
		System.out.println(find.indexOf("locate"));// ** counts the whitespace
		
	// Complete String Reference
		System.out.println(firstName + " ".concat(lastName));
	}

}
