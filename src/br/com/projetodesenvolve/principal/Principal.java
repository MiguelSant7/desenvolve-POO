package br.com.projetodesenvolve.principal;

import br.com.projetodesenvolve.modelos.Autor;
import br.com.projetodesenvolve.modelos.Emprestimo;
import br.com.projetodesenvolve.modelos.Livro;
import br.com.projetodesenvolve.modelos.Usuario;

import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        // Criando Autor e Usuario
        Autor autor = new Autor("Jessica Felix", 30);
        Usuario usuario = new Usuario("Lucas Rafael", 25);

        // Criando o Livro
        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia");

        // Criando o Empréstimo
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);

        // Exibindo a saída
        if (!livro.isDisponivel()) {
            System.out.println("O livro não está disponível");
            System.out.println("Livro: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutorPrincipal().getNome());
            System.out.println("Genero: " + livro.getGenero());
            System.out.println("Usuario: " + usuario.getNome());
            System.out.println("Idade: " + usuario.getIdade());
            System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
            System.out.println("Data de Devolucao: " + emprestimo.getDataDevolucao());
        }
    }
}

