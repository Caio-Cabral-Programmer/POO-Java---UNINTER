package empresa;

public class Horario {

    private int hora;
    private int minuto;
    private int segundo;

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora < 0 || hora > 23) {
            throw new IllegalArgumentException("Hora deve estar entre 0 e 23");
        }
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public void imprimir() {
        System.out.println("Hora: " + hora + ":" + minuto + ":" + segundo);
    }



}
