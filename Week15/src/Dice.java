public class Dice implements randomN {
	private int sides;
	private int diceValue;
	
	public Dice( )
	{
		sides = 6;
		roll();
	}
	@Override
	public int roll()
	{
		diceValue = (int)(Math.random() * sides) + 1;
		if ( diceValue > sides) {
			diceValue = sides;
		}
	
		return diceValue;
	}
	
	public int getDiceValue()
	{
		return diceValue;
	}
	
}