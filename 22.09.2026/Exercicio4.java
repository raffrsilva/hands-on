import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma nota entre 0 e 100: ");
        int nota = scanner.nextInt();

        while (nota < 0 || nota > 100) {

            System.out.println("Numero errado!");

            System.out.print("Digite novamente: ");
            nota = scanner.nextInt();
        }

        System.out.println("Ok, numero correto: " + nota);

        scanner.close();
    }
}