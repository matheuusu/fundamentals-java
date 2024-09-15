import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o numero desejado");
        if (scanner.hasNextDouble()) {
            double number = scanner.nextDouble();

            if (number > 0) {
                System.out.println(number + " é um número positivo");
            } else if (number < 0) {
                System.out.println(number + " é um número negativo");
            } else {
                System.out.println("Seu número é zero");
            }
        } else {
            System.out.println("Formato inválido. Por favor, insina um número.");
        }

        scanner.close();
    }
}
