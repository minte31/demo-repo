package runnable;

public class Java_IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * Java has the following conditional statements:
		 * Use if to specify a block of code to be executed, if a specified condition is TRUE
		 * Use else to specify a block of code to be executed, if the same condition is FALSE
		 * Use else-if to specify a new condition to test, if the first condition is FALSE
		 * Use switch to specify many alternative blocks of code to be executed.
		 */
		
		// if example (if should always be written in lowercase)
		if (20>18) {
			System.out.println("20 is greater than 18");
		} //block of code can only be executed ONLY if the specified condition is True
		
		// Testing variables 
		int x = 20;
		int y = 18;
		if(x>y) // condition is true thus the block of code is going to be executed
		{
			System.out.println("x is greater than y");
		}
		
		// The else Statement
		// Use the else statement to specify a block of code to be executed if the condition is false
		
		int temp = 40;
		if (temp <= 25) {
			System.out.println("The weather is wonderful!"); // this block of code can only be executed if the condition is TRUE
		}else {
			System.out.println("It is too Hot!");	// this block of code to be executed if the condition is FALSE
	   }
		
		// The else if statement
		// Use the else if statement to specify a new condition if the first condition is FALSE
		int time = 18;
		if (time < 10)
		{
			System.out.println("Good Morning.");// Block of code to be executed if condition 1 is true
		}else if(time < 18) {
			System.out.println(" Good Day."); // Block of code to be executed if condition 1 is false and condition 2 is true
		} else {
			System.out.println(" Good Evening");// Block of code to be executed if both condition 1 and condition 2 are false
		}
	// Short Hand if else
		/* There is also a short hand if else, which is known as the ternary operator because it consists of
		 * three operands.
		 * It can be used to replace multiple lines of code with a single line, and is most often used to
		 * replace simple if else statements:
		 * Syntax : variable = (condition)? expression True: expression False;
		 */
		/* Instead of:
		 *  int o = 18;
			int p = 38;
			if(o<p) // condition is true thus the block of code is going to be executed
			{
				System.out.println("o is less than p");
		*/ // use
		int o =18, p =38;
		String value = (o<p)? "o is less than p":"o is greater than p";
		System.out.println(value);
		
		// Java Switch
		/* Java Switch Statements
		 * Instead of writing many if..else statements, you can use switch statement.
		 * The switch statement selects one of many code blocks to be executed:
		 * How it works?
		 * The switch expression is evaluated once.
		 * The value of the expression is compared with the values of each case.
		 * If there is a match, the associated block of code is executed.
		 * The break and default keywords are optional.
		 * See the example below:
		 */
		int day = 7;
		switch (day) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
					System.out.println("Looking forward to the weekend");
		}
		/* The Break Keyword
		 * When Java reaches a break keyword, it breaks out of the switch block.
		 * This will stop the execution of more code and case testing inside the block.
		 * When match is found, and the job is done, it is time for break. There is no need for more testing.
		 * A break can save a lot of execution time because it "ignores" the execution of all the
		 * rest of the code in switch block.
		 * The default Keyword
		 * The default keyword specifies some code to run if there is no case match
		 */
		} 
	}

