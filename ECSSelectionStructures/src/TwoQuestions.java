import java.util.Scanner;
public class TwoQuestions 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String type, size;
		
		System.out.println("Think of an object, and I'll try and guess what it is!");
		System.out.println("");
		
		System.out.println("Question 1) Is it an animal, vegetable or mineral?");
		type = keyboard.next();
		System.out.println("");
		
		System.out.println("Question 2) Is it bigger than a breadbox?");
		size = keyboard.next();
		
		if(type.equals("animal") && size.equals("no"))
		{
			System.out.println("Is it a SQUIRREL?!");
		}
		if(type.equals("vegetable") && size.equals("no"))
		{
			System.out.println("Is it a WATERMELON?!");
		}
		if(type.equals("mineral") && size.equals("no"))
		{
			System.out.println("Is it a PAPER CLIP?!");
		}
		if(type.equals("animal") && size.equals("yes"))
		{
			System.out.println("Is it a MOOSE?!");
		}
		if(type.equals("vegetable") && size.equals("yes"))
		{
			System.out.println("Is it a WATERMELON?!");
		}
		if(type.equals("mineral") && size.equals("yes"))
		{
			System.out.println("Is it a CAMARO?!");
		}
	}
}