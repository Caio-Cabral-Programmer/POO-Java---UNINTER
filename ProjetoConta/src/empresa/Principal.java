package empresa;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Conta c1 = new Conta("Mario", 5000);
        Conta c2 = new Conta("Luigi", 2000);


    try {

        c1.info();
        c1.depositar(300);
        c1.info();
        c1.sacar(80000);
        c1.info();

    }
    catch (Exception e) {
        System.out.println("Ocorreu um erro, coloque outro valor.");
        System.out.println(e.getMessage());
    }
    finally {
        c1.info();
        c2.info();
        System.out.println("Programa finalizado.");
    }

//    c1.transferir(1000, c2);
//    c1.info();
//    c2.info();
//    System.out.println("Programa finalizado.");

        System.out.println("Digite um valor para transferir c1 → c2:");
        double valorTransferir = teclado.nextDouble();
        boolean sucessoLeitura = false;
        while (!sucessoLeitura) {

            try {

                c1.transferir(valorTransferir, c2);
                c1.info();
                c2.info();
                System.out.println("Programa finalizado.");
                sucessoLeitura = true;
            }
            catch (Exception e) {
                System.out.println("Ocorreu um erro, coloque outro valor.");
                System.out.println(e.getMessage());

                System.out.println("Digite um valor para transferir c1 → c2:");
                valorTransferir = teclado.nextDouble();
            }

        }





    }
}
