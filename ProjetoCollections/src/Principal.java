import java.util.*;

public class Principal {

    public static void main(String[] args) {

        //Exemplo com ArrayList
        ArrayList <String> pessoas1 = new ArrayList<>();

        pessoas1.add("João");
        pessoas1.add("Maria");
        pessoas1.add("Pedro");
        pessoas1.add("Ana");

        System.out.println(pessoas1.get(0));
        System.out.println(pessoas1); // Lista inicial
        Collections.sort(pessoas1); // Lista ordenada
        System.out.println(pessoas1);
        Collections.reverse(pessoas1); // Lista em ordem inversa
        System.out.println(pessoas1);
        Collections.shuffle(pessoas1); // Lista embaralhada
        System.out.println(pessoas1);
        pessoas1.remove(2);
        System.out.println(pessoas1);
        System.out.println(pessoas1.size()); // Tamanho da lista
        System.out.println(pessoas1.contains("Maria")); // Verifica se a lista contém a string "Maria"
        System.out.println(pessoas1.indexOf("Maria")); // Retorna a posição da string "Maria" na lista
        System.out.println(pessoas1.isEmpty()); // Verifica se a lista está vazia
        System.out.println(Collections.min(pessoas1)); // Retorna o menor elemento da lista
        System.out.println(Collections.max(pessoas1)); // Retorna o maior elemento da lista

        //Exemplo com LinkedList
        LinkedList<String> pessoas2 = new LinkedList<>();

        pessoas2.add("João");
        pessoas2.add("Maria");
        pessoas2.add("Pedro");
        pessoas2.add("Ana");

        System.out.println(pessoas2);

        //Exemplo com Mapa
        HashMap<String,String> capitais = new HashMap<>();
        capitais.put("Brasil", "Brasília");
        capitais.put("Argentina", "Buenos Aires");
        capitais.put("Chile", "Santiago");
        capitais.put("Colombia", "Bogotá");

        System.out.println(capitais);
        System.out.println(capitais.get("Brasil"));

        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println();

        // Iterator

        ArrayList<Integer> lista = new ArrayList<>();
        HashSet<Integer> conjunto = new HashSet<>();
        HashMap<String, Integer> mapa = new HashMap<>();

        int soma;
        soma=0;
        for (int i = 0; i < lista.size(); i++) {
            soma += lista.get(i);
        }

        soma = 0;

        for (int item : lista) {
            soma += item;
        }

        // Exemplo com iterator na lista
        soma = 0;
        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()) {
            soma += it.next();
        }

        System.out.println("Soma dos elementos da lista: " + soma);

        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println();

        // Exemplo com iterator no conjunto
        soma = 0;
        Iterator<Integer> it2 = conjunto.iterator();
        while (it2.hasNext()) {
            soma += it2.next();
        }

        System.out.println("Soma dos elementos do conjunto: " + soma);

        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println();

        // Exemplo com iterator no mapa
        soma = 0;
        Iterator<Map.Entry<String, Integer>> it3 = mapa.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry<String, Integer> entry = it3.next();
            soma += entry.getValue();
        }

        System.out.println("Soma dos valores do mapa: " + soma);

        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println();

        // Exemplo com iterator na lista com um métod o
        soma = 0;
        for (int item : lista) {
            soma += item;
        }

        System.out.println("Soma dos elementos da lista: " + soma);

        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println();





    }


}
