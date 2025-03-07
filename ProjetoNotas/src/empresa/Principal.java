package empresa;

public class Principal {
    public static void main(String[] args) {

        Nota mario = new Nota();

        Nota luigi = new Nota(90, 80, 60);

        System.out.println("Média Luigi");
        luigi.resultado();
        System.out.println();

        mario.setNota1(9);
        mario.setNota2(10);
        mario.setFaltas(5);

        mario.resultado();

        mario.setFaltas(10);
        mario.setNota1(2);

        mario.resultado();

    }
}
