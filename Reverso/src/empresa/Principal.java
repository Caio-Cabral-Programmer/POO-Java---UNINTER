package empresa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ArrayList<String> listaNomes = new ArrayList<>();
        System.out.print("Digite a quantidade de nomes: ");
        int quantidade = teclado.nextInt();
        String nome;
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nome = teclado.next();
            listaNomes.add(nome);
        }
        // Ordem normal
        System.out.println("Lista de nomes na ordem normal: " + listaNomes);

        // Ordem inversa usando Collections
        Collections.reverse(listaNomes);
        System.out.println("Lista de nomes em ordem inversa: " + listaNomes);

        // Ordem inversa usando for
        for (int i = listaNomes.size() - 1; i >= 0; i--) {
            System.out.println("Nome na posição " + (i + 1) + ": " + listaNomes.get(i));
        }
    }




}
