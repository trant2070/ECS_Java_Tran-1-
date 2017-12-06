import java.util.Scanner;

public class ALittleQuiz 
{
	public static void main( String[] args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		int a1, a2, a3;
		int correctAnswers=0;
		
		
		System.out.println("Q1) What is the capital of Alaska?");
		System.out.println(" 		1) Melbourne");
		System.out.println(" 		2) Anchorage");
		System.out.println(" 		3) Juneau");
		System.out.print(">");
		a1 = keyboard.nextInt();
		System.out.println("");
		
		if(a1>2 && a1<4)
		{
			System.out.println("That's Right!");
			correctAnswers++;
		}
		else if(a1>0 && a1<2)
		{
			System.out.println("Nope");
		}
		else
		{
			System.out.println("Nope");
		}
		System.out.println("");
		
		System.out.println("Q2) Can you store the value 'cat' in a variable of type int?");
		System.out.println(" 		1) Yes");
		System.out.println(" 		2) No");
		
		System.out.print(">");
		a2 = keyboard.nextInt();
		System.out.println("");
		
		if(a2>1 && a2<3)
		{
			System.out.println("That's Right!");
			correctAnswers++;
		}
		else if(a2>0 && a2<2)
		{
			System.out.println("Sorry, 'cat' is a string. ints can only store numbers.");
		}
		System.out.println("");
		
		System.out.println("Q3) What is the result of 9+6/3?");
		System.out.println(" 		1) 5");
		System.out.println(" 		2) 11");
		System.out.println("		3) 15/3");
		
		System.out.print(">");
		a3 = keyboard.nextInt();
		System.out.println("");
		
		if(a3>1 && a3<3)
		{
			System.out.println("That's Right!");
			correctAnswers++;
		}
		else if(a3>0 && a3<2)
		{
			System.out.println("Just no.");
		}
		else
		{
			System.out.println("your KIDDING! :/");
		}
		System.out.println("");
		
		System.out.println("Overall, you got " + correctAnswers +" out of 3 correct.");
		System.out.println("Thanks for playing!");
		
		keyboard.close();
	}
}
