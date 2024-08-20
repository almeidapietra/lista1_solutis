import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        int valor1 = scanner.nextInt();

        System.out.println("Digite o segundo valor:");
        int valor2 = scanner.nextInt();

        if (valor1 > valor2) {
            System.out.println("O maior valor é: " + valor1);
        } else if (valor2 > valor1) {
            System.out.println("O maior valor é: " + valor2);
        } else {
            System.out.println("Os valores são iguais.");
        }

        scanner.close();
    }
}
