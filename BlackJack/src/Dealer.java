import java.util.Scanner;

public class Dealer {
	private int total;
	private int drawCount = 0;
	private int currentDraw = 2;
	//create and array of 5 for 5 cards max
	private Card[] DealerHand = new Card[5];

	public Dealer() {
		// initial first two card
		DealerHand[0] = new Card();
		DealerHand[1] = new Card();
		// last 3 cards are not draw yet
		DealerHand[2] = new Card(0);
		DealerHand[3] = new Card(0);
		DealerHand[4] = new Card(0);
		System.out.println("Dealer get a " + DealerHand[0].getCardValue() + " and one face down.");
		System.out.println();
		// getTotal();
	}

	public void DealerTurn() {
		System.out.println("Dealer's turn!\n");
		int currentHandDealer = getTotal();
		System.out.println("Dealer get a " + DealerHand[0].getCardValue()
				+ " and hidden card was a " + DealerHand[1].getCardValue()
				+ "\n" + "Dealer total was " + currentHandDealer + ".\n");
	}

	public int getTotal() {
		total = 0;
		for (int i = 0; i < DealerHand.length; i++) {
			total = total + DealerHand[i].getCardValue();
		}
		return total;
	}

	public int drawCard() {
		Card draw = new Card();
		DealerHand[currentDraw] = draw;
		currentDraw++;
		return draw.getCardValue();
	}

	public boolean wantToStay() {
		Boolean stay = false;
		if (drawCount < 3) {
			drawCount ++;
			//Dealer should get 16 for minimum.  For below 16, dealer should draw till it is greater than 15
			if (total > 15) {
				stay = true;
				System.out.println("Dealer stays.\n");
			} else {
				System.out.println("Dealer hits.");
			}
		} else stay = true;
		return stay;
	}
}
