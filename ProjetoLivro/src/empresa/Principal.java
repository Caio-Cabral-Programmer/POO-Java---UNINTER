package empresa;

public class Principal {
    public static void main(String[] args) {
        LivroDigital ld = new LivroDigital("O Senhor dos Anéis", new Autor("J.R.R. Tolkien", "Inglaterra", "jrr.tolkien@example.com"), "Fantasia", 1, 1000, 15.99);

        ld.info();
    }
}
