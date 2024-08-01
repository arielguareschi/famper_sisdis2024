public class Principal {

    public static Double somar() {
        Double numero1 = 15.2;
        Double numero2 = 24.11;

        Double soma = numero1 + numero2;
        return soma;
    }

    public static void mensagem() {
        System.out.println("Mensagem do programa");
    }


    public static boolean parImpar(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Double resultado = somar();
        System.out.println(resultado);

        System.out.println(parImpar(10));
        mensagem();
    }
}
