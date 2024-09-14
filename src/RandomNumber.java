import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sorted = new Random().nextInt(100);
        int guessCount = 0;
        int userGuess;

        while (guessCount < 5) {
            System.out.println("Digite um numero entre 0 a 100");
            userGuess = scanner.nextInt();

            if (userGuess == sorted) {
                System.out.println("Parabéns, você acertou o numero");
                break;
            } else if (userGuess < sorted) {
                System.out.println("O numero é um pouco maior");
            } else {
                System.out.println("Seu numero é um pouco menor");
            }

            guessCount++;
        }
    }
}
