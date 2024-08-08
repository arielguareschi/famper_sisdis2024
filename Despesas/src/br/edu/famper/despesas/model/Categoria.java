package br.edu.famper.despesas.model;

public class Categoria {
    private String uuid;
    private String descricao;

    public Categoria() {
    }

    public Categoria(String uuid, String descricao) {
        this.uuid = uuid;
        this.descricao = descricao;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "uuid='" + uuid + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
