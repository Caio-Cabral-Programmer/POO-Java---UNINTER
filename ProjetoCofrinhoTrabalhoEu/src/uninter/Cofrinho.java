package uninter;

import java.util.ArrayList;

public class Cofrinho {

    // Atributo da Classe Cofrinho, que é uma ArrayList de objetos da classe Moeda e de suas subclasses (Real, Dolar e Euro).
    private ArrayList<Moeda> listaMoedas;

    //Construtor para esta classe Cofrinho, na qual já inicializa com uma Arraylist vazia, que poderá conter somente objetos da classe Moeda e de suas subclasses (Real, Dolar e Euro).
    public Cofrinho() {
        this.listaMoedas = new ArrayList<Moeda>();
    }



    // Method para adicionar uma moeda ao ArrayList cofrinho da Classe Cofrinho. O method recebe como parâmetro um objeto da classe Moeda e de suas subclasses (Real, Dolar e Euro).
    public void adicionarMoeda(Moeda moeda) {
        this.listaMoedas.add(moeda);

    }

    // Method para remover uma moeda do ArrayList cofrinho da Classe Cofrinho. O method recebe como parâmetro um objeto da classe Moeda e de suas subclasses (Real, Dolar e Euro),
    // e compara o objeto recebido com os objetos presentes na ArrayList. Se encontrar um objeto igual, ele remove o objeto da ArrayList e retorna true. Caso contrário, ele retorna false.
    public boolean removerMoeda(Moeda moeda) {
        for (int i = 0; i < this.listaMoedas.size(); i++) {
            Moeda moedaDaLista = this.listaMoedas.get(i);
            if (moedaDaLista.equals(moeda)) {
                this.listaMoedas.remove(i);
                return true;
            }
        }
        return false;
    }

    // Method para listar todas as moedas presentes no ArrayList cofrinho da Classe Cofrinho. O method não recebe parâmetros e apenas imprime a lista de moedas no console.
    // Caso o ArrayList cofrinho da Classe Cofrinho esteja vazio, ele imprime uma mensagem de aviso no console.
    // Caso o ArrayList cofrinho da Classe Cofrinho não esteja vazio, ele imprime a lista de moedas no console, com cada moeda representada por sua informação (nome e valor), utilizando o method info() da classe Moeda.
    public void listagemMoedas() {
        if (this.listaMoedas.isEmpty()) {
            System.out.println("O cofrinho está vazio.");

        } else {
            System.out.println("Lista de moedas no cofrinho:");
            for (Moeda moeda : this.listaMoedas) {
                System.out.println(moeda.info());
            }

        }


    }

    // Method para calcular e retornar o valor total convertido para Real. O method não recebe parâmetros e apenas retorna o valor total convertido para Real.
    // Para fazer a conversão, ele chama o method converter() da classe Moeda para cada moeda presente na ArrayList cofrinho da Classe Cofrinho, e soma os valores convertidos para Real.
    public double totalConvertido() {

        double total = 0;
        for (Moeda moeda : this.listaMoedas) {
            total += moeda.converter();
        }
        return total;


    }
}
