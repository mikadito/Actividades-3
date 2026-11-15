import java.util.InputMismatchException;
import java.util.Scanner;

public class PedirEdad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");

        try {
            int edad = teclado.nextInt();
            System.out.println("Tu edad es: " + edad);
        } catch (InputMismatchException e) {
            System.out.println();
            System.out.println("Error: Debes introducir un número entero.");
        }

        teclado.close();
    }
}