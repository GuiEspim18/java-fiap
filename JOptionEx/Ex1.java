package JOptionEx;

import javax.swing.JOptionPane;

public class Ex1 {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "Digite o valor", "Cadastro de clinte", 3);
		int value = Integer.parseInt(input);
	}
	
}
