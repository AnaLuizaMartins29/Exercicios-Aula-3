import java.util.Scanner;

public class Exercicio3{

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int NP3;
        int NPA;

        System.out.print("Entre com a sua nota da NPA: ");
        NPA = entrada.nextInt();
        

        if(NPA >= 60){
            System.out.println("Você foi aprovado!!!");
        }else{
            System.out.println("Não foi de primeira, mas ainda pode fazer NP3");

            System.out.print("Entre com a nota da NP3: ");
            NP3 = entrada.nextInt();

            if((NP3 + NPA)/2 >= 50){
                System.out.println("Muito bem, esta aprovado!");
            }else{
                System.out.println("Eita, nao foi dessa vez!");
            }

        }
        entrada.close();

    }
}