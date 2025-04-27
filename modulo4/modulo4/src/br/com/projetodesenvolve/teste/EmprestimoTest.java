package br.com.projetodesenvolve.teste;

import br.com.projetodesenvolve.modelos.Autor;
import br.com.projetodesenvolve.modelos.Emprestimo;
import br.com.projetodesenvolve.modelos.Livro;
import br.com.projetodesenvolve.modelos.Usuario;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class EmprestimoTest {

    Date dataRetirada = new Date();
    Date dataDevolucao = new Date();
    Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "brasileira", true  ), "Tecnologia");
    Usuario usuario = new Usuario("Gabriel", 21);
    Emprestimo emprestimo = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);

    @Test
    public void testGetLivro() {
        assertEquals("Java Basics", emprestimo.getLivro().getTitulo());
    }

    @Test
    public void testGetUsuario() {
        assertEquals("Gabriel", emprestimo.getUsuario().getNome());
    }

    @Test
    public void testGetDataRetirada() {
        assertNotNull(emprestimo.getDataRetirada());
    }

    @Test
    public void testGetDataDevolucao() {
        assertNotNull(emprestimo.getDataDevolucao());
    }
}