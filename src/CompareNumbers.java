import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, informe dois números inteiros");
        while (true) {
            if (scanner.hasNextInt()) {
                int firstNumber = scanner.nextInt();
                if (scanner.hasNextInt()) {
                    int secondNumber = scanner.nextInt();

                    if (firstNumber == secondNumber) {
                        System.out.printf("Os números %d e %d são iguais", firstNumber, secondNumber);
                        break;
                    } else if (firstNumber > secondNumber) {
                        System.out.printf("Seus números são diferentes, sendo %d maior que %d", firstNumber, secondNumber);
                        break;
                    } else {
                        System.out.printf("Seus números são diferentes, sendo %d maior que %d", secondNumber, firstNumber);
                        break;
                    }
                } else {
                    System.out.println("Formato inválido. Por favor, insira dois números inteiros.");
                    scanner.next();
                }
            } else {
                System.out.println("Formato inválido. Por favor, insira dois números inteiros.");
                scanner.next();
            }
        }
        scanner.close();
    }
}
