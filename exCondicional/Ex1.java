package exCondicional;

import java.util.Scanner;

public class Ex1 {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Em que ano o Brasil foi descoberto? ");
        System.out.println("1. 1230");
        System.out.println("2. 1450");
        System.out.println("3. 1500");

        int answer = scanner.nextInt();

        if (verifyAnswer(answer, 3)) {
            System.out.println("Em que ano o Brasil virou independente? ");
            System.out.println("1. 1400");
            System.out.println("2. 1822");
            System.out.println("3. 1889");
            answer = scanner.nextInt();

            if (verifyAnswer(answer, 2)) {
                System.out.println("Em que ano o Brasil ocorreu o golpe republicano no Brasil? ");
                System.out.println("1. 1889");
                System.out.println("2. 1822");
                System.out.println("3. 1500");
                answer = scanner.nextInt();

                if (verifyAnswer(answer, 1)) {
                    System.out.println("Em que ano o Brasil passou a existir? ");
                    System.out.println("1. 1500");
                    System.out.println("2. 1822");
                    System.out.println("3. 1889");
                    answer = scanner.nextInt();

                    if (verifyAnswer(answer, 1)) {
                        System.out.println("Parabéns, obrigado por completar o quiz!");
                    } else {
                        correctAnswer("O Brasil passou a existir no ano de 1500 quando povos afastados por milênios se encontraram em Porto Seguro na Bahia, esses povos são os portuguêses e os indígenas!", answer);
                    }
                } else {
                    correctAnswer("O Brasil sofreu o golpe republicano no ano de 1889 com a expulsão da família real!", answer);
                }
            } else {
                correctAnswer("O Brasil virou independete de Portugal no ano de 1822!", answer);
            }
        } else {
            correctAnswer("O Brasil foi descoberto no ano de 1500!", answer);
        }
    }

    private static boolean verifyAnswer(int answer, int correctAnswer) {
        if (answer < 1 || answer > 3) {
            System.out.println("A resposta precisa ser 1, 2 ou 3!");
            return false;
        } else if (answer == correctAnswer) {
            System.out.println("Resposta correta!");
            return true;
        } else {
            System.out.println("Resposta incorreta!");
            return false;
        }
    }

    private static void correctAnswer(String message, int answer) {
        if (answer >= 1 && answer <= 3) {
            System.out.println(message);
        }
    }

}
