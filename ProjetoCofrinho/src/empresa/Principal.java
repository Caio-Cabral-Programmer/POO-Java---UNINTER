package empresa;

public class Principal {
    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho();
        cofrinho.add(new Moeda("Euro", 0.5));
        cofrinho.add(new Moeda("Euro", 1));
        cofrinho.add(new Moeda("Euro", 0.1));
        cofrinho.add(new Moeda("Euro", 0.05));

        System.out.printf("O total no cofrinho é: %.2f", cofrinho.calcularTotalDeMoedas());

    }
}
