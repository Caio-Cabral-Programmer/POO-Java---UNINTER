package empresa;

public class Principal {
    public static void main(String[] args) {

        Funcionario f = new Funcionario("Flávia", "12345678901");
        Carro c = new Carro("Toyota", "Azul", 4);
        Quadrado q = new Quadrado(5);

        Imprimivel i = f;
        i.imprimir();
        i = c;
        i.imprimir();
        i = q;
        i.imprimir();
    }

}
