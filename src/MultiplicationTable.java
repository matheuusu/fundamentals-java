import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro");
        while (true) {
            if (scanner.hasNextInt()) {
                int userNumber = scanner.nextInt();

                for (int i = 1; i <= 10; i++) {
                    System.out.printf("%d x %d = %d\n", userNumber, i, (userNumber * i));
                }
                break;
            } else {
                System.out.println("Valor invalido. Por favor, digite um número inteiro");
                scanner.next();
            }
        }
        scanner.close();
    }
}
