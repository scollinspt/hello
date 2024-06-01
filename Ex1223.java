/*Write a program that takes two integer command-line arguments m and d and prints true if day d of month m is between 3/20 and 6/20, and false otherwise.*/

public class Ex1223
{
	public static void main(String[] args)
	{
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
		boolean isSpring = (month == 3 && day >= 20 && day <= 31)
		       		|| (month == 4 && day >= 1 && day <= 30)
				|| (month == 5 && day >= 1 && day <= 31)
				|| (month == 6 && day >= 1 && day <= 20);
		System.out.println(isSpring);
	}
}	
