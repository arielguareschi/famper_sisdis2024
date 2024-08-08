package br.edu.famper.despesas.model;

public class Tipo {
    private String uuid;
    private String descricao;
    private String tipo;

    public Tipo() {
    }

    public Tipo(String uuid, String descricao, String tipo) {
        this.uuid = uuid;
        this.descricao = descricao;
        this.tipo = tipo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Tipo{" +
                "uuid='" + uuid + '\'' +
                ", descricao='" + descricao + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
