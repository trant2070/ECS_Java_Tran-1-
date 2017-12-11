import java.util.Random;
import java.util.Scanner;

public class HiLowLimited
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int x =  r.nextInt(100);
		int num1;
		int tries = 0;
		
		
		System.out.println("I'm thinking of a number between 1-100. Try to guess it.");
		num1 = keyboard.nextInt();
		
		
		System.out.println("");
		
		
		while(num1 != x && tries < 7)
		{
			if(num1 < x)
			{
				System.out.println("Sorry, you are too low." );
			}
			if(num1 > x)
			{
			System.out.println("Sorry, you are too High.");
		
			}
			if(num1 == x)
			{
				System.out.println("You guessed it! What are the odds?!?");
			}
			num1 = keyboard.nextInt();
			tries++;
			
		}
		if(num1 == x)
		{
			System.out.println("You guessed it! What are the odds?!?");
		}
		else if(tries >= 7)
		{
			System.out.println("Sorry, you didn't guess it in 7 tries. You lose.");
		}
		
		
		keyboard.close();
	}	
}