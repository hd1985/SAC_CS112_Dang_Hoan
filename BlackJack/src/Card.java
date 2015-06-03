
public class Card extends Dice{

	private int cardValue;
	public Card(){
		roll();
	}
	public Card(int i){
		cardValue = i;
	}
	@Override
	public int roll(){
		//ace is count 11
		cardValue = (int)(Math.random() * 11) + 1;
		if (cardValue == 1){
			cardValue = 2;
		}
		return cardValue;
	}
	
	public int getCardValue(){
		return cardValue;
	}
}
