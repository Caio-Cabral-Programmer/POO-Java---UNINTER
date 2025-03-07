package uninter;

/**
 * Classe abstrata que representa uma moeda genérica
 * Serve como base para os diferentes tipos de moedas (Real, Dolar, Euro)
 */
public abstract class Moeda {
    protected double valor;

    /**
     * Construtor da moeda
     * @param valor O valor da moeda
     */
    public Moeda(double valor) {
        this.valor = valor;
    }

    /**
     * Method abstrato para converter o valor da moeda para Real
     * @return O valor convertido para Real
     */
    public abstract double converter();

    /**
     * Method abstrato para retornar informações sobre a moeda
     * @return String com informações da moeda
     */
    public abstract String info();

    /**
     * Verifica se duas moedas são iguais (mesmo tipo e valor)
     * @param obj O objeto a ser comparado
     * @return true se as moedas forem iguais, false caso contrário
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Moeda outraMoeda = (Moeda) obj;
        return Double.doubleToLongBits(this.valor) == Double.doubleToLongBits(outraMoeda.valor);
    }

    /**
     * Retorna o valor da moeda
     * @return O valor da moeda
     */
    public double getValor() {
        return this.valor;
    }
}