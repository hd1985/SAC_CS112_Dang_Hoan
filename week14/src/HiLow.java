import java.util.Scanner;
import java.util.*;

public class HiLow {
	public static void main(String[] args) {

		int num = 0;
		String guessValue;
		// initialize number of game
		String more;
		DiceHistory GameHist = new DiceHistory();

		Scanner read = new Scanner(System.in);
		do {
			//do {
				try {
					System.out.println("Input number of dice to roll: ");
					num = read.nextInt();
				} catch (InputMismatchException ime) {
					read.nextLine();
					// System.out.println("invalid input");
					System.err.printf("\nException: %s\n", ime);
				}
				//if (num < 1) {
				//	System.out.println("Input should greater than 0");
				//	System.out.println();
				//}
			//} while (num < 1);
			Dice myDice = new Dice(num);
			// user guess
			read.nextLine(); // Clear buffer
			System.out.println("Please Gues Hi/Lo/mid value: ");
			guessValue = read.nextLine();

			if (guessValue.equalsIgnoreCase("Hi")) {
				if (myDice.GuessHigh())
					System.out.println("High...You win");
				else
					System.out.println("Not High...You lose");
			} else if (guessValue.equalsIgnoreCase("Lo")) {
				if (myDice.GuessLow())
					System.out.println("Low...You win");
				else
					System.out.println("Not Low..You lose");
			} else {
				if (myDice.GuessMid())
					System.out.println("Mid...You win");
				else
					System.out.println("Not Mid...You lose");
			}
			// Add dice to game history
			GameHist.AddDice(myDice);
			System.out.println("Play Again?: ");
			more = read.nextLine();
		} while (more.equalsIgnoreCase("Y"));

		read.close();

		System.out.println(GameHist.GameHistory());
	}
}