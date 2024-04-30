import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;

        while (true) {
            System.out.println("\n");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consulta Saldo");
            System.out.println("0. Encerrar");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    double saque = scanner.nextDouble();

                    if (saldo - saque >= 0) {
                        saldo -= saque;
                        System.out.println("Saldo atual: " + saldo);
                    } else {

                        System.out.println("Saldo insuficiente.");
                        System.out.println("Programa encerrado.");
                        System.exit(0);
                    }

                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:

                    System.out.println("Programa encerrado.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        }

    }
}
