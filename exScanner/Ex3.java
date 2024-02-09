package exScanner;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String name = scanner.nextLine();
        System.out.print("Digite o seu nome do meio: ");
        String middleName = scanner.nextLine();
        System.out.print("Digite o seu sobrenome: ");
        String surname = scanner.nextLine();

        System.out.println("Seu nome é: " + name + " " + middleName + " " + surname);
    }

}
