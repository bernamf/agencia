package vista;

import java.util.Scanner;

import modelo.Clientes;
import modelo.Reservas;

public class Menu {
   
	public static final int SALIR = 0;
	public static final int REGISTRAR_CLIENTE = 1;
	public static final int REALIZAR_RESERVA = 2;
	public static final int MOSTRAR_CLIENTES = 3;
	public static final int MOSTRAR_LAS_HABITACIONES = 4;

    public static void mostrarMenuPrincipal() {
        System.out.println("Bienvenido a la Agencia de Viajes");
        System.out.println(REGISTRAR_CLIENTE+". Registrar Cliente");
        System.out.println(REALIZAR_RESERVA+". Realizar Reserva");
        System.out.println(MOSTRAR_CLIENTES+". mostrar clientes");
        System.out.println(MOSTRAR_LAS_HABITACIONES+". mostrar las habitaciones de un hotel");
        System.out.println(SALIR +". Salir");
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
    public static Reservas registrarReserva(Scanner scanner) {
        System.out.println("Ingrese los datos de la reserva:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        System.out.print("ID Habitación: ");
        int idHabitacion = scanner.nextInt();
        System.out.print("DNI: ");
        String dni = scanner.next();
        System.out.print("Fecha de inicio (formato yyyy-MM-dd): ");
        String desde = scanner.next();
        System.out.print("Fecha de fin (formato yyyy-MM-dd): ");
        String hasta = scanner.next();
        
     
        Reservas reserva = new Reservas(id, idHabitacion, dni, desde, hasta);
		return reserva;
    }
    
    public static int preguntaIdHotel(Scanner scanner) {
    	
    	System.out.println("introduce el id del hotel que quieres visualizar");
    	int idHotel = Integer.parseInt(scanner.nextLine());
    	return idHotel;
    	
    }
    
    
   
}
