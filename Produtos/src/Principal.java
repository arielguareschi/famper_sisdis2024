import model.Produto;

public class Principal {

    public static void main(String[] args) {
        /*
            Produto <---- CLASSE
            new <-------- INSTANCIACAO
            sukita <----- OBJETO
         */
        Produto sukita = new Produto();
        sukita.setCodigo(1);
        sukita.setDescricao("Sukita");
        sukita.setPreco(1.5);
        sukita.setAtivo(true);

        Produto pipoca = new Produto(
                2,
                "Pipokinha",
                2.99,
                false
        );

    }
}
