package model;


public class Produto {
    private int codigo;
    private String descricao;
    private Double preco;
    private boolean ativo;

    public Produto() {
    }

    public Produto(int codigo, String descricao, Double preco, boolean ativo) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.ativo = ativo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
