package uninter;

public class Euro extends Moeda {
    private static final double TAXA_CONVERSAO_EURO = 6.2;

    public Euro(double valor) {
        super(valor);
    }

    @Override
    public double converter() {
        return this.valor * TAXA_CONVERSAO_EURO;
    }

    @Override
    public String info() {
        return String.format("Euro: € %.2f", this.valor);
    }
}
