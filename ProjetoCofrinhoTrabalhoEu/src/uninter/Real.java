package uninter;

public class Real extends Moeda {

    public Real(double valor) {
        super(valor);
    }

    @Override
    public double converter() {
        return this.valor; // Real não precisa de conversão
    }

    @Override
    public String info() {
        return String.format("Real: R$ %.2f", this.valor);
    }

}


