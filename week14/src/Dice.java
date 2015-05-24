import java.util.*;
public class Dice {
	private int m_DiceCount;
	private int m_DiceValue;
	private boolean m_High;
	private boolean m_Low;
	private int m_Mid;
	private boolean m_GuessedRight;
	private boolean m_GuessedHi;
	private boolean m_GuessedLo;
	private boolean m_GuessedMid;
	private int m_Points;

	// Constructor of Dice class
	public Dice(int s) {
		 if (s <= 0) {
		        throw new IllegalArgumentException();
		    }
		m_DiceCount = s;
		roll();
	}

	// roll function
	// Calculate all Dice attributes
	public int roll() {
		m_DiceValue = (int) (Math.random() * m_DiceCount * 6) + 1;
		m_Mid = (m_DiceCount * 6) / 2;
		m_High = m_DiceValue > m_Mid;
		m_Low = m_DiceValue < m_Mid;
		return m_DiceValue;
	}

	// # of dices
	public int DiceCount() {
		return m_DiceCount;
	}

	// get value of dice
	public int DiceValue() {
		return m_DiceValue;
	}

	// Dice is High
	public boolean High() {
		return m_High;
	}

	// Dice is low
	public boolean Low() {
		return m_Low;
	}

	// USer Guessed Dice is High
	public boolean UserGuessedHigh() {
		return m_GuessedHi;
	}

	// USer Guessed Dice is low
	public boolean UserGuessedLow() {
		return m_GuessedLo;
	}

	public boolean UserGuessedMid() {
		return m_GuessedMid;
	}

	public boolean UserGuessedRight() {
		return m_GuessedRight;
	}

	// Dice is @ MidPoint
	public boolean GuessMid() {
		m_GuessedMid = true;
		m_GuessedRight = m_DiceValue == m_Mid;
		if (m_GuessedRight)
			m_Points += 5;
		else
			m_Points--;
		return m_GuessedRight;
	}

	// Use guess Dice is High
	public boolean GuessHigh() {
		m_GuessedHi = true;
		m_GuessedRight = m_High;
		if (m_GuessedRight)
			m_Points++;
		else
			m_Points--;
		return m_GuessedRight;
	}

	// Use guess Dice is Low
	public boolean GuessLow() {
		m_GuessedLo = true;
		m_GuessedRight = m_Low;
		if (m_GuessedRight)
			m_Points++;
		else
			m_Points--;
		return m_GuessedRight;
	}

	// get value of dice
	public int Points() {
		return m_Points;
	}

}