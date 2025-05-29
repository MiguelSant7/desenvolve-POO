package br.com.projetodesenvolve.teste;

import br.com.projetodesenvolve.modelos.Autor;
import br.com.projetodesenvolve.modelos.EstrategiaPublicacaoArtigo;
import br.com.projetodesenvolve.modelos.EstrategiaPublicacaoLivro;

public class TestePublicacao {
    public static void main(String[] args) {
        // Cria um autor
        Autor autor = new Autor();

        // Testa publicação de livro
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoLivro());
        System.out.print("Teste publicação de livro: ");
        autor.publicar();

        // Testa publicação de artigo
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoArtigo());
        System.out.print("Teste publicação de artigo: ");
        autor.publicar();

        // Testa sem estratégia definida
        Autor autorSemEstrategia = new Autor();
        System.out.print("Teste sem estratégia: ");
        autorSemEstrategia.publicar();
    }
}
