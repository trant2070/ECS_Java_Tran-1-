import java.util.Scanner;

public class EnterPIN 
{
	public static void main( String [] args)
	{
		Scanner keyboard= new Scanner(System.in);
		int pin = 12435;
		
		System.out.println("WELCOME TO THE BANK OF JOMALIA.");
		System.out.print("ENTER YOUR PIN: ");
		int entry = keyboard.nextInt();
		
		while(entry !=pin )
		{
			System.out.println("/nINCORRECT PIN> TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}
		
		System.out.println("/n PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR A");
	}
}
