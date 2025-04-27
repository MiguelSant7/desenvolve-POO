package br.com.projetodesenvolve.teste;

import br.com.projetodesenvolve.modelos.Autor;
import br.com.projetodesenvolve.modelos.Livro;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {

    Autor autor = new Autor("Jess", "Brasileira", true);
    Livro livro1 = new Livro("Java Basico", autor, "tecnologia");
    Livro livro2 = new Livro("Java Avançado", autor, "tecnologia");

    @Test
    public void testGetTitulo() {
        assertEquals("Java Basico", livro1.getTitulo());
    }

    @Test
    public void testDisponibilidadeLivro1() {
        assertTrue(livro1.isDisponivel());
    }

    @Test
    public void testDisponibilidadeLivro2() {
        assertTrue(livro2.isDisponivel());
    }

    @Test
    public void testGetGenero() {
        assertEquals("tecnologia", livro1.getGenero());
    }

    @Test
    public void testGetAutor() {
        assertEquals("Jess", livro1.getAutor().getNome());
    }
}