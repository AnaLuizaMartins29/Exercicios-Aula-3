import java.util.Scanner;

public class Exercicio4{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int alunosMat;

        System.out.print("Entre com a quantidade de alunos matriculados em C125: ");
        alunosMat = entrada.nextInt();

        switch (alunosMat) {
            case 10:
            case 20:
                System.out.println("A sala utilizada será a I-15");
                break;
            case 30:
                System.out.println("A sala utilizada será a I-25");
                break;
            default:
                System.out.println("Entre com o numero correto de alunos matriculados.");
                break;
        }
        entrada.close();

    }
}