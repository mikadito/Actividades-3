import java.util.InputMismatchException;
import java.util.Scanner;

public class GestionNotas {

    // Valida la nota y la muestra por pantalla si es correcta
    public static void validarNota(double nota) throws IllegalArgumentException {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("La nota debe estar comprendida entre 0 y 10.");
        }
        System.out.println("Nota introducida correctamente: " + nota);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean notaValida = false;

        while (!notaValida) {
            try {
                System.out.print("Introduce una nota: ");
                double nota = sc.nextDouble();

                validarNota(nota);   // lanza excepción si es incorrecta
                notaValida = true;   // solo se alcanza si no hubo error

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println();
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un valor numérico.");
                System.out.println();
                sc.nextLine(); // limpia el buffer de entrada
            }
        }

        sc.close();
    }
}