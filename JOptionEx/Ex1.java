package JOptionEx;

import javax.swing.JOptionPane;

public class Ex1 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog(null, "Digite o seu nome", "Cadastro de clinte", 3);
		JOptionPane.showMessageDialog(null, "O nome armazenado é " + name, "Nome", -1);
	}
	
}
