import java.util.Scanner;
public class ComprobarEdad {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = teclado.nextInt();

        try {
            comprobarEdad(edad);
        } catch (IllegalArgumentException e) {
            System.out.println();
            System.out.println("Error: " + e.getMessage());
        }

        teclado.close();
    }

    public static void comprobarEdad(int edad) {
        if (edad < 18) {
            throw new IllegalArgumentException("Acceso denegado, la edad debe ser igual o superior a 18 años.");
        }
        System.out.println("Acceso permitido.");
    }
}