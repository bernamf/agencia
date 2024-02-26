package vista;

import java.util.Scanner;

import modelo.Clientes;

public class Menu {
   

    public static void mostrarMenuPrincipal() {
        System.out.println("Bienvenido a la Agencia de Viajes");
        System.out.println("1. Registrar Cliente");
        System.out.println("2. Realizar Reserva");
        System.out.println("3. mostrar clientes");
        System.out.println("4. Salir");
        System.out.println("Seleccione una opción:");
    }

    public static Clientes registrarCliente(Scanner scanner) {
        System.out.println("Ingrese los datos del nuevo cliente:");
        System.out.print("DNI: ");
        String dni = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Localidad: ");
        String localidad = scanner.nextLine();
        
        Clientes cliente = new Clientes(dni, nombre, apellido, direccion, localidad);
		return cliente;
        
 
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
