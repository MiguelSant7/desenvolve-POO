package br.com.projetodesenvolve.modelos;

import java.util.List;

public class Usuario extends Pessoa {
    // Histórico do usuario
    private List<Emprestimo> historicoEmprestimo;

    // Referenciando constructor
    public Usuario(String nome, int idade) {
        super(nome, idade);
    }

    // Getters e Setters
    public List<Emprestimo> getHistoricoEmprestimo() {
        return historicoEmprestimo;
    }

    public void setHistoricoEmprestimo(List<Emprestimo> historicoEmprestimo) {
        this.historicoEmprestimo = historicoEmprestimo;
    }
}
