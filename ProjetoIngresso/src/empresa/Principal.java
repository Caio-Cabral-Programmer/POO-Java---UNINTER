package empresa;

public class Principal {
    public static void main(String[] args) {
        IngressoVip iv = new IngressoVip("Festival de Cinema", 50.0, 10.0);
        iv.info();

        System.out.println("--------------------------------");

        Ingresso i = new Ingresso("Festival de Cinema", 50.0);
        i.info();
    }
}
