package runnable;

public class Java_ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Java For Loop
 * When you know exactly how many times you want to loop through a block of code,
 * use the for loop instead of a while loop:
 * SYNTAX: for(statement 1; statement 2; statement 3){ // code block to be executed}
 * statement 1 is executed one time before the execution of the code block
 * statement 2 defines the condition for executing the code block.
 * statement 3 is executed every time after the code block has been executed.
 * see the code below:
 */
	for(int i =0; i<=5;i++)	{ //statement 1 (int i = 0) sets the variable before the loop starts
		System.out.println(i); // statement 2 (i <=5) defines the condition to run, If the condition true the loop will start over again,if false the loop ends
	   }// statement 3 (i++) increases a value each time the code block in the loop has been executed.
	//example 2
	for(int i = 0; i <= 10; i=i+2)
		{
		 System.out.println(i);	
		}
	// Nested Loop
	/* It is also possible to place a loop inside another loop. This is called a nested loop.
	 * The " Inner Loop" will be executed one time for each iteration of the "Outer loop"
	 */
	for(int i =1; i<=2;i++) 
		{
			System.out.println("Outer: "+ i); //Executes 2 times
		
		for(int j =1; j<=3; j++)
		{
			System.out.println("Inner: "+ j);// Executes 6 times (2*3)
		}
	 }
	}
}

