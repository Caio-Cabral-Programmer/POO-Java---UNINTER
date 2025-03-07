package uninter;

/**
 * Classe abstrata que representa uma moeda genérica
 * Serve como base para os diferentes tipos de moedas (Real, Dolar, Euro)
 */

public abstract class Moeda {

    protected double valor;

    public Moeda (double valor){
        this.valor = valor;
    }

    public abstract double converter();

    public abstract String info();

    @Override
    public boolean equals (Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Moeda outraMoeda = (Moeda) obj;
        return Double.doubleToLongBits(this.valor) == Double.doubleToLongBits(outraMoeda.valor);
    }

    public double getValor() {
        return this.valor;
    }

}
