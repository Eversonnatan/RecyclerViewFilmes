package br.com.etecia.recyclerviewfilmes;

public class Filmes {
    private String titulo;
    private String descrcao;
    private String categoria;
    private int imagem;

    //criar o constrtutor com parametros alt+insert

    public Filmes(String titulo, String descrcao, String categoria, int imagem) {
        this.titulo = titulo;
        this.descrcao = descrcao;
        this.categoria = categoria;
        this.imagem = imagem;
    }

    //criando os metodos de acesso get an setter

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescrcao() {
        return descrcao;
    }

    public void setDescrcao(String descrcao) {
        this.descrcao = descrcao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
