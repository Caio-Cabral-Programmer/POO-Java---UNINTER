package empresa;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", 111,0.1, new Curso("Engenharia", 1000));

        aluno1.info();

    }
}
