import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        System.out.println("Números primos menores que " + numero + ":");
        for (int i = 2; i < numero; i++) {
            if (numeroprimo(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }

    public static boolean numeroprimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}