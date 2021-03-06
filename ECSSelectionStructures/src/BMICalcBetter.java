import java.util.Scanner;

public class BMICalcBetter 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		
		double BMI, feet, inches,weight;
		
		System.out.println("BMI ( Body Mass Index) is a way of representing your size.");
		System.out.println("");
		
		System.out.print("How many feet tall are you?");
		feet = keyboard.nextDouble();
		
		System.out.print("How many inches?");
		inches = keyboard.nextDouble();
		
		System.out.print("How many pounds do you weigh?");
		weight = keyboard.nextDouble();
		System.out.println("");
		
		BMI = (weight*.4536)/(((feet + inches/12)*.3048)*(((feet + inches/12)*.3048)));
		System.out.println("Your BMI is: " + BMI);
		if(BMI<18.5)
		{
			System.out.println("You are underweight");
		}
		if(BMI>18.5 && BMI<24.9)
		{
			System.out.println("You are normal");
		}
		if(BMI>24.9 && BMI<29.9)
		{
			System.out.println("You are overweight");
		}
		if(BMI>30)
		{
			System.out.println("You are OBESE");
		}
		keyboard.close();
		
	}
}
