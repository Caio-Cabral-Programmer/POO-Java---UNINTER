package uninter;

/**
 * Classe que representa a moeda Dolar
 */
public class Dolar extends Moeda {
    // Taxa de conversão do Dolar para Real
    private static final double TAXA_CONVERSAO = 5.3; // Exemplo: 1 Dolar = 5.3 Reais

    /**
     * Construtor da moeda Dolar
     * @param valor O valor em Dólares
     */
    public Dolar(double valor) {
        super(valor);
    }

    /**
     * Converte o valor de Dolar para Real
     * @return O valor convertido para Reais
     */
    @Override
    public double converter() {
        return this.valor * TAXA_CONVERSAO;
    }

    /**
     * Retorna informações sobre a moeda Dolar
     * @return String formatada com o valor em Dólares
     */
    @Override
    public String info() {
        return String.format("Dolar: $ %.2f", this.valor);
    }
}