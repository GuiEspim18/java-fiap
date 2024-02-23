package exSwitch;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        System.out.println("------Menu------");
        System.out.println("1 - VEJA A MENSAGE");
        System.out.println("2 - TIRE 10 % DO VALOR DESEJADO");
        System.out.println("3 - SELECIONE A CATEGORIA");
        System.out.println("4 - SAIR");

        Scanner scanner = new Scanner(System.in);

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Olá mundo!");
                break;
            case 2:
                int value = scanner.nextInt();
                double percentage = value * 0.1;
                System.out.println("10 % de " + value + " é " + percentage);
            case 3:
                categories(scanner);
                break;
            case 4:
                System.out.println("Até mais!");
                break;
            default:
                throw new RuntimeException("Opção inválida!");
        }

    }

    public static void categories(Scanner scanner) {
        System.out.println("DIGITE UMA CATEGORIA: INFANTIL, INFANTO-JUVENIL, JUVENIL ou ADULTO");
        String category = scanner.nextLine();
        switch (category) {
            case "INFANTIL":
                System.out.println("Categoria infantil tem idades de 1 a 10 anos");
                break;
            case "INFANTO-JUVENIL":
                System.out.println("Categoria infanto-juvenil tem idades de 11 a 13 anos");
                break;
            case "JUVENIL":
                System.out.println("Categoria juvenil tem idades de 14 a 17 anos");
                break;
            case "ADULTO":
                System.out.println("Categoria adulta tem idades apartir de 18 anos");
                break;
            default:
                throw new RuntimeException("Categoria não existe!");
        }
    }

}
