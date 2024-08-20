import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String palavra = scanner.nextLine();

        if (palindromo(palavra)) {
            System.out.println("A palavra \"" + palavra + "\" é um palíndromo.");
        } else {
            System.out.println("A palavra \"" + palavra + "\" não é um palíndromo.");
        }

        scanner.close();
    }

    public static boolean palindromo(String palavra) {

        String palavraLimpa = palavra.replaceAll("\\s+", "").toLowerCase();

        String palavraReversa = new StringBuilder(palavraLimpa).reverse().toString();
        return palavraLimpa.equals(palavraReversa);
    }
}
