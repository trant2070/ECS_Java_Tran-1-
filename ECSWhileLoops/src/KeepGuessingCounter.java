import java.util.Random;
import java.util.Scanner;

public class KeepGuessingCounter 
{
	public static void main(String[] args)
	{
	
	Random r = new Random();
	Scanner keyboard = new Scanner(System.in);
	int x =  1 + r.nextInt(10);
	System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
	int num;
	int counter = 0;
	System.out.print("Your guess: ");
	num = keyboard.nextInt();
	
	while(num != x )
	{
	
		
		System.out.println("That is incorrect. guess again.");
		System.out.print("Your guess: ");
		num = keyboard.nextInt();
		counter++;
	}
	
	System.out.println("That's right! Your're a good guesser.");
	System.out.println("It only took you " + counter + " tries.");
	}
	

	
	
}
