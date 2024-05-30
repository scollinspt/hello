/* Exercise 1.2.2 Write a program that uses Math.sin() and Math.cos() to check that the value of cos^2 theta + sin^2 theta is approximately 1 for any theta entered as a command line argument. Just print the value. Why are the values not always exactly 1?
 */

public class Ex122
{
	public static void main(String[] args)
	{
		double theta = Double.parseDouble(args[0]);
		double ans = (Math.cos(theta) * Math.cos(theta)) + (Math.sin(theta) * Math.sin(theta));
		System.out.println(ans);
	}
}
