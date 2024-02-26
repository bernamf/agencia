package vista;

import java.util.ArrayList;

import modelo.Clientes;

public class Visor {
    public static void visualizarClientesPantalla(ArrayList<Clientes> clientes) {
        System.out.println("Lista de Clientes:");
        System.out.printf("%-15s%-20s%-20s%-30s%-15s\n", "DNI", "Nombre", "Apellido", "Dirección", "Localidad");
        System.out.println("------------------------------------------------------------------------------------------------------------");
        for (Clientes cliente : clientes) {
            System.out.printf("%-15s%-20s%-20s%-30s%-15s\n", cliente.getDni(), cliente.getNombre(), cliente.getApellido(), cliente.getDireccion(), cliente.getLocalidad());
        }
    }
}
