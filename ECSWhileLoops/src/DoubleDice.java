import java.util.Random;

public class DoubleDice
{
	public static void main ( String[] args )
	{
		Random r = new Random();
		
		int x = r.nextInt(6); 
		int y =  r.nextInt(6);
		
		System.out.println("Here comes the dice!");
		
		while(x != y)
		{
		 x = r.nextInt(6);
		 y = r.nextInt(6);
			System.out.println("Roll #1: " + x );
			System.out.println("Roll #2: " + y);
			System.out.println("the total is: " + (x+y) + "!");

		}
	}
}