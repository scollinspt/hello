/* Exercise 1.2.14 Write a program that takes two positive integers as
 * command line arguments and prints true if either evenly divides the other */

public class Ex1214
{
	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		boolean bool1 = a%b  == 0;
		boolean bool2 = b%a == 0; 
		System.out.println(bool1 || bool2);
	}
}
