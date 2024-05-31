

/* Exercise 1.2.18 Write a program that takes two integers from command line arguments x and y and prints the Euclidean distance from the point (x,y) to the origin (0, 0). */

public class Ex1218
{
	public static void main(String[] args)
	{
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		System.out.println("Euclidean distance = " + Math.sqrt(x*x+y*y));
	}
}
