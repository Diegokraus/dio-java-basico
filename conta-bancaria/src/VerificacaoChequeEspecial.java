import java.util.Scanner;

public class VerificacaoChequeEspecial { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        System.out.println("\nInforme os valores:");
        double saldo = scanner.nextDouble(); 
        double saque = scanner.nextDouble(); 
        double limiteChequeEspecial = 500; 

        if(saque > saldo){
            if(saque > (saldo + limiteChequeEspecial)){
                System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
            }else{
                System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
            }
        }else{
            System.out.println("Transacao realizada com sucesso.");
        }

        scanner.close(); 
    }
}