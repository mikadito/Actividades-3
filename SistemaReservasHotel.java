import java.util.Scanner;

public class SistemaReservasHotel {
    //Metodo estatico para validar datos de reserva
    public static void validarReserva(String nombre, int habitacion, int noches, double precioNoche)
    throws IllegalArgumentException {

        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del cliente no puede estar vacío.");
        }
        if (habitacion <= 0) {
            throw new IllegalArgumentException("El número de habitación debe ser mayor que cero.");
        }
        if (noches <= 0) {
            throw new IllegalArgumentException("El número de noches debe ser mayor que cero.");
        }
        if (precioNoche <= 0) {
            throw new IllegalArgumentException("El precio por noche debe ser mayor que cero.");
        }
       
        }

        //Metodo estatico para calcular el importe total de la estancia

        public static double calcularPrecio(int noches, double precioNoche) {
            return noches * precioNoche;
        }
        
        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);

            System.out.println("-----Sistema de Reservas de Hotel-----");
            
            System.out.print("Ingrese el nombre del cliente: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese el número de habitación: ");
            int habitacion = sc.nextInt();

            System.out.print("Ingrese el número de noches: ");
            int noches = sc.nextInt();

            System.out.print("Ingrese el precio por noche: ");
            double precioNoche = sc.nextDouble();

            try {

                //Llamada al metodo de validacion dentro del try-catch

                validarReserva(nombre, habitacion, noches, precioNoche);

                //Si no se lanza excepcion, la reserva es correcta

                double precioTotal = calcularPrecio(noches, precioNoche);

                System.out.println("RESERVA REALIZADA CON ÉXITO");
                System.out.println();
                
                System.out.println("Cliente: " + nombre);

                System.out.println("Habitación: " + habitacion);

                System.out.println("Numero Noches: " + noches);

                System.out.println("Precio por noche: " + precioNoche + "€");

                System.out.println("Precio total: " + precioTotal + "€");

            } catch (IllegalArgumentException e) {
                //Captura de la excepcion y muestra el mensaje de error
                System.out.println("Error: " + e.getMessage());
            }
                                                                                                                 
            sc.close();

        }
    }
