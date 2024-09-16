import java.util.Scanner;

public class ParityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro");
        while (true) {
            if (scanner.hasNextInt()) {
                int userNumber = scanner.nextInt();
                String parity = (userNumber % 2 == 0) ? "Par" : "Ímpar";
                System.out.println("Seu número é " + parity);
                break;
            } else {
                System.out.println("Por favor, informe um número inteiro");
                scanner.next();
            }
        }
        scanner.close();
    }
}
