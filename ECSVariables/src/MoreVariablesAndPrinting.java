
public class MoreVariablesAndPrinting 
{
	public static void main( String[] args)
	{
		String myName, myEyes, myTeeth, myHair;
		int myAge, myHeight, myWeight;
		
		myName= "Tyler Tran";
		myAge= 17;
		myHeight= 68; //inches
		myWeight= 152; //lbs
		myEyes= "Black";
		myTeeth= "White";
		myHair= "Black";
		
		System.out.println("Let's talk about " + myName + ".");
		System.out.println("He's " + myHeight + " inches tall.");
		System.out.println("He's " + myWeight + " pounds heavy.");
		System.out.println("Actually, that's not too heavy.");
		System.out.println("He's got  " + myEyes + " eyes and " + myHair+ " Hair.");
		System.out.println("His teeth are usually  " + myTeeth + " depending on the coffee.");
		
		System.out.println("If I add " + myAge + ", " + myHeight + ", and " + myWeight + " I get " + (myAge + myHeight + myWeight) + ".");
	}
}
