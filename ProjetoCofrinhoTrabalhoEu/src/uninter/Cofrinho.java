package uninter;

import java.util.ArrayList;

public class Cofrinho {

    // Atributo da Classe Cofrinho, que é uma ArrayList de objetos da classe Moeda e de suas subclasses (Real, Dolar e Euro).
    private ArrayList<Moeda> listaMoedas;

    //Construtor para esta classe Cofrinho, na qual já inicializa com uma Arraylist vazia, que poderá conter somente objetos da classe Moeda e de suas subclasses (Real, Dolar e Euro).
    public Cofrinho() {
        this.listaMoedas = new ArrayList<Moeda>();
    }



    public void adicionarMoeda(Moeda moeda) {
        this.listaMoedas.add(moeda);

    }

    public boolean removerMoeda(Moeda moeda) {
        for (int i = 0; i < this.listaMoedas.size(); i++) {
            Moeda m = this.listaMoedas.get(i);
            if (m.equals(moeda)) {
                this.listaMoedas.remove(i);
                return true;
            }
        }
        return false;
    }

    public void listagemMoedas() {
        if (this.listaMoedas.isEmpty()) {
            System.out.println("O cofrinho está vazio.");

        }

        System.out.println("Lista de moedas no cofrinho:");
        for (Moeda moeda : this.listaMoedas) {
            System.out.println(moeda.info());
        }

    }

    public double totalConvertido() {

        double total = 0;
        for (Moeda moeda : this.listaMoedas) {
            total += moeda.converter();
        }
        return total;


    }
}
