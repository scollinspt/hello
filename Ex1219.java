/* Exercise 1.2.19 Write a program that takes two integers from command line arguments a and b and prints a random integer between a and b inclusive. */
import java.util.Random;
public class Ex1219
{
	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		double r = Math.random();
		int c = a + (int)(r*(b-a));
		System.out.println("lower bound is: " + a);
		System.out.println("upper bound is: " + b);
		System.out.println("random number between 0 and 1 is " + r);
		System.out.println("r * (b-a) is " + (int)(r*(b-a)));
		System.out.println("A random integer between " + a + " and " + b + " is " + c);
	}
}
