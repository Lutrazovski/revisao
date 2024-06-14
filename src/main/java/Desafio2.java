import java.util.Random;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);

        String instrucao = """
                Jogo de advinhacao.
                Você terá 5 tentativas para acertar um numero inteiro entre 0 e 100.
                """;

        System.out.println(instrucao);
        int tentativa = 0;
        int restanteTentativa = 6;

        for (int i = 1; i <= 5; i++) {
            --restanteTentativa;
            System.out.println("Escolha um numero de 0 a 100.");
            System.out.println("Tentativas restantes: " + restanteTentativa);
            tentativa = leitura.nextInt();
            if (tentativa == numeroAleatorio) {
                break;
            } else if (tentativa < numeroAleatorio) {
                System.out.println("Numero menor que o numero secreto");
            } else {
                System.out.println("Numero maior que o numero secreto");
            }
        }
        if (tentativa == numeroAleatorio) {
            System.out.println("Tentativa de adivinhacao bem sucedida");
            System.out.println("Numero secreto: " + numeroAleatorio);
        } else {
            System.out.println("Tentativas esgotadas, mais sorte na próxima vez");
            System.out.println("Numero secreto: " + numeroAleatorio);
        }

    }
}
