import javax.swing.JOptionPane;


public class Switch {

	public static void main(String[] args) {
		
		String c;
		String select1;
		int compSelect;
		String compStr;
		int check;
		
		do {
			do{
				check = 0;
				String player1 = JOptionPane.showInputDialog("Player1 enter R/S/P: ");
				//a = Integer.parseInt(player1);
				select1 = player1.toUpperCase();
				switch (select1){
				case "R":
					
					break;
				case "S":
					
					break;
				case "P":
					
					break;
				default:
					JOptionPane.showMessageDialog(null, "invalid");
					check =1;
				}
			} while (check ==1);
			
			compSelect =  (int)(Math.random() *2);
			
			switch (compSelect){
			case 0:
				compStr = "R";
				switch (select1){
				case "R":
					JOptionPane.showMessageDialog(null, "tie");
					break;
				case "S":
					JOptionPane.showMessageDialog(null, "Comp win");
					break;
				case "P":
					JOptionPane.showMessageDialog(null, "Player win");
					break;
				}
				break;
			case 1:
				compStr = "S";
				switch (select1){
				case "R":
					JOptionPane.showMessageDialog(null, "Player win");
					break;
				case "S":
					JOptionPane.showMessageDialog(null, "tie");
					break;
				case "P":
					JOptionPane.showMessageDialog(null, "Comp win");
					break;
				}
				break;
			case 2:
				compStr = "P";
				switch (select1){
				case "R":
					JOptionPane.showMessageDialog(null, "Comp win");
					break;
				case "S":
					JOptionPane.showMessageDialog(null, "Player win");
					break;
				case "P":
					JOptionPane.showMessageDialog(null, "tie");
					break;
				}
				break;
			
			}
		
			c = JOptionPane.showInputDialog("Play again ?: ");
			
		
		} while (c.equalsIgnoreCase("y"));
		JOptionPane.showMessageDialog(null, "Bye");
	}

}
