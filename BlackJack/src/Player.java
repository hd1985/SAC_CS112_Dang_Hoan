import java.util.Scanner;


public class Player {
	//start point when draw new card
	private int currentDraw = 2;
	private Card[] playerHand = new Card[5];
	private int count = 0;
	public Player(){
		//initial first two card
		playerHand[0] = new Card();
		playerHand[1] = new Card();
		//last 3 cards are not draw yet.  
		playerHand[2] = new Card(0);
		playerHand[3] = new Card(0);
		playerHand[4] = new Card(0);
		System.out.println("You get a " + playerHand[0].getCardValue() + " and a " + playerHand[1].getCardValue() + ".");
        int total = getTotal();
        System.out.println("Your total is: " + total + "\n");
	}
	public int getTotal(){
		int total = 0;
		for ( int i = 0; i <playerHand.length; i ++){
			total = total + playerHand[i].getCardValue();
		}
		return total;
	}
	public int drawCard(){	
		Card draw = new Card();
		playerHand[currentDraw] = draw;
		currentDraw ++;
		return draw.getCardValue();
	}
	
    public boolean wantToStay() {
        Boolean stay = null;
       // int count = 0;
        while(stay == null ){
			if (count < 3) {
				count++;
				Scanner sc = new Scanner(System.in);

				System.out.println("Would you like to \"hit\" or \"stay\"? ");
				String input = sc.nextLine();

				String hitOrStay = input.toLowerCase();

				switch (hitOrStay) {
				case "hit":
					stay = false;
					break;
				case "stay":
					stay = true;
					break;
				default:
					System.out.println("That is not a valid option.");
					break;
				}
			} else {
				System.out.println("max cards");
				stay = true;
			}
        }
        return stay;
    }
}
