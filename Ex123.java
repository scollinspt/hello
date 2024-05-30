/* Exercise 1.2.3 Supposed that a and b are boolean variables, show that the expression evaluates to true in all instances of a and b. (!(a&&b)&&(a||b))||((a&&b))||!(a||b)) 
 */

public class Ex123
{
	public static void main(String[] args)
	{
		System.out.println((!(true&&true)&&(true||true))||((true&&true))||!(true||true));
		System.out.println((!(true&&false)&&(true||false))||((true&&false))||!(true||false));
		System.out.println((!(false&&true)&&(false||true))||((false&&true))||!(false||true));
		System.out.println((!(false&&false)&&(false||false))||((false&&false))||!(false||false));
		System.out.println(2 + "bc");
		System.out.println(2 + 3 + "bc");
		System.out.println((2+3) + "bc");
		System.out.println("bc" + (2+3));
		System.out.println("bc" + 2 + 3);
		System.out.println('b');
		System.out.println('b' + 'c');
		System.out.println((char)('a' + 4));
	}
}
