package empresa;

public class Nota {

    private double nota1;
    private double nota2;
    private int faltas;

    public Nota() {

    }

    public Nota (double nota1, double nota2, int faltas) {
        setNota1(nota1);
        setNota2(nota2);
        setFaltas(faltas);
    }

    public void setFaltas(int faltas) {
        if (faltas < 0 || faltas > 40) {
            throw new IllegalArgumentException("Faltas deve estar entre 0 e 40");
        }
        this.faltas = faltas;
    }
    public int getFaltas() {
        return faltas;
    }

    public void setNota1(double nota) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("Nota deve estar entre 0 e 10");
        }
        nota1 = nota;
    }

    public void setNota2(double nota) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("Nota deve estar entre 0 e 10");
        }
        nota2 = nota;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    void resultado() {

        double media = (nota1 + nota2) / 2;

        System.out.println("Media: " + media);

        if (faltas > 7) {
            System.out.println("Reprovado por faltas");
        }

        else if (media <4) {
            System.out.println("Reprovado");

        }
        else if (media <7) {
            System.out.println("Exame final");
        }
        else {
            System.out.println("Aprovado");
        }
    }


}
