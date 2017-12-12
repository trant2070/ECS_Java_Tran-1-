import java.util.Scanner;

public class CountingMachineRevisted
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in) ;
		int num;
		int countby;
		int countfrom;
		
		System.out.println("Count from: ");
		countfrom = keyboard.nextInt();
		
		System.out.println("Count to: ");
		num = keyboard.nextInt();
		
		System.out.println("Count by ");
		countby = keyboard.nextInt();
		
		for(int n = countfrom; n <= num; n = n + countby)
		{
			System.out.print(n + " ");
			
		}
	}
}