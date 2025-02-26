package empresa;

public class Principal {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Mario", "Encanador", new Avaliacao(9,10,3));
        Aluno a2 = new Aluno("João", "Programador", new Avaliacao(8,9,4));


        a1.info();
        a2.info();
    }
}
