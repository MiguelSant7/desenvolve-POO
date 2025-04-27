package br.com.projetodesenvolve.principal;

import br.com.projetodesenvolve.modelos.Autor;
import br.com.projetodesenvolve.modelos.Emprestimo;
import br.com.projetodesenvolve.modelos.Livro;
import br.com.projetodesenvolve.modelos.Usuario;

import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        // Criando Autor e Usuario
        Usuario usuario = new Usuario("Lucas Rafael", 25);

        // Criando o Livro
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "brasileira", true), "Tecnologia");

        // Criando o Empréstimo
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);

        Autor autor = new Autor("Jess", "brasileira", true);

        Livro livro1 = new Livro("Java Basico", autor, "tecnologia");

        Livro livro2 = new Livro("Java Avançado", autor, "tecnologia");


        // Exibindo a saída
        if (!livro.isDisponivel()) {
            System.out.println("O livro não está disponível");
            System.out.println("Livro: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor().getNome());
            System.out.println("Genero: " + livro.getGenero());
            System.out.println("Usuario: " + usuario.getNome());
            System.out.println("Idade: " + usuario.getIdade());
            System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
            System.out.println("Data de Devolucao: " + emprestimo.getDataDevolucao());
        }
    }
}

