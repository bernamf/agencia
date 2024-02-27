package vista;

import java.util.ArrayList;

import modelo.Clientes;
import modelo.Habitaciones;

public class Visor {
    public static void visualizarClientesPantalla(ArrayList<Clientes> clientes) {
        System.out.println("Lista de Clientes:");
        System.out.printf("%-15s%-20s%-20s%-30s%-15s\n", "DNI", "Nombre", "Apellido", "Dirección", "Localidad");
        System.out.println("------------------------------------------------------------------------------------------------------------");
        for (Clientes cliente : clientes) {
            System.out.printf("%-15s%-20s%-20s%-30s%-15s\n", cliente.getDni(), cliente.getNombre(), cliente.getApellido(), cliente.getDireccion(), cliente.getLocalidad());
        }
    }
    
    
    
    public static void visualizarHabitacionesPantalla(ArrayList<Habitaciones> habitacioneses) {
        System.out.println("Lista de Clientes:");
        System.out.printf("%-15s%-20s%-20s%-30s%-25s\n", "Id", "Id_hotel", "Numero", "Descripcion", "Precio");
        System.out.println("------------------------------------------------------------------------------------------------------------");
        for (Habitaciones habitacion : habitacioneses) {
            System.out.printf("%-15s%-20s%-20s%-30s%-15s\n", habitacion.getId(), habitacion.getId_hotel(), habitacion.getNumero(), habitacion.getDescripcion(), habitacion.getPrecio());
        }
    }
}
