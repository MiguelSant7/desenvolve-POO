package br.com.projetodesenvolve.modelos;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private Autor autorPrincipal;
    private String genero;
    private boolean disponivel;
    private List<Emprestimo> emprestimos;

    // Construtor
    public Livro(String titulo, Autor autorPrincipal, String genero) {
        this.titulo = titulo;
        this.autorPrincipal = autorPrincipal;
        this.genero = genero;
        this.disponivel = true;
        this.emprestimos = new ArrayList<>();
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutorPrincipal() {
        return autorPrincipal;
    }

    public void setAutorPrincipal(Autor autorPrincipal) {
        this.autorPrincipal = autorPrincipal;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }
}
