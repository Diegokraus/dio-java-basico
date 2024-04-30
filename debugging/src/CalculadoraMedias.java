import java.util.Scanner;

public class CalculadoraMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"CAMILA", "LUCAS", "BRUNA", "PEDRO"};

        double media = calculadoraMediaTurma(alunos, scan);
        System.out.printf("Media da turma %.1f", media);
    }
    public static double calculadoraMediaTurma(String [] alunos, Scanner scanner){
        double soma = 0;
        for(String aluno : alunos){
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }
        return soma / alunos.length;
    }
}
