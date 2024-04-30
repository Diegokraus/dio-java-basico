import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        try {
            // Defina a formatação desejada, neste caso, estamos usando a formatação padrão
            NumberFormat formatador = NumberFormat.getInstance();
            
            // Tente analisar a string para um número
            Number valor = formatador.parse("a1.75");
            
            // Se a análise for bem-sucedida, imprima o valor
            System.out.println(valor);
        } catch (ParseException e) {
            // Se ocorrer uma exceção de análise, imprima o rastreamento da pilha
            e.printStackTrace();
        }
    }
}
