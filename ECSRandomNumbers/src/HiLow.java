import java.util.Random;
import java.util.Scanner;

public class HiLow 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int x =  r.nextInt(100);
		int num1;
		
		
		System.out.println("I'm thinking of a number between 1-100. Try to guess it.");
		num1 = keyboard.nextInt();
		
		
		System.out.println("");
		if(num1 < r.nextInt(100))
		{
			System.out.println("Sorry, you are too low. I was thinking of " +  x + "." );
		
		}
		if(num1 > r.nextInt(100))
		{
			System.out.println("Sorry, you are too High. I was thinking of " +  x + ".");
		
		}
		if(num1 == r.nextInt(100))
		{
			System.out.println("You guessed it! What are the odds?!?");
		}
		
		
		
		keyboard.close();
	}	
}