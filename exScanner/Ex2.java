package exScanner;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        double value = scanner.nextDouble();
        double operation = ((value - 4)  * 2 ) * ((100 - (56 + 54)) * 18) * (70 +  22);

        System.out.println("((" + value + " - 4)  * 2 ) * ((100 - (56 + 54)) * 18) * (70 +  22) " + operation);
    }

}
