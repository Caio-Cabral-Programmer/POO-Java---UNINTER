package uninter;

import java.util.ArrayList;

public class Cofrinho {
    private ArrayList<Moeda> listaMoedas;

    public Cofrinho() {
        this.listaMoedas = new ArrayList<Moeda>();
    }

    /**
     * Adiciona uma moeda ao cofrinho
     * @param moeda A moeda a ser adicionada
     */
    public void adicionar(Moeda moeda) {
        this.listaMoedas.add(moeda);
    }

    /**
     * Remove uma moeda do cofrinho
     * @param moeda A moeda a ser removida
     * @return true se a moeda foi removida com sucesso, false caso contrário
     */
    public boolean remover(Moeda moeda) {
        for (int i = 0; i < this.listaMoedas.size(); i++) {
            Moeda m = this.listaMoedas.get(i);
            if (m.equals(moeda)) {
                this.listaMoedas.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * Lista todas as moedas no cofrinho
     */
    public void listagemMoedas() {
        if (this.listaMoedas.isEmpty()) {
            System.out.println("Cofrinho vazio!");
            return;
        }

        System.out.println("Moedas no cofrinho:");
        for (Moeda moeda : this.listaMoedas) {
            System.out.println(moeda.info());
        }
    }

    /**
     * Calcula o valor total convertido para Real
     * @return O valor total em Reais
     */
    public double totalConvertido() {
        double valorTotal = 0;

        for (Moeda moeda : this.listaMoedas) {
            valorTotal += moeda.converter();
        }

        return valorTotal;
    }
}