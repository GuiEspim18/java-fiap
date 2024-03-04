package exArrays;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] value = new int[5];
		for (int count = 0; count < 5; count++) {
			System.out.print("Digite o valor " + count + 1 + " : ");
			value[count] = scanner.nextInt();
		}
		for (int count = 0; count < 5; count++) {
			System.out.print(value[count] + " | ");
		}
	}
} 
