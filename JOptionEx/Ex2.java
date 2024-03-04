package JOptionEx;

import javax.swing.JOptionPane;

public class Ex2 {
	public static void main(String[] args) {
		String choice = JOptionPane.showInputDialog(null, "Digite a operação desejada: SOMA, MULTIPLICAÇÃO, SUBTAÇÃO, DIVISÃO").toUpperCase();
		int result;
		String message;
		int [] values;
		
		switch (choice) {
			case "SOMA":
				values = operation();
				result = values[0] +values[1];
				message  = "O resultado de " + values[0] + " + " + values[1] + " = " + result;
				JOptionPane.showMessageDialog(null, message, "Resultado", -1);
				break;
			case "MULTIPLICAÇÃO":
				values = operation();
				result = values[0] * values[1];
				message  = "O resultado de " + values[0] + " * " + values[1] + " = " + result;
				JOptionPane.showMessageDialog(null, message, "Resultado", -1);
				break;
			case "SUBTRAÇÃO":
				values = operation();
				result = values[0] - values[1];
				message  = "O resultado de " + values[0] + " - " + values[1] + " = " + result;
				JOptionPane.showMessageDialog(null, message, "Resultado", -1);
				break;
			case "DIVISÃO":
				values = operation();
				result = values[0] / values[1];
				message  = "O resultado de " + values[0] + " / " + values[1] + " = " + result;
				JOptionPane.showMessageDialog(null, message, "Resultado", -1);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida", "Erro", 0);
		}
		
		
	}
	
	private static int[] operation() {
		String input1 = JOptionPane.showInputDialog(null, "Digite um valor", "Valor1", -1);
		String input2 = JOptionPane.showInputDialog(null, "Digite outro valor", "Valor2", -1);
		int value1 = Integer.parseInt(input1);
		int value2 = Integer.parseInt(input2);
		int [] values = new int[2];
		values[0] = value1;
		values[1] = value2;
		return values;
	}
}
