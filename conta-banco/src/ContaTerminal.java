import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o número da agência:");
        String agencia = scanner.nextLine();

        System.out.print("Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o saldo:");
        double saldo = scanner.nextDouble();

        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);

        scanner.close();
    }
}
