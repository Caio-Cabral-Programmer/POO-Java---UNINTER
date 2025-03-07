package uninter;

/**
 * Classe que representa a moeda Real
 */
public class Real extends Moeda {

    /**
     * Construtor da moeda Real
     * @param valor O valor em Reais
     */
    public Real(double valor) {
        super(valor);
    }

    /**
     * Converte o valor para Real (neste caso, retorna o próprio valor)
     * @return O valor em Reais
     */
    @Override
    public double converter() {
        return this.valor; // Real não precisa de conversão
    }

    /**
     * Retorna informações sobre a moeda Real
     * @return String formatada com o valor em Reais
     */
    @Override
    public String info() {
        return String.format("Real: R$ %.2f", this.valor);
    }
}