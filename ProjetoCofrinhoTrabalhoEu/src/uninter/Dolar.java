package uninter;

// Dolar é uma subclasse de Moeda.
// Dolar precisa de conversão, logo é necessária uma taxa de conversão para converter o valor da moeda para Real.
public class Dolar extends Moeda {
    private static final double TAXA_CONVERSAO_DOLAR = 5.3; // Constante para a taxa de conversão do Dolar para Real.

    // Construtor da classe Dolar, que recebe como parâmetro o valor da moeda.
    // O method super(valor) chama o construtor da classe mãe (Moeda) e passa o valor como parâmetro.
    public Dolar(double valor) {
        super(valor);
    }

    // Method converter() retorna o valor da moeda convertido para Real, utilizando a taxa de conversão definida na constante TAXA_CONVERSAO_DOLAR.
    @Override
    public double converter() {
        return this.valor * TAXA_CONVERSAO_DOLAR;
    }

    // Method info() retorna uma string com o nome "Dolar" e o valor.
    @Override
    public String info() {
        return String.format("Dolar: $ %.2f", this.valor);
    }
}
