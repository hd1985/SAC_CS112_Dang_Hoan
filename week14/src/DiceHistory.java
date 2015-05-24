public class DiceHistory {
	Dice[] m_Dices = new Dice[100];
	int m_GameCount;

	public DiceHistory() {
		m_GameCount = 0;
	}

	public void AddDice(Dice gameDice) {
		m_Dices[m_GameCount] = gameDice;
		m_GameCount++;
	}

	public String GameHistory() {
		String result = "";
		int g = 1;
		int points = 0;
		for (g = 0; g < m_GameCount; g++) {
			Dice d = m_Dices[g];
			result = result + "Dice #" + (g + 1) + ": DiceCount="
					+ d.DiceCount() + "  DiceValue=" + d.DiceValue();
			if (d.UserGuessedHigh())
				result = result + " Guess=High";
			if (d.UserGuessedMid())
				result = result + " Guess=Mid ";
			if (d.UserGuessedLow())
				result = result + " Guess=Low ";
			if (d.UserGuessedRight())
				result = result + " User guessed right ";
			else
				result = result + " User guessed wrong ";
			result = result + " Points=" + d.Points() + "\r\n";
			points = points + d.Points();
		}
		result = result + " Total Games=" + g + "\r\n";
		result = result + " Total Points=" + points;

		return result;
	}

}