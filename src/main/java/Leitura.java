import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome do seu filme favorito.");
        String filme = leitura.nextLine();

        System.out.println("Digite o ano de lancamento.");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Digite qual sua nota para esse filme.");
        double nota = leitura.nextDouble();

        System.out.println("O seu filme preferido é " + filme);
        System.out.println("Foi lancado em " + anoDeLancamento);
        System.out.println("Sua nota para este filme é: " + nota);
    }
}
