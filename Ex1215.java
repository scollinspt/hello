/* Exercise 1.2.15 Write a program that takes three  positive integers as
 * command line arguments and prints false if any of them is greater or equal to the sum of the other two and true otherwise. (note: this computation tests whether the three numbers could be lengths of the sides of some triangle.) */

public class Ex1215
{
	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		boolean test1 = !(c >= a + b);
		boolean test2 = !(a >= b + c);
	        boolean test3 = !(b >= c + a);
		System.out.println(test1 && test2 && test3);
	}
}
