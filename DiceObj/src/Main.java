import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		int sum = 0;
		int guessValue;
		String more;
		Scanner read = new Scanner (System.in);
		do{
			do{
				System.out.println("Input number of dice to roll: ");
				num = read.nextInt();
				if ( num < 1) {
					System.out.println("Input should greater than 0");
					System.out.println();
				}
			} while (num < 1);
			//create array to store DiceC object
			DiceC [] array = new DiceC[num];
			//create dice object by number input
			for (int i = 0; i < num; i++){
				array [i] = new DiceC(6);
			}
			// roll all dices
			for (int i = 0; i < num; i++){
				array [i].roll();
			}
			// sum of dice's value
			for (int j = 0; j < num; j++){
				sum = sum + array [j].getDiceValue();
			}
			//user guess
			do {
				System.out.println("Gues value: ");
				guessValue = read.nextInt();
				System.out.println("Roll value: "+ sum);
				if ( guessValue == sum)
					System.out.println("Correct");
				else {
					System.out.println("Wrong");
					
				}
			} while ( guessValue!= sum);
			System.out.println("Play Again?: ");
			Scanner read1 = new Scanner (System.in);
			more = read1.nextLine();
		} while (more.equalsIgnoreCase("Y"));
		System.out.println("Bye");
		
	}

}
