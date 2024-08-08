package br.edu.famper.despesas.view;

import br.edu.famper.despesas.model.Categoria;
import br.edu.famper.despesas.model.Empresa;
import br.edu.famper.despesas.model.Lancamento;
import br.edu.famper.despesas.model.Tipo;

import java.util.Calendar;
import java.util.UUID;

public class Principal {

    public static void main(String[] args) {
        Tipo salario = new Tipo();
        salario.setUuid(UUID.randomUUID().toString());
        salario.setDescricao("Salario");
        salario.setTipo("E");

        Categoria lanches = new Categoria();
        lanches.setUuid(UUID.randomUUID().toString());
        lanches.setDescricao("Lanches");

        Empresa bascuio = new Empresa();
        bascuio.setCnpj("23.111.253/0001-10");
        bascuio.setNome("Espetinho do bascuio");
        bascuio.setEndereco("Ali no chale");
        bascuio.setTelefone("(46) 98891-8888");

        Lancamento expetinho = new Lancamento();
        expetinho.setUuid(UUID.randomUUID().toString());
        expetinho.setCategoria(lanches);
        expetinho.setTipo(salario);
        expetinho.setEmpresa(bascuio);
        expetinho.setValor(15.0);
        expetinho.setObservacao("2 de frango com bacon");
        expetinho.setData(Calendar.getInstance());

        System.out.println(expetinho);

        System.out.println(expetinho.getEmpresa().getCnpj());
    }
}
