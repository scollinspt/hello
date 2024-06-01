/* Exercise 1.2.20 Write a program that prints the sum of two random integers between 1 and 6 (such as you get when rolling dice). */

public class Ex1220
{
	public static void main(String[] args)
	{
		double r1 = Math.random();
		int dice1 = 1 + (int)(r1*6);
		double r2 = Math.random(); //since I'm not sure whether Math.random() would be the same
		int dice2 = 1 + (int)(r2*6);
		System.out.println("Dice 1 is: " + dice1 + " and Dice 2 is: " + dice2 + " and their sum is: " + (dice1+dice2));
	}
}
