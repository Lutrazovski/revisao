public class Main {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao PirateBay Filmes!");
        System.out.println("Star Wars");

        int anoLancamento = 1977;
        double media = (8.0 + 7.0 + 10.0)/3;

        System.out.println("Ano de Lancamento: " + anoLancamento);
        System.out.println("Avaliacao: " + media);

        String sinopse = """
                A princesa Leia é mantida refém pelas forças imperiais comandadas por Darth Vader.
                Luke Skywalker e o capitão Han Solo precisam libertá-la e restaurar a liberdade e a justiça na galáxia.
                """;

        System.out.println("Sinopse: " + sinopse);

    }
}