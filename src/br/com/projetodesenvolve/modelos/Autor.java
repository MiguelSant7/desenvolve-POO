package br.com.projetodesenvolve.modelos;

public class Autor extends Pessoa {
    // Definindo nacionalidade
    private String nacionalidade;
    private int obrasPublicadas;
    private String genero;

    // referenciando constructor
    public Autor(String nome, int idade) {
        super(nome, idade);
    }

    // Gettrs e Setters
    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getObrasPublicadas() {
        return obrasPublicadas;
    }

    public void setObrasPublicadas(int obrasPublicadas) {
        this.obrasPublicadas = obrasPublicadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
