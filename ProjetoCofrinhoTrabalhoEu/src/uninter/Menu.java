package uninter;

import java.util.Scanner;

public class Menu {

    // Atributos
    private Scanner teclado;
    private Cofrinho cofrinho;

    //Variáveis
    int opcao;
    int moedaEscolhida;
    double valorEscolhido;
    double totalEmReal;

    public Menu () {
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
        do {
            exibirMenu();
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    // Acionar o method de adicionar moeda
                    adicionarMoeda();
                    break;
                case 2:
                    // Acionar o method de Remover moeda
                    removerMoeda();
                    break;
                case 3:
                    // Acionar o method de Listar moedas
                    listarMoedas();
                    break;
                case 4:
                    // Acionar o method de Calcular valor total convertido para Real
                    calcularValorTotalConvertidoParaReal();
                    break;
                case 0:
                    // Encerrar o programa com uma mensagem de saída.
                    System.out.println("Programa Encerrado");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        teclado.close();
    }

        private void adicionarMoeda() {
            System.out.println("Escolha a moeda que você deseja adicionar: ");
            System.out.println("1 - Real");
            System.out.println("2 - Dólar");
            System.out.println("3 - Euro");
            System.out.print("Digite aqui: ");
            moedaEscolhida = teclado.nextInt();
            System.out.println();
            System.out.print("Digite o valor: ");
            valorEscolhido = teclado.nextDouble();
            System.out.println();

            Moeda moeda = null;

            switch (moedaEscolhida) {
                case 1:
                    // Criar uma moeda da classe Moeda e da subclasse Real com o valor escolhido.
                    moeda = new Real(valorEscolhido);
                    break;
                case 2:
                    // Criar uma moeda da classe Moeda e da subclasse Dolar com o valor escolhido.
                    moeda = new Dolar(valorEscolhido);
                    break;
                case 3:
                    // Criar uma moeda da classe Moeda e da subclasse Euro com o valor escolhido.
                    moeda = new Euro(valorEscolhido);
                    break;
                default:
                    System.out.println("Moeda inválida. Tente novamente.");
                    return;
            }

            cofrinho.adicionarMoeda(moeda);
            System.out.println("Moeda adicionada com sucesso!");
            System.out.println();


        }

        public void removerMoeda() {
            System.out.println("Escolha a moeda que você deseja remover: ");
            System.out.println("1 - Real");
            System.out.println("2 - Dolar");
            System.out.println("3 - Euro");
            System.out.print("Digite aqui: ");
            moedaEscolhida = teclado.nextInt();
            System.out.print("Digite o valor: ");
            valorEscolhido = teclado.nextDouble();
            System.out.println();

            Moeda moeda = null;

            switch (moedaEscolhida) {
                case 1:
                    // Criar uma moeda da classe Moeda e da subclasse Real com o valor escolhido.
                    moeda = new Real(valorEscolhido);
                    break;
                case 2:
                    // Criar uma moeda da classe Moeda e da subclasse Dolar com o valor escolhido.
                    moeda = new Dolar(valorEscolhido);
                    break;
                case 3:
                    // Criar uma moeda da classe Moeda e da subclasse Euro com o valor escolhido.
                    moeda = new Euro(valorEscolhido);
                    break;
                default:
                    System.out.println("Moeda inválida. Tente novamente.");
                    return;
            }

            boolean removido = cofrinho.removerMoeda(moeda);
            if (removido) {
                System.out.println("Moeda removida com sucesso!");
                System.out.println();
            } else {
                System.out.println("Moeda não encontrada!");
                System.out.println();
            }
        }

        public void listarMoedas() {
            cofrinho.listagemMoedas();
            System.out.println();
        }

        public void calcularValorTotalConvertidoParaReal() {
            totalEmReal = cofrinho.totalConvertido();
            System.out.println("Valor total convertido para Real: R$ " + totalEmReal);
            System.out.println();
        }






}
