package empresa;

public class Principal {
    public static void main(String[] args) {

        Conta c1 = new Conta (111, "Mario", 2000, 500);
        Conta c2 = new Conta (222, "João", 1000, 1000);

        c1.info();
        System.out.println();
        c2.info();
        System.out.println();

        if (!c1.sacar(2000)) {
            System.out.println("Não foi possível sacar o dinheiro");
        }

        if (!c1.depositar(-500)) {
            System.out.println("Não foi possível depositar o dinheiro");
        }

        if (!c1.transferir(c2, 500)) {
            System.out.println("Não foi possível transferir o dinheiro");
        }
        System.out.println();

        c1.info();
        System.out.println();
        c2.info();
    }
}
