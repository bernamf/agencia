package main;

import java.util.ArrayList;
import java.util.Scanner;


import modelo.Clientes;
import modelo.GestorBBDD;
import vista.Menu;
import vista.Visor;

public class Main {

	public static void main(String[] args) {

		run();
		
	}
	
	public static void run() {
		
		GestorBBDD gestorBBDD = new GestorBBDD();
		
		Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            Menu.mostrarMenuPrincipal();
            opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 1:
                    Clientes cliente = Menu.registrarCliente(scanner);
                    gestorBBDD.conectar();
                    gestorBBDD.registrarCliente(cliente);
                    gestorBBDD.cerrar();
                    break;
                case 2:
                    Menu.realizarReserva();
                    break;
                case 3:
                    System.out.println("esta es la lista de todos los clientes:");
                    gestorBBDD.conectar();
                    ArrayList clientes = gestorBBDD.obtenerClientes();
                    Visor.visualizarClientesPantalla(clientes);
                    gestorBBDD.cerrar();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 3);
	}
	
	
	
	

}
