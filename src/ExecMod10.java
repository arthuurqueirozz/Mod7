import java.util.Scanner;

public class ExecMod10 {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double sumNota = 0;
        for (int i = 1; i <= 4; i++){
            System.out.println("Entre com sua nota " + i +" :");
            sumNota += scanner.nextDouble();
        }

        System.out.println("Sua nota média é: " + sumNota / 4);

        if (sumNota / 4  >= 7){
            System.out.println("Você está aprovado!");
        }  else if (sumNota / 4 >= 5) {
            System.out.println("Você está de recuperação!");
        } else System.out.println("Você está reprovado!");


    }
}

