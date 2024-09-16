import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        System.out.println("0. Sair");

        while (true) {
            if (scanner.hasNextInt()) {
                int userChoice = scanner.nextInt();

                switch (userChoice) {   
                    case 0: {
                        System.out.println("Saindo...");
                        scanner.close();
                        return;
                    }
                    case 1: {
                        System.out.println("Informe o valor do lado do quadrado");

                        if (scanner.hasNextDouble()) {
                            double side = scanner.nextDouble();
                            System.out.printf("A área do seu quadrado é %.2f", Math.pow(side, 2));
                        } else {
                            System.out.println("Valor inválido. Por favor, insira um número.");
                            scanner.next();
                        }
                        break;
                    }
                    case 2: {
                        System.out.println("Informe o valor do raio do círculo");

                        if (scanner.hasNextDouble()) {
                            double radius = scanner.nextDouble();
                            System.out.printf("A área do seu círculo é %.2f", (Math.PI * Math.pow(radius, 2)));
                        } else {
                            System.out.println("Valor inválido. Por favor, insira um número.");
                            scanner.next();
                        }
                        break;
                    }
                    default: {
                        System.out.println("Opção inválida. Escolha entre 1, 2 ou 0 para sair.");
                    }
                }
            } else {
                System.out.println("Opção inválida. Escolha entre 1, 2 ou 0 para sair.");
                scanner.next();
            }
        }
    }
}
