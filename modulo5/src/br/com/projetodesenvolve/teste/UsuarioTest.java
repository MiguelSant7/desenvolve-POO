package br.com.projetodesenvolve.teste;

import br.com.projetodesenvolve.modelos.Usuario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

        Usuario usuario = new Usuario("Gabriel", 21);

    @Test
    public void testGetNome() {
        assertEquals("Gabriel", usuario.getNome());
    }

    @Test
    public void testGetIdade() {
        assertEquals(21, usuario.getIdade());
    }

    @Test
    public void testSetNome() {
        usuario.setNome("Lucas");
        assertEquals("Lucas", usuario.getNome());
    }
}