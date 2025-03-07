package empresa;

public class Principal {

    public static void main(String[] args) {
        Horario aula = new Horario();

        aula.getHora();
        aula.setHora(14);
        aula.getMinuto();
        aula.setMinuto(30);
        aula.getSegundo();
        aula.setSegundo(45);
        aula.imprimir();


    }
}
