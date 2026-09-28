import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double saldo = 1000.00;
        int opcao;

        do {

            System.out.println("\n *** CAIXA ***");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("4 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = leia.nextInt();

            switch (opcao) {

                case 1:

                    System.out.print("Digite o valor do depósito: ");
                    double deposito = leia.nextDouble();

                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito realizado.");
                    } else {
                        System.out.println("O depósito deve ser maior que 0, seu quebrado!.");
                    }

                    break;

                case 2:

                    System.out.print("Digite o valor do saque: ");
                    double saque = leia.nextDouble();

                    if (saque > 0 && saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque realizado.");
                    } else {
                        System.out.println("Deu não!kkk.");
                    }

                    break;

                case 3:

                    System.out.printf("Saldo: R$ %.2f%n", saldo);

                    break;

                case 4:

                    System.out.printf("FALOOOOU. Seu saldo final: R$ %.2f%n", saldo);

                    break;

                default:

                    System.out.println("Opção inválida.");
            }

        } while (opcao != 4);

        leia.close();
    }
}