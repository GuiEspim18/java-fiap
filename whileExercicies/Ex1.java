package whileExercicies;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		String candidate1 = "1 - Ricardo Hilkner";
		String candidate2 = "2 - Super chandão";
		String candidate3 = "3 - ET de Varginha";
		String candidate4 = "4 - Nando Moura";
		
		int cand1 = 0;
		int cand2 = 0;
		int cand3 = 0;
		int cand4 = 0;
		
		int totalVote = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(candidate1);
		System.out.println(candidate2);
		System.out.println(candidate3);
		System.out.println(candidate4);
		
		do {
	
			System.out.print("Escolha seu número de votação: ");
			int vote = scanner.nextInt();
			
			switch (vote) {
				case 1:
					cand1++;
					totalVote++;
					break;
				case 2:
					cand2++;
					totalVote++;
					break;
				case 3: 
					cand3++;
					totalVote++;
					break;
				case 4:
					cand4++;
					totalVote++;
					break;
				default:
					System.out.println("Digite um voto válido!");
					System.out.println(candidate1);
					System.out.println(candidate2);
					System.out.println(candidate3);
					System.out.println(candidate4);
			}
			
			
			
		} while (totalVote < 5);
		
		System.out.println("\n" + candidate1 + " teve " + cand1 + " votos");
		System.out.println(candidate2 + " teve " + cand2 + " votos");
		System.out.println(candidate3 + " teve " + cand3 + " votos");
		System.out.println(candidate4 + " teve " + cand4 + " votos");
	}
	
}
