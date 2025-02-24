package empresa;

import java.util.Scanner;

// Programa para calcular o IMC
public class Principal {
    public static void main(String[] args) {
        int peso;
        double altura;

        System.out.println("Digite o peso seguido da altura: ");
        Scanner teclado = new Scanner(System.in);
        peso = teclado.nextInt();
        altura = teclado.nextDouble();
        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);
        System.out.printf("IMC: %.2f\n", imc);
        teclado.close();
    }

}
