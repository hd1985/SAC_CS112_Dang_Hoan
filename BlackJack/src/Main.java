import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean checkPlayer;
		boolean checkDealer;
		boolean breakPoint;
		String more;
		do {
			System.out.println("********************************************");
			checkPlayer = false;
			checkDealer = false;
			breakPoint = false;
			Player nu1 = new Player();
			Dealer de1 = new Dealer();
	
			// player turn
			while (!checkPlayer) {
				if (nu1.getTotal() < 22) {
					if (nu1.wantToStay()) {
						System.out.println("Your Hand: " + nu1.getTotal());
						checkPlayer = true;
					} else {
						System.out.println("Draw: " + nu1.drawCard());
						System.out.println("Current Your Hand: "
								+ nu1.getTotal());
					}
				} else {
					System.out.println("Bust, You lose");
					checkPlayer = true;
					breakPoint = true;
				}
			}
			// Dealer turn
			System.out.println();
			if (!breakPoint) {
				de1.DealerTurn();
				while (!checkDealer) {
					if (de1.getTotal() < 22) {
						if (de1.wantToStay()) {
							System.out.println("Dealer Hand:" + de1.getTotal()+ " \tYour Hand: " + nu1.getTotal());
							checkDealer = true;
						} else {
							System.out.println("Dealer Draw: " + de1.drawCard());
							System.out.println("Dealer Current Hand: " + de1.getTotal() );
						}
					} else {
						System.out.println("Dealer Bust, You Win");
						checkDealer = true;
					}
				}
				// check who win
				if (de1.getTotal() <22){
					compare(nu1.getTotal(), de1.getTotal());
				}
			}
			System.out.println("Play Again?: ");
			Scanner read1 = new Scanner(System.in);
			more = read1.nextLine();
		} while (more.equalsIgnoreCase("Y"));
		System.out.println("Bye");
	}

	public static void compare(int a, int b) {
		if (a > b) {
			System.out.println("Player Win");
		} else if (a == b) {
			System.out.println("Draw");
		} else {
			System.out.println("Dealer Win");
		}
	}

}
