import java.util.Scanner;

public class DivisionDosNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int dividendo = teclado.nextInt();

        System.out.print("Introduce el segundo número: ");
        int divisor = teclado.nextInt();

        try {
            int resultado = dividendo / divisor;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println();
            System.out.println("Error: No se puede dividir entre cero.");
        }

        System.out.println("El programa continúa su ejecución.");
        teclado.close();
    }
}