import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        boolean clientePlus = true;
        boolean incluidoNoPlanoBasico = false;

        System.out.println("Digite o ano do filme: ");
        int anoDeLancamento = leitura.nextInt();

        boolean lancamento = anoDeLancamento <= 2022;

        if (lancamento) {
            System.out.println("Filme antigo");
        } else {
            System.out.println("Filme no lancamento");
        }

        if (clientePlus || incluidoNoPlanoBasico) {
            System.out.println("Filme liberado");
        }
    }
}
