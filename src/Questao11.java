import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira palavra:");
        String palavra1 = scanner.nextLine();

        System.out.println("Digite a segunda palavra:");
        String palavra2 = scanner.nextLine();

        if (palavra1.compareTo(palavra2) < 0) {
            System.out.println("Palavras em ordem alfabética:");
            System.out.println(palavra1);
            System.out.println(palavra2);
        } else if (palavra1.compareTo(palavra2) > 0) {
            System.out.println("Palavras em ordem alfabética:");
            System.out.println(palavra2);
            System.out.println(palavra1);
        } else {
            System.out.println("As palavras são iguais:");
            System.out.println(palavra1);
        }

        if (palavra1.length() > palavra2.length()) {
            System.out.println("A palavra com o maior número de caracteres é: " + palavra1);
        } else if (palavra1.length() < palavra2.length()) {
            System.out.println("A palavra com o maior número de caracteres é: " + palavra2);
        } else {
            System.out.println("As palavras têm o mesmo número de caracteres.");
        }

        scanner.close();
    }
}

