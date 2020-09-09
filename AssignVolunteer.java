// Exercise on pages 238-239

import java.util.Scanner;

public class AssignVolunteer
{
	public static void main(String[] args)
	{
		// Variables and constants
		int donationType;
		String volunteer;
		String message;

		final int CLOTHING_CODE = 1;
		final int FURNITURE_CODE = 2;
		final int ELECTRONICS_CODE = 3;
		final int OTHER_CODE = 4;

		final String CLOTHING_PRICER = "Regina";
		final String FURNITURE_PRICER = "Walter";
		final String ELECTRONICS_PRICER = "Lydia";
		final String OTHER_PRICER = "Marco";
		

		// Input phase
		Scanner input = new Scanner(System.in);

		System.out.println("What type of donation are you making?");
		System.out.print("Enter " + CLOTHING_CODE + " for clothing, " + FURNITURE_CODE + " for furniture, " + ELECTRONICS_CODE + " for electronics, and " + OTHER_CODE + " for anything else. ");

		donationType = input.nextInt();

		// While loop to validate the user input to check is it is within the expected range
		while(donationType < CLOTHING_CODE || donationType > OTHER_CODE)
		{
			System.out.println("You entered " + donationType + " which is not a valid donation type.");
			
			System.out.print("Enter " + CLOTHING_CODE + " for clothing, " + FURNITURE_CODE + " for furniture, " + ELECTRONICS_CODE + " for electronics, and " + OTHER_CODE + " for anything else. ");

			donationType = input.nextInt();
		}

		// Calculation phase
		switch(donationType)
		{
			case(CLOTHING_CODE):
			{
				volunteer = CLOTHING_PRICER;
				message = "a clothing donation.";
				break;
			}

			case(FURNITURE_CODE):
			{
				volunteer = FURNITURE_PRICER;
				message = "a furniture donation.";
				break;
			}

			case(ELECTRONICS_CODE):
			{
				volunteer = ELECTRONICS_PRICER;
				message = "an electronics donation.";
				break;
			}

			case(OTHER_CODE):
			{
				volunteer = OTHER_PRICER;
				message = "an 'other' donation.";
				break;
			}

			default:
			{
				volunteer = "invalid";
				message = "an invalid donation type!";
				break;
			}
		}

		// Output phase
		System.out.println("You entered " + donationType + ".");

		System.out.println("This is " + message);

		System.out.println("The volunteer who will price your item(s) is " + volunteer + ".");
	}
}