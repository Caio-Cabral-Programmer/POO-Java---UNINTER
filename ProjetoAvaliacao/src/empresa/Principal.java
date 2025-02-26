package empresa;

public class Principal {
    public static void main(String[] args) {

        Avaliacao luigi = new Avaliacao();
        Avaliacao mario = new Avaliacao(7,4,10);
        luigi.nota1 = 8;
        luigi.nota2 = 3;
        luigi.nota3 = 7.5;

        System.out.println("Média Aritmética do Mario " + mario.mediaAritmetica());
        System.out.println("Média Ponderada do Mario " + mario.mediaPonderada());

        System.out.println("Média Aritmética do Luigi " + luigi.mediaAritmetica());
        System.out.println("Média Ponderada do Luigi " + luigi.mediaPonderada());
    }
}
