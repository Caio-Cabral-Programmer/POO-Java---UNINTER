package empresa;

public class Aluno {
    int matricula;
    String nome;
    String cpf;

    public Aluno (int matricula) {
        this.matricula = matricula;
        this.nome = "Vazio";
        this.cpf = "000.000.000-00";
    }

    Aluno (){ // default constructor necessário para o métod construtor com parâmetros funcionar sem dar erros, caso queira atribuir valores para os atributos tradicionalmente.
        System.out.println("Aluno criado sem parâmetros.");
    }

    Aluno(int matricula, String nome, String cpf) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
    }

    void info (){
        System.out.println();
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Aluno criado com sucesso!");
    }
}
