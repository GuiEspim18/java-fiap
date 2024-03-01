package exFor;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas vezes a mensagem \"Isso é um teste!\" deve ser mostrada na tela?: ");
        int quantity = scanner.nextInt();
        if (quantity < 1) {
            throw new RuntimeException("Digite um valor que não seja menor que 1!");
        }
        for (int control = 0; control < quantity; control++) {
            System.out.println("Isso é um teste!");
        }
    }
}
