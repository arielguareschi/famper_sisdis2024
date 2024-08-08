package br.edu.famper.despesas.model;


import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Lancamento {
    private String uuid;
    private Categoria categoria;
    private Empresa empresa;
    private Tipo tipo;
    private Calendar data;
    private Double valor;
    private String observacao;


    public Lancamento() {
    }

    public Lancamento(String uuid, Categoria categoria, Empresa empresa, Tipo tipo, Calendar data, Double valor, String observacao) {
        this.uuid = uuid;
        this.categoria = categoria;
        this.empresa = empresa;
        this.tipo = tipo;
        this.data = data;
        this.valor = valor;
        this.observacao = observacao;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        String dataFormatada = sdf.format(this.data.getTime());

        return "Lancamento{" +
                "uuid='" + uuid + '\'' +
                ", categoria=" + categoria +
                ", empresa=" + empresa +
                ", tipo=" + tipo +
                ", data=" + dataFormatada +
                ", valor=" + valor +
                ", observacao='" + observacao + '\'' +
                '}';
    }
}
