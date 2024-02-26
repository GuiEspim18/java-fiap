package whileExercicies;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		boolean close = false;
		Scanner scanner = new Scanner(System.in);
		
		while (!close) {			
			System.out.println("\n1 - Calculo de IMC");
			System.out.println("2 - Ordenar números");
			System.out.println("3 - Selecione a categoria");
			System.out.println("4 - Sair");
			
			
			int opt = scanner.nextInt();
			
			switch (opt) {
				case 1:
					System.out.print("Digite o seu peso: ");
					int weight = scanner.nextInt();
					System.out.print("Digite a sua altura: ");
					double height = scanner.nextDouble();
					double calc = weight / (height * 2);
					System.out.println("IMC = " + calc);
					System.out.println("Resultado: ");
					if (calc < 18.5) {
						System.out.print("Baixo peso");
					} else if (calc >= 18.5 && calc < 24.99) {
						System.out.print("Normal");
					} else if (calc >= 25 && calc < 29.99) {
						System.out.print("Sobrepeso");
					} else if (calc > 30) {
						System.out.print("Obesidade");
					}
					break;
				case 2:
					System.out.print("Digite um número: ");
					int num1 = scanner.nextInt();
					System.out.print("Digite outro número: ");
					int num2 = scanner.nextInt();
					System.out.print("Digite mais um número: ");
					int num3 = scanner.nextInt(); 
					int menor, meio, maior;

			        if (num1 <= num2 && num1 <= num3) {
			            menor = num1;
			            if (num2 <= num3) {
			                meio = num2;
			                maior = num3;
			            } else {
			                meio = num3;
			                maior = num2;
			            }
			        } else if (num2 <= num1 && num2 <= num3) {
			            menor = num2;
			            if (num1 <= num3) {
			                meio = num1;
			                maior = num3;
			            } else {
			                meio = num3;
			                maior = num1;
			            }
			        } else {
			            menor = num3;
			            if (num1 <= num2) {
			                meio = num1;
			                maior = num2;
			            } else {
			                meio = num2;
			                maior = num1;
			            }
			        }

			        System.out.println("Os números em ordem crescente são: " + menor + ", " + meio + ", " + maior);

					break; 
				case 3:
					System.out.println("Digite uma categoria: infantil, infanto-juvenilL, juvenil ou adulto");
					scanner.nextLine();
					String category = scanner.nextLine();
			        switch (category) {
			            case "infantil":
			                System.out.println("Categoria infantil tem idades de 1 a 10 anos");
			                break;
			            case "infanto-juvenil":
			                System.out.println("Categoria infanto-juvenil tem idades de 11 a 13 anos");
			                break;
			            case "juvenil":
			                System.out.println("Categoria juvenil tem idades de 14 a 17 anos");
			                break;
			            case "adulto":
			                System.out.println("Categoria adulta tem idades apartir de 18 anos");
			                break;
			            default:
			                System.out.println("Categoria inválida!");
			        }
					break;
				case 4:
					close = true;
					break;
				default:
					System.out.println("Opção inválida");
					break;
			}
			
		}
		
		scanner.close();
		
	}

}
