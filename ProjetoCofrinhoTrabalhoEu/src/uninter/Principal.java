package uninter;

import java.awt.*;

public class Principal {
    // Method principal do projeto, onde se inicia o programa.
    // É criada uma variável menu do tipo Menu, na qual contém o objeto da Classe Menu.
    // Depois é chamado o method executar da classe Menu, que inicia o menu principal do programa.
    public static void main(String[] args) {
        System.out.println("================================================");
        System.out.println("TRABALHO COFRINHO || CAIO FELLIPE BEZERRA CABRAL");
        System.out.println("================================================");
        Menu menu = new Menu();
        menu.executar();
    }
}
