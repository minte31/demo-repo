package runnable;

public class JavaBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Very often in programming, you'll need a data type that can only have two values, like:
 * YES/NO
 * ON/OFF
 * TRUE/FALSE
 * For this, Java has a boolean data type, which can store true or false values.
 * Boolean Values -> A boolean type is declared with the boolean keyword and can only take
 * the values true or false:
 */
		boolean isJavaFun = true;
		boolean isFishyTasty = false;
		System.out.println(isJavaFun);
		System.out.println(isFishyTasty);
	/*
	 * A comparsion operator, such as the greater than (>) operator, to find out if an expression(or variable)
	 * is true or false: 
	 */
		int x = 10;
		int y = 12;
		System.out.println(x>y); // returns false
		System.out.println(x==10);// returns true
	// Real life example
		int myAge = 25;
		int votingAge = 18;
		System.out.println(myAge>votingAge);
		if(myAge>= votingAge)
				{
			System.out.println("I am old enough to vote");
				}
			else {
				System.out.println("I am not eligble to vote");
			    }
			}
		}
