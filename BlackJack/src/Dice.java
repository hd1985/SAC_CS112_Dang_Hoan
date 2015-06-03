public class Dice{
	private int diceValue;
	
	public Dice()
	{
		roll();		
	}
	public int roll()
	{
		diceValue = (int)(Math.random() * 6) + 1;
		return diceValue;
	}

	public int getDiceValue()
	{
		return diceValue;
	}

}