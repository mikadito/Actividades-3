import java.util.Scanner;
public class Main {

    // ---------- ENTRADA Y VALIDACIÓN DE DATOS ----------
    public static double solicitarCantidad(Scanner teclado) {
        System.out.print("Cantidad que desea retirar: ");
        return teclado.nextDouble();
    }

    public static void validarCantidad(double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException(
                "La cantidad debe ser mayor que cero.");
        }
    }

    // ---------- CÁLCULO ----------
    public static double retirarDinero(double saldo, double cantidad)
            throws SaldoInsuficienteException {

        if (cantidad > saldo) {
            throw new SaldoInsuficienteException(
                "Saldo insuficiente para realizar la operación.");   
        }
        return saldo - cantidad;
    }

    // ---------- PRESENTACIÓN DE RESULTADOS ----------
    public static void mostrarCuenta(String titular, double saldo) {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo inicial: " + saldo + " euros");
    }

    public static void mostrarError(String mensaje) {
        System.out.println("Error: " + mensaje);
    }

    public static void mostrarSaldoActualizado(double saldo) {
        System.out.println("Saldo actual: " + saldo + " euros");
    }

    // ---------- MAIN ----------
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String titular = "Micaela Cordova";
        double saldo = 500.0;

        mostrarCuenta(titular, saldo);

        try {
            double cantidad = solicitarCantidad(teclado);
            validarCantidad(cantidad);
            saldo = retirarDinero(saldo, cantidad);
            System.out.println("Retiro realizado correctamente.");
        } catch (SaldoInsuficienteException e) {
            mostrarError(e.getMessage());
        } catch (IllegalArgumentException e) {
            mostrarError(e.getMessage());
        } catch (java.util.InputMismatchException e) {
            mostrarError("Debes introducir un número válido.");
        }

        mostrarSaldoActualizado(saldo);
        teclado.close();
    }
}