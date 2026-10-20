
import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo;
        int acidentes;
        int veiculos;
        int maior = 0, menor = 0;
        int codigoMaior = 0, codigoMenor = 0;
        double somaVeiculos = 0;

        for (int i = 1; i <= 200; i++) {
            System.out.println("Cidade " + i);

            System.out.print("Código: ");
            codigo = sc.nextInt();

            System.out.print("Estado: ");
            String estado = sc.next();

            System.out.print("Veículos de passeio: ");
            veiculos = sc.nextInt();

            System.out.print("Acidentes com vítimas: ");
            acidentes = sc.nextInt();

            somaVeiculos += veiculos;

            if (i == 1 || acidentes > maior) {
                maior = acidentes;
                codigoMaior = codigo;
            }

            if (i == 1 || acidentes < menor) {
                menor = acidentes;
                codigoMenor = codigo;
            }
        }

        System.out.println("Maior número de acidentes: "
                + maior + " | Cidade: " + codigoMaior);

        System.out.println("Menor número de acidentes: "
                + menor + " | Cidade: " + codigoMenor);

        System.out.println("Média de veículos: "
                + somaVeiculos / 200);

        sc.close();
    }
}
