import java.util.Scanner;
public class CalculoRaiz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        double numero = teclado.nextDouble();

        try {
            double resultado = calcularRaiz(numero);
            System.out.println();
            System.out.println("La raíz cuadrada es: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println();
            System.out.println("Error: " + e.getMessage());
        }

        teclado.close();
    }

    public static double calcularRaiz(double numero) throws IllegalArgumentException {
        if (numero < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return Math.sqrt(numero);
    }
}