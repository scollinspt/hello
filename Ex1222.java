/* Exercise 1.2.22 Write a program that takes three double CL arguments x0, v0, and t and prints the value of x0 + v0t-gt^2/2 where g is the constant 9.80665. Note: this is the disclacement in meters after t seconds when an object is thrown straight up from an initial position x0 at velocity v0 meters per second. */

public class Ex1222
{
	public static void main(String[] args)
	{
		double x = Double.parseDouble(args[0]);
		double v = Double.parseDouble(args[1]);
		double t = Double.parseDouble(args[2]);
		double g = 9.80665;
		double distance = x + (v*t) + ((g*t*t)/2);
		System.out.println("When starting at position " + x + ", with a velocity of " + v + " meters per second, distance after " + t + " seconds is " + distance + " meters." );
	}
}
