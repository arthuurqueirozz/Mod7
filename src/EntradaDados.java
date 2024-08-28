import java.util.Scanner;

public class EntradaDados {
    public static  void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("type a text: ");
        String text = scanner.nextLine();

        System.out.println("type a number: ");
        Double number = scanner.nextDouble();

        System.out.println(text);
        System.out.println(number);

        scanner.close();
    }
}
