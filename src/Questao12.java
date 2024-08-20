import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quilometragemTotal = 0;
        int litrosTotal = 0;

        System.out.println("Quantos tanques você deseja registrar?");
        int numTanques = scanner.nextInt();

        if (numTanques <= 0) {
            System.out.println("Número de registros deve ser maior que 0.");
            scanner.close();
            return;
        }

        for (int i = 1; i <= numTanques; i++) {
            System.out.println("Digite a quilometragem dirigida para o tanque " + i + ":");
            int quilometragem = scanner.nextInt();

            System.out.println("Digite a quantidade de litros de gasolina consumidos para o tanque " + i + ":");
            int litros = scanner.nextInt();

            quilometragemTotal += quilometragem;
            litrosTotal += litros;

            double consumoPorLitro = (double) quilometragem / litros;
            System.out.printf("Consumo para o tanque %d: %.2f km/l\n", i, consumoPorLitro);
        }

        double consumoMedioTotal = (double) quilometragemTotal / litrosTotal;
        System.out.printf("Quilometragem combinada: %d km\n", quilometragemTotal);
        System.out.printf("Soma total de litros consumidos: %d litros\n", litrosTotal);
        System.out.printf("Consumo médio total: %.2f km/l\n", consumoMedioTotal);

        scanner.close();
    }
}

