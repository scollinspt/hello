/*Program that does the Quadratic Formula incorrecly for Ex1.2.12 from
 * computer science an interdisciplinary approach */
public class QuadWrong
{
	public static void main(String[] args)
	{
		double b = Double.parseDouble(args[0]);
		double c = Double.parseDouble(args[1]);
		double discriminant = b*b - 4.0*c;
		double d = sqrt(discriminant);
		System.out.println((-b + d) / 2.0);
		System.out.println((-b - d) / 2.0);
	}
}
