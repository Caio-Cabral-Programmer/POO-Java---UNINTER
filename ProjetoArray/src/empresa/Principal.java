package empresa;

public class Principal {

    public static int[] instanciaArray(int n) {

        return new int[n];
    }
    public static void main(String[] args) {
        int tam = -10;
        int arr[] = null;

        try {
            int conta = 10/0;
            arr = instanciaArray(tam);
        } catch (NegativeArraySizeException e) {
            System.out.println("Erro ao instanciar array: ");
            System.out.println(e);
        }
        catch (ArithmeticException e) {
            System.out.println("Erro ao dividir por zero: ");
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println("Erro genérico: ");
            System.out.println(e);
        }

        for (int i = 0; i < tam; i++) {
            System.out.println(arr[i]);
        }
    }

}
