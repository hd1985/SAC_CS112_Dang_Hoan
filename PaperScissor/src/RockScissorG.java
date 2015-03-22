
import javax.swing.JOptionPane;

public class RockScissorG {

	public static void main(String[] args) {
		String c;
		int a;
		int b;
		do {
			do {
				String player1 = JOptionPane.showInputDialog("Player1 enter 1.Rock/2.Scissor/3.Paper: ");
				a = Integer.parseInt(player1);
				if ( a > 3) 
					JOptionPane.showMessageDialog(null, "Invalid input");
			} while (a >3);
			
			do {
				String player2 = JOptionPane.showInputDialog("Player2 enter 1.Rock/2.Scissor/3.Paper: ");
				b = Integer.parseInt(player2);
				if ( b > 3) 
					JOptionPane.showMessageDialog(null, "Invalid input");
			} while ( b > 3);
			
			
			if ( (a ==1 && b ==1) || (a ==2 && b ==2) || (a ==3 && b ==3)) JOptionPane.showMessageDialog(null, "Tie");;
			if ( (a ==1 && b ==2) || (a ==2 && b ==3) || (a ==3 && b ==1)) JOptionPane.showMessageDialog(null, "Player1 win");
			if ( (a ==1 && b ==3) || (a ==2 && b ==1) || (a ==3 && b ==2)) JOptionPane.showMessageDialog(null, "Player2 win");;
			c = JOptionPane.showInputDialog("Play again ?: ");
			
		
		} while (c.equalsIgnoreCase("y"));
		JOptionPane.showMessageDialog(null, "Bye");
	}

}
