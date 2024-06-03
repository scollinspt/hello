/* Program 1.3.1 from CSI book on a flipping coin. */

public class Flip
{
	public static void main(String[] args)
	{ //simulate a fair coin
		if (Math.random() < 0.5) 	System.out.println("Heads");
		else				System.out.println("Tails");
	}
}
