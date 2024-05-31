
/* Exercise 1.2.16 find the double force correctly */

public class Ex1216
{
	public static void main(String[] args)
	{
		double m1 = Double.parseDouble(args[0]);
		double m2 = Double.parseDouble(args[1]);
		double r = Double.parseDouble(args[2]);
		double G = 9.8;
		System.out.println("Incorrect answer: " + G*m1*m2/r*r);
		System.out.println("Correct answer: " + (G*m1*m2)/(r*r));
	}
}
