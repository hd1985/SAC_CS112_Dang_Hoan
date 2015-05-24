
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardHistory hiscard = new CardHistory();
		DiceHistory hisdice = new DiceHistory();
		
		Dice dice1 = new Dice();
		Cards card1 = new Cards();
		
		dice1.roll();
		card1.roll();
		
		hiscard.AddCard(card1);
		hisdice.AddDice(dice1);
		
		System.out.println(hiscard.gameHis());
		System.out.println(hisdice.gameHis());
	}

}
