
public class CardHistory implements History{
	Cards[] m_Card = new Cards[100];
	int m_GameCount;

	public CardHistory() {
		m_GameCount = 0;
	}

	public void AddCard(Cards gameCard) {
		m_Card[m_GameCount] = gameCard;
		m_GameCount++;
	}
	@Override
	public String gameHis(){
		String result = "";
		for (int i = 0; i < m_GameCount; i++){
			Cards d = m_Card[i];
			result = result + "Card #" + (i+1) + "value: " + d.getValue();
			
		}
		return result;
	}
}
