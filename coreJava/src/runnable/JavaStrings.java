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
		
		/*
		 * Method	Description	Return Type
		charAt()	Returns the character at the specified index (position)	char
		codePointAt()	Returns the Unicode of the character at the specified index	int
		codePointBefore()	Returns the Unicode of the character before the specified index	int
		codePointCount()	Returns the number of Unicode values found in a string.	int
		compareTo()	Compares two strings lexicographically	int
		compareToIgnoreCase()	Compares two strings lexicographically, ignoring case differences	int
		concat()	Appends a string to the end of another string	String
		contains()	Checks whether a string contains a sequence of characters	boolean
		contentEquals()	Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer	boolean
		copyValueOf()	Returns a String that represents the characters of the character array	String
		endsWith()	Checks whether a string ends with the specified character(s)	boolean
		equals()	Compares two strings. Returns true if the strings are equal, and false if not	boolean
		equalsIgnoreCase()	Compares two strings, ignoring case considerations	boolean
		format()	Returns a formatted string using the specified locale, format string, and arguments	String
		getBytes()	Converts a string into an array of bytes	byte[]
		getChars()	Copies characters from a string to an array of chars	void
		hashCode()	Returns the hash code of a string	int
		indexOf()	Returns the position of the first found occurrence of specified characters in a string	int
		intern()	Returns the canonical representation for the string object	String
		isEmpty()	Checks whether a string is empty or not	boolean
		join()	Joins one or more strings with a specified separator	String
		lastIndexOf()	Returns the position of the last found occurrence of specified characters in a string	int
		length()	Returns the length of a specified string	int
		matches()	Searches a string for a match against a regular expression, and returns the matches	boolean
		offsetByCodePoints()	Returns the index within this String that is offset from the given index by codePointOffset code points	int
		regionMatches()	Tests if two string regions are equal	boolean
		replace()	Searches a string for a specified value, and returns a new string where the specified values are replaced	String
		replaceAll()	Replaces each substring of this string that matches the given regular expression with the given replacement	String
		replaceFirst()	Replaces the first occurrence of a substring that matches the given regular expression with the given replacement	String
		split()	Splits a string into an array of substrings	String[]
		startsWith()	Checks whether a string starts with specified characters	boolean
		subSequence()	Returns a new character sequence that is a subsequence of this sequence	CharSequence
		substring()	Returns a new string which is the substring of a specified string	String
		toCharArray()	Converts this string to a new character array	char[]
		toLowerCase()	Converts a string to lower case letters	String
		toString()	Returns the value of a String object	String
		toUpperCase()	Converts a string to upper case letters	String
		trim()	Removes whitespace from both ends of a string	String
		valueOf()	Returns the string representation of the specified value	String
		 */
		String p = "20";
		int q = 5;
		String z = p+q;
		System.out.println(z);
		// String- Special Characters
		// Backslash escape character -> turns special characters into string caracters.
		/* \' 	->	 ' 		Single quote
		 * \" 	-> 	 "		Double quote
		 * \\   ->   \      Back slash
		 * See the examples below
		 */
		String text = " We are the so-called \"Vikings\" from the north.";
		System.out.println(text);
		String txt = "It\'s alright.";
		System.out.println(txt);
		String txt1 = "The character \\ is called Backlash";
		System.out.println(txt1);
		String txt2 = "The caracter \'/\'is called frontslash";
		System.out.println(txt2);
		/* Common escape sequences that are valid in Java are:
		 * \n   -> New Line
		 * \r   -> Carriage Return
		 * \t   -> Tab
		 * \b   -> Backspace
		 * \f   -> form Feed
		 */
		String txt3 = "Chapter 3 \n FORCE";
		System.out.println(txt3);
		String txt4 = "\t NOTICE \n \t It is advisable to take extra caution to travel into conflict areas in Ethiopia";
		System.out.println(txt4);
		
	}

}
