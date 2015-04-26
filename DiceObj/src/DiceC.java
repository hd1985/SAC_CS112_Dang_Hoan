public class DiceC{
	private int sides;
	private int diceValue;
	public DiceC( int s )
	{
		sides = s;
		roll();
	}
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