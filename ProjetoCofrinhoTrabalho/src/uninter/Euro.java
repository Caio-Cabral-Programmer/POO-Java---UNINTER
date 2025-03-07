package uninter;

/**
 * Classe que representa a moeda Euro
 */
public class Euro extends Moeda {
    // Taxa de conversão do Euro para Real
    private static final double TAXA_CONVERSAO = 6.2; // Exemplo: 1 Euro = 6.2 Reais

    /**
     * Construtor da moeda Euro
     * @param valor O valor em Euros
     */
    public Euro(double valor) {
        super(valor);
    }

    /**
     * Converte o valor de Euro para Real
     * @return O valor convertido para Reais
     */
    @Override
    public double converter() {
        return this.valor * TAXA_CONVERSAO;
    }

    /**
     * Retorna informações sobre a moeda Euro
     * @return String formatada com o valor em Euros
     */
    @Override
    public String info() {
        return String.format("Euro: € %.2f", this.valor);
    }
}