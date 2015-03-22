import java.util.Scanner;
public class GuessGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int goodCount = 0;
		int badCount = 0;
		boolean set = false;
		while(!set){
			int random = 0 +(int)(Math.random()*10);
			System.out.println("input guess # from 0-10: ");
			Scanner input = new Scanner( System.in);
			int a = input.nextInt();
			//Validate input before let the game run
			if ((a<0) || (a>10)){
				System.out.println("invalid input");
			}
			//Game's code
			else {
				count ++;
				if( (a == random)  ){
					goodCount ++;
					System.out.println("correct");
				}
				else{
					badCount ++;
					if( (a > random) ){
			        System.out.println("too large");
					}
					else{
						System.out.println("too small");
					}    
				}
			 }
			System.out.println("Percentage guess during the game");
			System.out.printf("Correct guess: %.2f\t In-Correct guess: %.2f \n", (float)(goodCount/count)*100, (float)(badCount/count)*100); 
			System.out.println("Play again?: ");
			Scanner input1 = new Scanner (System.in);
			String b = input1.nextLine();
			String c = b.toUpperCase();
			//System.out.println(c);
			if( c.equals("Y")){
			 System.out.println("Play again");
			 System.out.println();
			}
			else {
				System.out.println("Good bye");
				set = true;
			}
			  
		}
		
		float good = (float)(goodCount/count)*100;
		float bad = (float)(badCount/count)*100;
		System.out.println("Percentage guess overall");
		System.out.printf("Correct guess: %.2f\t In-Correct guess: %.2f \n", good, bad);
	}


}
