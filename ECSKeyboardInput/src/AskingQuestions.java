import java.util.Scanner;

public class AskingQuestions 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age, feet, inches;
		double weight;
		
		System.out.println("What is your name?");
		name = keyboard.next();
		
		System.out.println("How old are you?");
		age = keyboard.nextInt();
		
		System.out.println("How many feet tall are you?");
		feet = keyboard.nextInt();
		
		System.out.println("how many inches?");
		inches = keyboard.nextInt();
		
		System.out.println("How much do you weigh?");
		weight = keyboard.nextDouble();
		
		System.out.println("So you're name is " + name + ", you are" + age + " years old, you're " + feet + "'" + inches + " , and your weigh " + weight + " pounds.");
		
		keyboard.close();
	}
}
