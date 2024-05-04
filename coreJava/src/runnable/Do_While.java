package runnable;
import java.util.Scanner;

public class Do_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /*
     * The Do loop is appropriate when the loop body must be executed at least once.
     * do
     * {
     * 	Statement
     * }
     * while (condition);
     */
		Scanner in = new Scanner(System.in);
		
		double value;
		do
		{
			System.out.println("Enter a number >= 0: ");
			value = in.nextDouble();
		}
		while (value <0);
		double root = Math.sqrt(value);
		System.out.println("The square root of the number is: " +" "+ root);
	}

}
