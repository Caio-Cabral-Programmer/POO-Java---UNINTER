package uninter;

import java.util.Scanner;

public class Menu {
    private Scanner teclado;
    private Cofrinho cofrinho;

    public Menu() {
        teclado = new Scanner(System.in);
        cofrinho = new Cofrinho();
    }

    public void exibirMenu() {
        System.out.println("COFRINHO:");
        System.out.println("1 - Adicionar moeda");
        System.out.println("2 - Remover moeda");
        System.out.println("3 - Listar moedas");
        System.out.println("4 - Calcular valor total convertido para Real");
        System.out.println("0 - Encerrar");
        System.out.print("Digite a opção desejada: ");
    }

    public void executar() {
        int opcao;

        do {
            exibirMenu();
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    adicionarMoeda();
                    break;
                case 2:
                    removerMoeda();
                    break;
                case 3:
                    listarMoedas();
                    break;
                case 4:
                    calcularTotal();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println();
        } while (opcao != 0);

        teclado.close();
    }

    private void adicionarMoeda() {
        System.out.println("Escolha o tipo de moeda:");
        System.out.println("1 - Real");
        System.out.println("2 - Dólar");
        System.out.println("3 - Euro");

        int escolhaMoeda = teclado.nextInt();
        System.out.print("Digite o valor: ");
        double valorDigitado = teclado.nextDouble();

        Moeda moeda = null;

        switch (escolhaMoeda) {
            case 1:
                moeda = new Real(valorDigitado);
                break;
            case 2:
                moeda = new Dolar(valorDigitado);
                break;
            case 3:
                moeda = new Euro(valorDigitado);
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        cofrinho.adicionar(moeda);
        System.out.println("Moeda adicionada com sucesso!");
    }

    private void removerMoeda() {
        System.out.println("Escolha o tipo de moeda para remover:");
        System.out.println("1 - Real");
        System.out.println("2 - Dolar");
        System.out.println("3 - Euro");

        int opcaoMoeda = teclado.nextInt();
        System.out.print("Digite o valor: ");
        double valor = teclado.nextDouble();

        Moeda moeda = null;

        switch (opcaoMoeda) {
            case 1:
                moeda = new Real(valor);
                break;
            case 2:
                moeda = new Dolar(valor);
                break;
            case 3:
                moeda = new Euro(valor);
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        boolean removido = cofrinho.remover(moeda);
        if (removido) {
            System.out.println("Moeda removida com sucesso!");
        } else {
            System.out.println("Moeda não encontrada!");
        }
    }

    private void listarMoedas() {
        cofrinho.listagemMoedas();
    }

    private void calcularTotal() {
        double total = cofrinho.totalConvertido();
        System.out.printf("Valor total em Reais: R$ %.2f\n", total);
    }
}