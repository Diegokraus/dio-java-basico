import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Salario: ");
        double salario = entrada.nextDouble();
        System.out.print("Beneficios: ");
        double beneficios = entrada.nextDouble();

        double imposto = 0;

        if(salario >= 0 && salario <= 1100){
            imposto = 0.05F * salario;
        }else if(salario > 1100 && salario <= 2500){
            imposto = 0.10F * salario;
        }else{
            imposto = 0.15F * salario;
        }

        double saida = salario - imposto + beneficios;
        System.out.println(String.format("Saida: %.2f", saida));

        entrada.close();
    }
}
