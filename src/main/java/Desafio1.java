import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu nome.");
        String nome = leitura.nextLine();
        System.out.println("Digite seu saldo.");
        double saldo = leitura.nextDouble();

        String menu = """
                
                Oque deseja fazer?
                1. Exibir saldo.
                2. Depositar.
                3. Retirar.
                4. Encerrar.
                """;

        for (int opcao = 0; opcao != 4;) {
            System.out.println(menu);
            opcao = leitura.nextInt();
            if (opcao == 1) {
                System.out.println("Seu saldo atual é de R$" + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor do deposito.");
                double deposito = leitura.nextDouble();
                saldo += deposito;
                System.out.println("Seu novo saldo é de R$" + saldo);
            } else if (opcao == 3) {
                System.out.println("Qual o valor de saque.");
                double saque = leitura.nextDouble();
                if (saque < saldo && saque > 0) {
                    saldo -= saque;
                    System.out.println("Seu novo saldo é de R$" + saldo);
                } else if (saque > saldo) {
                    System.out.println("Saque não aprovado.");
                    System.out.println("Valor de saque maior que saldo atual de R$" + saldo);
                } else {
                    System.out.println("Numero invalido");
                }
            } else if (opcao == 4) {
                System.out.println("Seu saldo final foi de R$" + saldo + ", " + nome + ".");
                System.out.println("Programa finalizado.");
                break;
            } else {
                System.out.println("Opcao invalida.");
            }
        }
    }
}
