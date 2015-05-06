
public class Dice {
	private int sides;
	private int diceValue;
	private static int history = 0;
	//Constructor of Dice class
	public Dice( int s )
	{
		sides = s;
		roll();
		history ++;
	}
	//roll function
	public int roll()
	{
		diceValue = (int)(Math.random() * sides) + 1;
		if ( diceValue > sides) {
			diceValue = sides;
		}
		return diceValue;
	}
	//get value of dice
	public int getDiceValue()
	{
		return diceValue;
	}
	//get number of object is created
	public static int getHistory(){
		return history;
	}
}
