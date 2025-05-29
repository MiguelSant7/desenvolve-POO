package br.com.projetodesenvolve.teste;

import br.com.projetodesenvolve.modelos.Autor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutorTest {

    Autor autor = new Autor("jess", "brasileira", true);

    @Test
    public void testGetNome() {
        assertEquals("jess", autor.getNome());
    }

    @Test
    public void testGetNacionalidade() {
        assertEquals("Brasileira", autor.getNacionalidade());
    }

    @Test
    public void testSetNacionalidade() {
        autor.setNacionalidade("Italiana");
        assertEquals("Italiana", autor.getNacionalidade());
    }
}