import java.util.Scanner;

public class AddingValuesForLoop
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in) ;
		int num;
		
		System.out.println("Number: ");
		num = keyboard.nextInt();
		
		int sum = 0;
		for(int n = 1; n <= num; n = n + 1)
		{
			sum += n;
			System.out.print(n + " ");
			
		}
		System.out.println("");
		System.out.println("Your sum is " + sum + ".");
	}
}
