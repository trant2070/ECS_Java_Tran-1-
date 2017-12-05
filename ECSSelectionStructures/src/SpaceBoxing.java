import java.util.Scanner;
public class SpaceBoxing 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		
		double Venus, Mars, Jupiter, Saturn, Uranus, Neptune;
		int earthweight, planet;
		Venus = .78;
		Mars = .39;
		Jupiter = 2.65;
		Saturn = 1.17;
		Uranus = 1.05;
		Neptune = 1.23;
		
		System.out.println("Please enter your current earth weight: " );
		earthweight = keyboard.nextInt();
		
		System.out.println("I have information for the following planets:");
		System.out.println("1.Venus		2. Mars		3. Jupiter");
		System.out.println("4. Saturn	5. Uranus	6. Neptune");
		
		System.out.println("Which planet are you visiting?");
		planet = keyboard.nextInt();
		
		if(planet>0 && planet <2)
		{
			System.out.println("Your weight would be " + (earthweight * Venus) + " pounds on that planet.");
		}
		
		if(planet>1 && planet <3)
		{
			System.out.println("Your weight would be " + (earthweight * Mars) + " pounds on that planet.");
		}
		
		if(planet>2 && planet <4)
		{
			System.out.println("Your weight would be " + (earthweight * Jupiter) + " pounds on that planet.");
		}
		
		if(planet>3 && planet <5)
		{
			System.out.println("Your weight would be " + (earthweight * Saturn) + " pounds on that planet.");
		}
		
		if(planet>4 && planet <6)
		{
			System.out.println("Your weight would be " + (earthweight * Uranus) + " pounds on that planet.");
		}
		
		if(planet>5 && planet <7)
		{
			System.out.println("Your weight would be " + (earthweight * Neptune) + " pounds on that planet.");
		}
		
		keyboard.close();
	}
}
