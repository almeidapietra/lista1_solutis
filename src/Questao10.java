import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma cadeia de caracteres:");
        String texto = scanner.nextLine();

        int contVogais = 0;
        int contEspacos = 0;
        int contConsoantes = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c == ' ') {
                contEspacos++;
            } else if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    contVogais++;
                } else {
                    contConsoantes++;
                }
            }
        }

        System.out.println("Quantidade de vogais: " + contVogais);
        System.out.println("Quantidade de espaços em branco: " + contEspacos);
        System.out.println("Quantidade de consoantes: " + contConsoantes);

        scanner.close();
    }
}

