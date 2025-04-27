package br.com.projetodesenvolve.modelos;

public class Autor extends Pessoa {
    // Definindo nacionalidade
    private String nacionalidade;
    private final boolean isUsuario;
    private int obrasPublicadas;
    private String genero;

    // referenciando constructor
    public Autor(String nome, String nacionalidade, boolean isUsuario) {
        super(nome, nacionalidade);
        this.nacionalidade = capitalizar(nacionalidade);
        this.isUsuario = isUsuario;
    }

    private String capitalizar(String texto) {
        if (texto == null || texto.isEmpty()) return texto;
        return texto.substring(0, 1).toUpperCase() + texto.substring(1).toLowerCase();
    }

    // Gettrs e Setters
    public String getNacionalidade() {
        return nacionalidade;
    }

    public boolean isUsuario() {
        return isUsuario;
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
