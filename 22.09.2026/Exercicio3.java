import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");

        System.out.print("Escolha uma opção: ");
        int opcao = leia.nextInt();

        System.out.print("Digite o primeiro número: ");
        double numero1 = leia.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = leia.nextDouble();

        switch (opcao) {

            case 1:
                System.out.println("Resultado: " + (numero1 + numero2));
                break;

            case 2:
                System.out.println("Resultado: " + (numero1 - numero2));
                break;

            case 3:
                System.out.println("Resultado: " + (numero1 * numero2));
                break;

            case 4:

                if (numero2 == 0) {
                    System.out.println("Não é possível dividir por zero.");
                } else {
                    System.out.println("Resultado: " + (numero1 / numero2));
                }

                break;

            default:
                System.out.println("Opção inválida.");
        }

        leia.close();
    }
}