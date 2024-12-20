/* 	
 * <Brief project description: This Project is meant to evaluate if the end user is human or a machine,
 * based on the questions given to the end user in a chat bot like format and how the end user answers the questions. >
 * 
*/

// Import the Scanner class
import java.util.Scanner;
// Import the Random class
import java.util.Random;

public class P1_SA872378 {

	public static void main(String[] args) {
		String tryAgain;
		// Create a Scanner object to read from the keyboard.
		Scanner keyboard = new Scanner(System.in);

// do while loop to keep the program running until the user enters no
// the do while loop is there so the program can start from the beginning if the user wants to try again
		do {

			// points system
			int pointsAlive = 0;
			int pointsMachine = 0;

			// confidence level int's
			int confidence;
			int range;
			int randomNum;

			// creating a random object
			Random rand = new Random();

			// Display Greeting
			System.out.println("Welcome to the 'Alive or Machine' Dialog!");
			System.out.println(
					"I'll ask you some questions to determine if you are a real peron or a clverly disguised robot");

			// creating choice string
			String choice;

//while loop to keep the program asking questions if user enters invalid input.  
			while (true) {
				// Display first question
				System.out.println("What is Your favorite thing to eat Brownies or Motherboards?: ");
				// uses the nextLine method to read the user's input
				choice = keyboard.nextLine();
				// if the user enters brownies, the pointsAlive will increase by 50
				if (choice.equalsIgnoreCase("brownies")) {
					pointsAlive += 50;
					break;
					// if the user enters motherboards, the pointsMachine will increase by 50
				} else if (choice.equalsIgnoreCase("motherboards")) {
					pointsMachine += 50;
					break;
					// if the user enters anything other than brownies or motherboards, the program
					// will print "Invalid input, please enter brownies or motherboards"
				} else {
					System.out.println("Invalid input, please enter brownies or motherboards");
				}
			}

//while loop to keep the program asking questions if user enters invalid input.
			while (true) {
				// Display second question
				System.out.println(
						"What's your favorite Restaurant among these three?: Micro Center, Olive Garden, McDonalds ");
				// uses the nextLine method to read the user's input
				choice = keyboard.nextLine();

				// if the user enters Olive Garden, the pointsAlive will increase by 50 and the
				// pointsMachine will decrease by 10
				if (choice.equalsIgnoreCase("Olive Garden")) {
					pointsAlive += 30;
					pointsMachine -= 5;

					break;
					// if the user enters McDonalds, the pointsMachine and pointsAlive will increase
					// by 10
				} else if (choice.equalsIgnoreCase("McDonalds")) {
					pointsMachine += 10;
					pointsAlive += 10;

					break;
					// if the user enters Micro Center, the pointsMachine will increase by 50
				} else if (choice.equalsIgnoreCase("Micro Center")) {
					pointsMachine += 50;

					break;
					// if the user enters anything other than Olive Garden, McDonalds or Micro
					// Center, the program will print "Invalid input, please enter Olive Garden,
					// McDonalds
				} else {
					System.out.println("Invalid input, please enter Micro Center, Olive Garden, McDonalds");
				}
			}

//while loop to keep the program asking questions if user enters invalid input.
			while (true) {
				// Display third question

				System.out.println(
						"What do You do when you are travelling on a Airplane?: Watch Movies, Sleep, Calcuate the flight time");
				// uses the nextLine method to read the user's input
				choice = keyboard.nextLine();

				// if the user enters Watch movies, the pointsAlive will increase by 20 and the
				// pointsMachine will increase by 5
				if (choice.equalsIgnoreCase("Watch movies")) {
					pointsAlive += 20;
					pointsMachine += 5;

					break;
					// if the user enters sleep, the pointsAlive will increase
				} else if (choice.equalsIgnoreCase("sleep")) {
					pointsAlive += 10;

					break;
					// if the user enters calculate the flight time, the pointsAlive will increase
					// by 5 and the pointsMachine will increase by 30
				} else if (choice.equalsIgnoreCase("calculate the flight time")) {
					pointsAlive += 5;
					pointsMachine += 40;

					break;
					// if the user enters anything other than Watch movies, sleep or calculate the
					// flight time, the program will print "Invalid input, please enter Watch
					// movies, sleep orcalculate the flight time"
				} else {
					System.out.println("Invalid input, please enter Watch movies, sleep or calculate the flight time");
				}
			}
//while loop to keep the program asking questions if user enters invalid input.
			while (true) {

				// Display fourth question
				System.out.println("What do you do when you see a dog? : pet it, ignore it, calculate its speed");
				// uses the nextLine method to read the user's input
				choice = keyboard.nextLine();
				// if the user enters pet it, the pointsAlive will increase by 20 and the
				// pointsMachine will increase by 5
				if (choice.equalsIgnoreCase("pet it")) {
					pointsAlive += 20;
					pointsMachine += 5;

					break;
					// if the user enters ignore it, the pointsAlive will increase by 10
				} else if (choice.equalsIgnoreCase("ignore it")) {
					pointsAlive += 10;

					break;
					// if the user enters calculate its speed, the pointsAlive will increase by 5
					// and the pointsMachine will increase by 30
				} else if (choice.equalsIgnoreCase("calculate its speed")) {
					pointsAlive -= 5;
					pointsMachine += 30;

					break;
					// if the user enters anything other than pet it, ignore it, calculate its
					// speed, the program will print "Invalid input, please enter pet it, ignore it,
					// calculate its speed"
				} else {
					System.out.println("Invalid input, please enter pet it, ignore it, calculate it's speed");

				}
			}

//while loop to keep the program asking questions if user enters invalid input.
			while (true) {
				// Display fifth question
				System.out.println("What's your favorite drink? water, oil, or electricity?");
				// uses the nextLine method to read the user's input
				choice = keyboard.nextLine();
				// if the user enters water, the pointsAlive will increase by 50
				if (choice.equalsIgnoreCase("water")) {
					pointsAlive += 50;

					break;
					// if the user enters oil, the pointsMachine will increase by 50 and the
					// pointsAlive will decrease by 30
				} else if (choice.equalsIgnoreCase("oil")) {
					pointsMachine += 50;
					pointsAlive -= 30;

					break;
					// if the user enters electricity, the pointsMachine will increase by 30 and the
					// pointsAlive will decrease by
				} else if (choice.equalsIgnoreCase("electricity")) {
					pointsMachine += 30;
					pointsAlive -= 10;

					break;
					// if the user enters anything other than water, oil, electricity, the program
					// will print "Invalid input, please enter water, oil, or electricity"
				} else {
					System.out.println("Invalid input, please enter water, oil, or electricity");
				}
			}

			// confidence level
			// Ask the user what their confidence level
			System.out.println("What is your confidence on a scale of (0-100)? ");
			// uses the nextInt method to read the user's integer input
			confidence = keyboard.nextInt();
			// if the user enters a number above 100 the confidence level will be set to 100
			if (confidence > 100) {
				confidence = 100;
			}
			// if the user enters a number below 0 the confidence level will be set to 0
			if (confidence < 0) {
				confidence = 0;
			}
			// getting the range of confidence
			range = ((100 - confidence) / 2);
			// adding the range to random number for random factors that could happen
			randomNum = rand.nextInt(range + 1);

			// adding the random number to the pointsAlive and pointsMachine
			pointsAlive += randomNum;
			pointsMachine += randomNum;

			// percents
			// converting int's to doubles to get percent value with decimal places
			double alivePercent = ((double) pointsAlive / 170) * 100;
			double machinePercent = ((double) pointsMachine / 220) * 100;

			// setting the percents to 0 if they are less than 0 and setting to 100 if they
			// are greater than 100
			if (machinePercent < 0) {
				machinePercent = 0;
			}
			if (alivePercent < 0) {
				alivePercent = 0;
			}
			if (alivePercent > 100) {
				alivePercent = 100;
			}
			if (alivePercent > 100) {
				machinePercent = 100;
			}

			// Displaying results based on the percents greater than less than or equal to
			// each other
			if (alivePercent > machinePercent) {
				// using the printf and %.2f%% method to print the percents with 2 decimal
				// places
				System.out.printf("Your Percent Human is: %.2f%%, Your percent Machine is: %.2f%%\n", alivePercent,
						machinePercent);
				System.out.println("You are a Human!");
			} else if (alivePercent < machinePercent) {
				System.out.printf("Your Percent Machine is: %.2f%%, Your Percent Human is: %.2f%%\n", machinePercent,
						alivePercent);
				System.out.println("You are a Machine!");
			} else if (alivePercent == machinePercent) {
				System.out.printf("Your Percent human is: %.2f%%, Your Percent Machine is: %.2f%%\n", alivePercent,
						machinePercent);
				System.out.println("I do not know if you are a human or machine.");
			}

			// Prompting the user to try again
			System.out.println("Would you like to try again? yes/no");
			tryAgain = keyboard.next();

		} while (tryAgain.equals("yes"));

	}
}