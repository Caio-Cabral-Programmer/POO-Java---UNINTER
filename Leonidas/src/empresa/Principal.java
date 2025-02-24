package empresa;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int palpite;
        int valorCorreto = 10000;
        System.out.println("Digite seu palpite: ");
        palpite = teclado.nextInt();
        String msg;

        while (palpite != valorCorreto) {
            msg = palpite < valorCorreto ? "Seu palpite é muito baixo!" : "Seu palpite é muito alto!";
            System.out.println(msg);
            System.out.println("Digite seu palpite: ");
            palpite = teclado.nextInt();
        }
        System.out.println("Parabéns! Você acertou o valor correto: " + valorCorreto);
    }
}
