import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



class Filme {
    private String titulo;
    private String diretor;
    private int anoLancamento;

    public Filme(String titulo, String diretor, int anoLancamento) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return "Filme: " + titulo + " (Dirigido por " + diretor + ", " + anoLancamento + ")";
    }
}

public class CadastroFilmes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Filme> listaFilmes = new ArrayList<>();

        while (true) {
            System.out.println("Digite o título do filme (ou 'sair' para encerrar):");
            String titulo = scanner.nextLine();
            if (titulo.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("Digite o nome do diretor:");
            String diretor = scanner.nextLine();

            System.out.println("Digite o ano de lançamento:");
            int anoLancamento = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            Filme filme = new Filme(titulo, diretor, anoLancamento);
            listaFilmes.add(filme);
        }

        System.out.println("\nFilmes cadastrados:");
        for (Filme filme : listaFilmes) {
            System.out.println(filme);
        }
    }
}
