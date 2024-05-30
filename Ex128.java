/*Execise 1.2.8 Find the square root of a number */
public class Ex128
{
	public static void main(String[] args)
	{
		double b = Double.parseDouble(args[0]);	
		double ans = Math.sqrt(b);
		System.out.println("The square root of " + b + " equals " + ans);
	}
}
