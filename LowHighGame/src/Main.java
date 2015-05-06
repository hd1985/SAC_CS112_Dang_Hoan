import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int num;
		int sum = 0;
		String guessValue;
		int min = 0;
		int max = 0;
		int mid = 0;
		//initialize number of game
		int numOfGame = 0;
		//initialize score
		int score = 0;
		String more;
		Scanner read = new Scanner(System.in);
		do {
			do {
				System.out.println("Input number of dice to roll: ");
				num = read.nextInt();
				if (num < 1) {
					System.out.println("Input should greater than 0");
					System.out.println();
				}
			} while (num < 1);
			//Min and Max when roll dices
			min = minValue(num);
			max = maxValue(num);
			mid = midValue(max);
			String strMid = Integer.toString(mid);
			// create array to store Dice object
			Dice[] array = new Dice[num];
			// create dice object by number input
			for (int i = 0; i < num; i++) {
				array[i] = new Dice(6);
			}
			// roll all dices
			for (int i = 0; i < num; i++) {
				array[i].roll();
				//System.out.println(array[i].getDiceValue());
			}
			// sum of dice's value
			for (int j = 0; j < num; j++) {
				sum = sum + array[j].getDiceValue();	
			}
			// convert sum to String
			//System.out.println("sum "+sum);
			String strSum = Integer.toString(sum);
			//System.out.println(strSum);
			
			// user guess
			System.out.println("Gues value: ");
			Scanner readIn = new Scanner(System.in);
			guessValue = readIn.nextLine();

			
			//keep track number of game
			numOfGame ++;	
			System.out.println("Roll value: " + sum);
			if (guessValue.equals(strSum) && guessValue.equals(strMid)){
				System.out.println("Correct");
				score = score + 5;
			}
			else {
				if (guessValue.equalsIgnoreCase("Hi")) {
					if (sum > (max / 2) && sum <= max) {
						System.out.println("Get 1 point");
						//update score
						score ++;
					} else {// if guess equal or less than mid point minus 1
						System.out.println("Lose 1 point");
						//update score
						score --;
					}
				}
				if (guessValue.equalsIgnoreCase("Low")) {
					if (sum < (max / 2) && sum >= min) {
						System.out.println("Get 1 point");
						//update score
						score ++;
					} else {// if guess equal or greater than mid point minus 1
						System.out.println("Lose 1 point");
						//update score
						score --;
					}
				}
				else {
					System.out.println("Lose 1 point");
					score --;
				}
			}
			//set sum back to 0 for new guess
			sum = 0;
			//display number of object is created
			System.out.println("history of object: " + Dice.getHistory());
			//Display number of game 
			System.out.println("Number of Game: " + numOfGame);
			//Display score of player
			System.out.println("Score: "+score);
			System.out.println("Play Again?: ");
			Scanner read1 = new Scanner(System.in);
			more = read1.nextLine();
		} while (more.equalsIgnoreCase("Y"));
		System.out.println("Bye");

	}
	//finding min when roll dices
	public static int minValue(int a) {
		int minV = a;
		return minV;
	}
	//finding max when roll dices
	public static int maxValue(int b) {
		int maxV = b * 6;
		return maxV;
	}
	//finding midpoint
	public static int midValue(int c){
		int midV = c/2;
		return midV;
	}
}
