package runnable;

public class Java_WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Loops:
		 * Loops can execute a block of code as long as a specified condition is reached.
		 * Loops are handy because they save time, reduce errors, and they make the code more readable.
		 * 
		 * (1) Java While Loop
		 * The while loop loops through a block of code as a specified condition is true:
		 * see the code below:
		 */
		int i = 0;
		while(i <= 5)
			{
				System.out.println(i);
				i++; 	
			} 
		/* Do not forget to increase/decrease the variable used in the condition/Otherwise the loop
		will never end. */
		// The DO/WHILE Loop
		/* The do/While loop is a variant of the while loop. This loop will execute the code block once,
		 * before checking if the condition is true, then it will repeat the loop as long as the condition is
		 * true.
		 * The do/while loop will always be executed at least once, even if the condition is false, because the
		 * code block is executed before the condition is tested:
		 */
		int z = 0;
		do {
			System.out.println(z);
			z ++;
		}
		while (z<5);
}
	

}
