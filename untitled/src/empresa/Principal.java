package empresa;

import java.util.ArrayList;
import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.matricula = 12345;
        aluno1.nome = "João";
        aluno1.cpf = "123.456.789-00";

        Aluno aluno2 = new Aluno();
        aluno2.matricula = 1002;
        aluno2.nome = "Yoshi";
        aluno2.cpf = "987.654.321-00";

        Aluno aluno3 = new Aluno(11111, "Carlos", "987.654.321-00");

        Aluno aluno4 = new Aluno(22222);

        ArrayList <Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);
        alunos.add(new Aluno(1004, "Ana", "987.654.321-00"));

        aluno1.info();

        aluno1.nome = "Maria";

        aluno1.info();

        aluno2.info();

        aluno3.info();

        aluno4.info();

        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println();
        // méto do static

        Carro carro1 = new Carro();

        System.out.println(Carro.milhasParaMetros(10));

        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println();
        // Feito com baseado em um diagrama de classes
        Turma novaTurma = new Turma();
        novaTurma.nome = "Turma A";
        Professor professor1 = new Professor();
        professor1.nome = "Professor Leonardo";
        professor1.formacao = "Mestrado em Engenharia de Software";
        novaTurma.alunos = new ArrayList();
        novaTurma.alunos.add(new Aluno());
        novaTurma.alunos.get(0).nome = "Carlos";





    }
}

