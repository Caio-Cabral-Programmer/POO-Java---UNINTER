package empresa;

import java.util.ArrayList;

public class Cofrinho {
    private ArrayList<Moeda> moedas = new ArrayList<>();

    public void add (Moeda m) {
        moedas.add(m);
    }

    public double calcularTotalDeMoedas() {
        double total = 0;
        for (Moeda moeda : moedas) {
            total += moeda.getValor();
        }
        return total;
    }
}
