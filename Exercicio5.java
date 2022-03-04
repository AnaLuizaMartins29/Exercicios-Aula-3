import java.util.Random;
import java.util.Scanner;

public class Exercicio5{

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Random random = new Random();

        int gerado;
        int adivinhado;

        gerado = random.nextInt(10) + 1;

        do {
            System.out.print("Qual foi o número gerado? ");
            adivinhado = entrada.nextInt();
            if(adivinhado != gerado)
                System.out.println("Errado, nao foi esse o numero gerado! ");

        } while (gerado != adivinhado);

        System.out.println("Aí siiim, acertooou miseravi!!! ");
        entrada.close();

    }
}