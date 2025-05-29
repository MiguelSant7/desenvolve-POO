package br.com.projetodesenvolve.teste;

import br.com.projetodesenvolve.modelos.Artigo;
import br.com.projetodesenvolve.modelos.Autor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtigoTest {

    @Test
    public void testArtigoProperties() {
        Autor autor = new Autor("Joana", "Brasileira", false);
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);

        assertEquals("Entendendo Compiladores", artigo.getTitulo());
        assertEquals("Joana", artigo.getAutor().getNome());
        assertEquals("tecnologia", artigo.getGenero());
        assertTrue(artigo.isPublicado());
    }

    @Test
    public void testSetPublicado() {
        Autor autor = new Autor("Joana", "Brasileira", false);
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);

        artigo.setPublicado(false);
        assertFalse(artigo.isPublicado());
    }
}
