package vista;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import modelo.Clientes;
import modelo.Habitaciones;
import modelo.Reservas;

public class Menu {
   
	public static final int SALIR = 0;
	public static final int REGISTRAR_CLIENTE = 1;
	public static final int REALIZAR_RESERVA = 2;
	public static final int MOSTRAR_CLIENTES = 3;
	public static final int MOSTRAR_LAS_HABITACIONES = 4;
	public static final int MODIFICAR_HABITACION = 5;
	public static final int VER_RESERVAS_DEL_HOTEL = 6;

    public static void mostrarMenuPrincipal() {
        System.out.println("Bienvenido a la Agencia de Viajes");
        System.out.println(REGISTRAR_CLIENTE+". Registrar Cliente");
        System.out.println(REALIZAR_RESERVA+". Realizar Reserva");
        System.out.println(MOSTRAR_CLIENTES+". mostrar clientes");
        System.out.println(MOSTRAR_LAS_HABITACIONES+". mostrar las habitaciones de un hotel");
        System.out.println(MODIFICAR_HABITACION +". modificar una habitacion introduciendo su id");
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
    public static Reservas registrarReserva(Scanner scanner) throws ParseException {
        System.out.println("Ingrese los datos de la reserva:");
        System.out.println("ID Habitación: ");
        int idHabitacion = Integer.parseInt(scanner.nextLine());
        System.out.println("DNI: ");
        String dni = scanner.nextLine();
        System.out.println("Fecha de inicio (formato dd-MM-yyyy): ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date dateInicio = sdf.parse(scanner.nextLine());
        System.out.println("Fecha de fin (formatodd-MM-yyyy): ");
       
        Date datefIN= sdf.parse(scanner.nextLine());
        
     
        Reservas reserva = new Reservas( idHabitacion, dni, dateInicio, datefIN);
		return reserva;
    }
    
    public static int preguntaIdHotel(Scanner scanner) {
    	
    	System.out.println("introduce el id del hotel que quieres visualizar");
    	int idHotel = Integer.parseInt(scanner.nextLine());
    	return idHotel;
    	
    }
    
    public static int preguntarIdHabitacion(Scanner scanner) {
    	System.out.println("dime el id de la habitacion que quieres modificar");
    	int idHabitacion = Integer.parseInt(scanner.nextLine());
    	return idHabitacion;
    }
    
    public static Habitaciones pedirDatosNuevaHabitacion(int idHabitacion) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los nuevos datos de la habitación:");
        System.out.print("ID del hotel: ");
        int idHotel = Integer.parseInt(scanner.nextLine());
        System.out.print("Número de habitación: ");
        String numero = scanner.nextLine();
        System.out.print("Descripción: ");
        String descripcion = scanner.nextLine();
        System.out.print("Precio: ");
        double precio = Double.parseDouble(scanner.nextLine());
        
        // Crear y retornar un objeto Habitaciones con los datos ingresados
        return new Habitaciones(idHabitacion,idHotel, numero, descripcion, precio);
    }
   
}
