package uninter;

/**
 * Classe abstrata que representa uma moeda genérica
 * Serve como base para os diferentes tipos de moedas (Real, Dolar, Euro)
 */

public abstract class Moeda {

    // Atributo de valor da moeda
    protected double valor;

    // Construtor da classe Moeda, que recebe como parâmetro o valor da moeda
    public Moeda (double valor){
        this.valor = valor;
    }


    // Method abstrato para converter a moeda para um valor em Real, que será implementado nas subclasses.
    // A implementação dessa função deve ser diferente para cada tipo de moeda (Real, Dolar, Euro).
    public abstract double converter();

    // Method abstrato para retornar uma string com a informação da moeda, que será implementado nas subclasses.
    // A implementação dessa função deve ser diferente para cada tipo de moeda (Real, Dolar, Euro).
    public abstract String info();

    // Method para comparar duas moedas pelo conteúdo delas e não pela referência delas na memória, que retorna true se as moedas são iguais e false se não são.
    @Override
    public boolean equals (Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Moeda moedaParaRemover = (Moeda) obj;
        return Double.doubleToLongBits(this.valor) == Double.doubleToLongBits(moedaParaRemover.valor);
    }


}
