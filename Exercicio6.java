import java.util.Random;
import java.util.Scanner;

public class Exercicio6{

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Random rand = new Random();

        int gerado, adivinhado;

        gerado = rand.nextInt(10) + 1;

        do {
            System.out.print("Qual foi o número gerado? ");
            adivinhado = entrada.nextInt();
            if(adivinhado < gerado)
                System.out.println("O numero gerado nao foi esse, é um numero maior.");
            else if(adivinhado > gerado)
                System.out.println("O numero gerado nao foi esse, é um numero menor");

        } while (gerado != adivinhado);

        System.out.println("Aí siiim, acertooou miseravi!!! ");

        entrada.close();

    }
}