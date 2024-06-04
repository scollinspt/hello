
/*A for loop example based on the powers of two program for powers of ten */

public class PowersOfTen
{
	public static void main(String[] args)
	{	// Print first n powers of 2.
		int n = Integer.parseInt(args[0]);
		if(n >= 10){
			System.out.println("The integer " + n + " is too large, enter an integer less than 10."); 
			System.exit(0);
		}
		int power = 1;
		for (int i = 0; i <= n; i++)
		{ // Print ith power of 2
			System.out.println(i + " " + power);
			power = 10 * power;
		}
	}
}










	
		








