package uninter;

public class Dolar extends Moeda {
    private static final double TAXA_CONVERSAO_DOLAR = 5.3;

    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public double converter() {
        return this.valor * TAXA_CONVERSAO_DOLAR;
    }

    @Override
    public String info() {
        return String.format("Dolar: $ %.2f", this.valor);
    }
}
