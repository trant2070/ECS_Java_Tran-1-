import java.util.Scanner;

public class CollatzSequence 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int x;
		
		System.out.println("Let's create a COLLAT SEQUENCE!");
		
		
		System.out.println("Rules: ");
		System.out.println("If the number is even, divide it by two.");
		System.out.println("If the number is odd, Multiply by 3 and add 1");
		System.out.println("Repeat this decision until you reach 1");
		
		System.out.print("Starting Number: ");
		x = keyboard.nextInt();
		System.out.println("");
		do
		{
			if(x %2 == 0)
			{
				System.out.print(" - " + x / 2);
				x = x/2;
			}
			else
			{
				System.out.print(" - " + ((x * 3) + 1));
				x = (x*3) + 1;
			}
		}while(x != 1);
	}
}
