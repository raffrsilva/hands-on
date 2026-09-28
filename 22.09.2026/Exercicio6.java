import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        System.out.println("1 - Comum");
        System.out.println("2 - Premium");
        System.out.println("3 - Funcionário");

        System.out.print("Digite a categoria: ");
        int categoria = scanner.nextInt();

        double percentualDesconto;

        if (categoria == 1) {
            percentualDesconto = 0.05;

        } else if (categoria == 2) {
            percentualDesconto = 0.10;

        } else if (categoria == 3) {
            percentualDesconto = 0.15;

        } else {
            System.out.println("Categoria inválida.");
            scanner.close();
            return;
        }

        double valorDesconto = valorCompra * percentualDesconto;
        double valorFinal = valorCompra - valorDesconto;

        System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Valor final a pagar: R$ %.2f%n", valorFinal);

        scanner.close();
    }
}