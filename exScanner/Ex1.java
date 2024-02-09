package exScanner;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int val1 = scanner.nextInt();

        System.out.print("Digite outro valor: ");
        int val2 = scanner.nextInt();

        System.out.print("Digite mais um valor: ");
        int val3 = scanner.nextInt();

        int average = (val1 + val2 + val3) / 3;

        System.out.println("A media de: " + val1 + " " + val2 + " " + val3 + " é " + average);
    }

}
