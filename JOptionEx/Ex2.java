package JOptionEx;

import javax.swing.JOptionPane;

public class Ex2 {
	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog(null, "Digite um valor", "Valor1", -1);
		String input2 = JOptionPane.showInputDialog(null, "Digite outro valor", "Valor2", -1);
		int value1 = Integer.parseInt(input1);
		int value2 = Integer.parseInt(input2);
		int result = value1 + value2;
		String message  = "O resultado de " + value1 + " + " + value2 + " = " + result;
		JOptionPane.showMessageDialog(null, message, "Resultado", -1);
	}
}
