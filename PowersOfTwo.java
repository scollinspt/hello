/* PowersOfTwo is Program 1.3.3. in CSI on looking to create a table. */

public class PowersOfTwo
{
	public static void main(String[] args)
	{	// Print first n powers of 2.
		int n = Integer.parseInt(args[0]);
		if(n >= 31){
			System.out.println("The integer " + n + " is too large, enter an integer less than 31."); 
			System.exit(0);
		}
		int power = 1;
		int i = 0;
		while (i <=n)
		{ // Print ith power of 2
			System.out.println(i + " " + power);
			power = 2 * power;
			i = i + 1;
		}
	}
}
