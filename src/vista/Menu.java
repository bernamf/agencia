package vista;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            mostrarMenuPrincipal();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    registrarCliente();
                    break;
                case 2:
                    realizarReserva();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 3);
    }

    public static void mostrarMenuPrincipal() {
        System.out.println("Bienvenido a la Agencia de Viajes");
        System.out.println("1. Registrar Cliente");
        System.out.println("2. Realizar Reserva");
        System.out.println("3. Salir");
        System.out.println("Seleccione una opción:");
    }

    public static void registrarCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los datos del nuevo cliente:");
        System.out.print("DNI: ");
        String dni = scanner.nextLine();
        // Aquí se pedirían y leerían los demás datos del cliente
        // Luego se llamaría al método correspondiente para guardar el cliente en la base de datos
        // GestorBD.insertarCliente(dni, nombre, apellido, direccion, localidad);
        System.out.println("Cliente registrado exitosamente.");
    }

    public static void realizarReserva() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los datos de la reserva:");
        // Aquí se pedirían y leerían los datos necesarios para la reserva
        // Luego se llamaría al método correspondiente para guardar la reserva en la base de datos
        // GestorBD.insertarReserva(cliente, hotel, fechaEntrada, fechaSalida, tipoHabitacion);
        System.out.println("Reserva realizada exitosamente.");
    }
}
