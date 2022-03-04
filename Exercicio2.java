import java.util.Scanner;

public class Exercicio2{

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int partida1;
        int partida2;
        int partida3;

        System.out.print("Entre com o numero de zumbis que morreram na partida 1: ");
        partida1 = entrada.nextInt();
        System.out.print("Entre com o numero de zumbis que morreram na partida 2: ");
        partida2 = entrada.nextInt();
        System.out.print("Entre com o numero de zumbis que morreram na partida 3: ");
        partida3 = entrada.nextInt();

        int total = partida1 + partida2 + partida3;
        int media = total/3;

        System.out.println("A quantidade total de mortes foi: " + total);
        System.out.println("A media de zumbis mortos foi de: " + media);

        entrada.close();

    }
}