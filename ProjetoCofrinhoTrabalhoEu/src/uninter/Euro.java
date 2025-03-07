package uninter;

// Euro é uma subclasse de Moeda.
// Euro precisa de conversão, logo é necessária uma taxa de conversão para converter o valor da moeda para Real.
public class Euro extends Moeda {
    private static final double TAXA_CONVERSAO_EURO = 6.2; // Constante para a taxa de conversão do Euro para Real.

    // Construtor da classe Euro, que recebe como parâmetro o valor da moeda.
    // O method super(valor) chama o construtor da classe mãe (Moeda) e passa o valor como parâmetro.
    public Euro(double valor) {
        super(valor);
    }

    // Method converter() retorna o valor da moeda convertido para Real, utilizando a taxa de conversão definida na constante TAXA_CONVERSAO_EURO.
    @Override
    public double converter() {
        return this.valor * TAXA_CONVERSAO_EURO;
    }

    // Method info() retorna uma string com o nome "Euro" e o valor.
    @Override
    public String info() {
        return String.format("Euro: € %.2f", this.valor);
    }
}
