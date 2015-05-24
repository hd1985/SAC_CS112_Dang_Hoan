
public class Cards implements randomN  {
	private int cardValue;
	private int totalC = 13;
	private int history = 0;
	public Cards(){
		roll();
	}
	@Override
	public int roll()
	{
		history ++;
		cardValue = (int)(Math.random() * totalC) + 1;
		return cardValue;
	}
	public int getValue(){
		return cardValue;
	}
	
}
