import java.util.Scanner;

public class UserInputData 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name, lastName, login;
		int studentID, grade;
		Double GPA;
		
		System.out.println("Please enter the following information so I can sell it for profit");
		
		System.out.println("First name: ");
		name = keyboard.next();
		
		System.out.println(" Last name: ");
		lastName = keyboard.next();
		
		System.out.println("Grade (9-12): ");
		grade = keyboard.nextInt();
		
		System.out.println("Student ID: ");
		studentID = keyboard.nextInt();
		
		System.out.println("Login: ");
		login = keyboard.next();
		
		System.out.println("GPA: ");
		GPA = keyboard.nextDouble();
		
		System.out.println("Your information:  ");
		System.out.println("	Login: " + login );
		System.out.println("	ID: " + studentID );
		System.out.println("	Name: " + lastName + ", " + name );
		System.out.println("	GPA: " + GPA);
		System.out.println("	Grade: " + grade);
		
		keyboard.close();
	}
}