package br.com.dio.desafio.dominio;
/*Herança abstrata nao instacia só existe para ser extendida nas classes filhas*/
public abstract class Conteudo {
	/*final esta representando como constante
	protecd só os filhso teram acesso*/
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;
    /*se colocar abstrata a clase deve ser abstrado tambem */
    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
