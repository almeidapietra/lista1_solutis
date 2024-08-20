import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {

        String[] diasDaSemana = {
                "Domingo",
                "Segunda-feira",
                "Terça-feira",
                "Quarta-feira",
                "Quinta-feira",
                "Sexta-feira",
                "Sábado"
        };

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite um número de 1 a 7:");
        int numero = scanner.nextInt();


        if (numero >= 1 && numero <= 7) {
            System.out.println("O dia da semana correspondente é: " + diasDaSemana[numero - 1]);
        } else {
            System.out.println("Número inválido. Digite um número entre 1 e 7.");
        }

        scanner.close();
    }
}

