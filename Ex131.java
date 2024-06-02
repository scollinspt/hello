
/* Exercise 1.2.21 Write a program that takes a double command-line argument t and prints the value of sin(2t) + sin(3t). */

public class Ex1221
{
	public static void main(String[] args)
	{
		double degrees = Double.parseDouble(args[0]);
		double radians = Math.toRadians(degrees);
		double sum = Math.sin(2 * radians) + Math.sin(3 * radians);
		System.out.println("Sin(2t) + Sin(3t) when t degrees =  " + degrees + " = " + sum);
	}
}
