import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        int tabuada = 1;
        while (tabuada <= 10) {
            System.out.println(numero+"x"+tabuada+" = "+(numero * tabuada++));
        }

    }

}
