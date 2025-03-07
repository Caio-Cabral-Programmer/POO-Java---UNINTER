package uninter;

// Real é uma subclasse de Moeda.
// Real não precisa de conversão, então o method converter retorna o valor original.
// Real também não precisa de informações adicionais, então o method info retorna uma string com o nome "Real" e o valor.
public class Real extends Moeda {

    // Construtor da classe Real, que recebe como parâmetro o valor da moeda.
    // O method super(valor) chama o construtor da classe mãe (Moeda) e passa o valor como parâmetro.
    public Real(double valor) {
        super(valor);
    }

    // Real não precisa de conversão, logo retorna o valor original.
    @Override
    public double converter() {
        return this.valor;
    }

    // Method info() retorna uma string com o nome "Real" e o valor.
    @Override
    public String info() {
        return String.format("Real: R$ %.2f", this.valor);
    }

}


