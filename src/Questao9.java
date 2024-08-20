import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do raio do círculo:");
        double raio = scanner.nextDouble();

        double area = Math.PI * raio * raio;
        int areaArredondada = (int) Math.round(area);

        System.out.println("A área do círculo com raio " + raio + " é aproximadamente " + areaArredondada);

        scanner.close();
    }
}
