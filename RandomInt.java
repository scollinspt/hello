/* Program 1.2.5 Casting to get a random integer (RandomInt) from Chapter 1 of CSI
  takes a number and multiplies it by a random number and then casts - I've 
 modified the program to explicitly explain what's happenning since it's a new 
concept for me */

public class RandomInt
{
	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		double r = Math.random(); // uniform between 0.0 and 1.0
		double s = r*n;		  // uniform beteen 0 and n-1 
		int value = (int) (s);  // casting to get an integer
		System.out.println("Integer entered: " + n);
		System.out.println("Random double: " +  r);
		System.out.println("Integer multiplied by Rnd double equals the double: " + s);
		System.out.println("Integer casting of " + s + " is equal to the closest integer: "  + value);
	}
}
