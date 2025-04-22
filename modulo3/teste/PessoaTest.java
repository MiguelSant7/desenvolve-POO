package br.com.projetodesenvolve.teste;

import br.com.projetodesenvolve.modelos.Pessoa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    Pessoa pessoa = new Pessoa("Miguel", 18);

    @Test
    public void testGetNome() {
        assertEquals("Miguel", pessoa.getNome());
    }

    @Test
    public void testGetIdade() {
        assertEquals(18, pessoa.getIdade());
    }

    @Test
    public void testSetNome() {
        pessoa.setNome("João");
        assertEquals("João", pessoa.getNome());
    }

    @Test
    public void testSetIdade() {
        pessoa.setIdade(25);
        assertEquals(25, pessoa.getIdade());
    }
}