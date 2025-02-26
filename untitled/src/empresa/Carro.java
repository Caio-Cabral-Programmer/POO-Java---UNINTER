package empresa;

public class Carro {
    String nome;
    String modelo;
    float velocidadeMaxima;
    static final double PI = 3.14159;
    static float milhasParaMetros (float milhas){
        return (float) (milhas * 1.60934);
    }
}
