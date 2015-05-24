
public class DiceHistory implements History{
	Dice[] m_Dices = new Dice[100];
	int m_GameCount;

	public DiceHistory() {
		m_GameCount = 0;
	}

	public void AddDice(Dice gameDice) {
		m_Dices[m_GameCount] = gameDice;
		m_GameCount++;
	}
	@Override
	public String gameHis(){
		String result = "";
		for (int i = 0; i < m_GameCount; i++){
			Dice d = m_Dices[i];
			result = result + "Dice #" + (i+1) + "value: " + d.getDiceValue();
			
		}
		return result;
	}
}
