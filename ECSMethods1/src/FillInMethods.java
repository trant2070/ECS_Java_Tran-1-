// Fill-In Methods - Fix the broken methods and method calls.

public class FillInMethods
{
	public static void main( String[] args )
	{
		// Fill in the method calls where appropriate.

		System.out.println("Watch as we demonstrate methods.");

		System.out.println();
		System.out.println("I'm going to get a random character from A-Z");
		char c = '!';
		randchar(args);
		System.out.println("The character is: " + c );

		System.out.println();
		System.out.println("Now let's count from -10 to 10");
		int begin, end;
		begin = -10;
		end = 10;
		counter(args);
		System.out.println("How was that?");

		System.out.println();
		System.out.println("Now we take the absolute value of a number.");
		int x, y = 10;
		x = -10;
		abso(args);
		System.out.println("|" + x + "| = " + y );

		System.out.println();
		System.out.println("That's all.  This program has been brought to you by:");
		 credits(args);
	}


	public static void credits( String[]args )
	// No parameters.
	{
		// displays some boilerplate text saying who wrote this program, etc.

		System.out.println();
		System.out.println("programmed by Sam Cummings");
		System.out.println("modified by Tyler Tran");
		System.out.print("This code is distributed under the terms of the standard ");
		System.out.println("BSD license.  Do with it as you wish.");

		return ;
	}




	public static void randchar( String[]args )
	// No parameters.
	{
		// chooses a random character in the range "A" to "Z"
		
		int numval;
		char charval;

		// pick a random number from 0 to 25
		numval = (int)(Math.random()*26);
		// now add that offset to the value of the letter 'A'
		charval = (char) ('A' + numval);

		return;
	}





	public static void counter( String[]args )
	{
		// Parameters are:
	
			int start =-10;
			int stop =10;
		{
			// counts from start to stop by ones
			int ctr;

			ctr = start;
			while ( ctr <= stop )
			{
				System.out.print(ctr + " ");
				ctr = ctr+1;
			}

		}
		return;
	}




	public static int abso( String[]args )
	{// Parameters are:
		int value =0;
		{
			// finds the absolute value of the parameter
			int absval;

			if ( value < 0 )
			absval = -value;
			else
				absval = value;
		}
		return value;
	}


}

