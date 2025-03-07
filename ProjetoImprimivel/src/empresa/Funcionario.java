package empresa;

public class Funcionario implements Imprimivel {

    String nome;
    String cpf;

    public Funcionario (String nome, String cpf) {
        super();
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public void imprimir() {
        System.out.println("Funcionário");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("------------------");
    }
}
