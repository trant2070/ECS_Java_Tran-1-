import java.util.Scanner;

public class AgeIn5 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.println("Hello. What is your name?");
		name = keyboard.next();
		
		System.out.println("Hi," + name+ "! How old are you?");
		age = keyboard.nextInt();
		
		System.out.println("Did you know tha tin five years you will be " + (age + 5) );
		System.out.println("And five years ago you were " + (age - 5) + "! Imagine that!");
		
		keyboard.close();
	}
}