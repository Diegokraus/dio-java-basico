import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
        int parametro1 = terminal.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametro2 = terminal.nextInt();

        try{
            contar(parametro1, parametro2);

        }catch(ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }

        terminal.close();
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        if(parametro1 > parametro2){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int contagem = parametro2 - parametro1;

        for(int i = 0; i < contagem; i++){
            System.out.println("Imprimindo o numero: " + (i + 1));
        }
    }    
}

class ParametrosInvalidosException extends Exception{
    public ParametrosInvalidosException(String mensagem){
        super(mensagem);
    }
}
