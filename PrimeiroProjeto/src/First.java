public class First {
    public static void main(String[] args) {
        System.out.println("Ola Mundo!");

        String xdb = "teste";
        System.out.println(xdb);
        int idade = 20;
        Double media = 1.5;
        boolean aprovado = false;

        if (idade >= 18){
            System.out.println("Ja pode ser preso!");
        } else if (idade < 18 && idade >= 16){
            System.out.println("Só soco no estomago");
        } else {
            System.out.println("Vai para o conselho");
        }

        switch (xdb){
            case "a":
                aprovado = true;
                break;
            default:
                aprovado = false;
                break;
        }
    }
}
