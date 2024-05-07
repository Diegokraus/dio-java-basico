import java.util.Scanner; 

public class VerificadorNumeroConta { 

    public static void main(String[] args) throws Exception { 
        Scanner scanner = new Scanner(System.in); 
 
        try {
            System.out.println("Informe a senha: ");
            String numeroConta = scanner.nextLine();

            verificarNumeroConta(numeroConta);             
            
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
                         
        } finally {
            scanner.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta) throws Exception { 
        if(numeroConta.length() == 8){
            System.out.println("Numero de conta valido.");
        }else{
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}

