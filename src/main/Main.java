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
                case Menu.REGISTRAR_CLIENTE:
                    Clientes cliente = Menu.registrarCliente(scanner);
                    gestorBBDD.conectar();
                    gestorBBDD.registrarCliente(cliente);
                    gestorBBDD.cerrar();
                    break;
                case Menu.REALIZAR_RESERVA:
                    Menu.realizarReserva();
                    break;
                case Menu.MOSTRAR_CLIENTES:
                    System.out.println("esta es la lista de todos los clientes:");
                    gestorBBDD.conectar();
                    ArrayList clientes = gestorBBDD.obtenerClientes();
                    Visor.visualizarClientesPantalla(clientes);
                    gestorBBDD.cerrar();
                    break;
                case Menu.MOSTRAR_LAS_HABITACIONES:
                	int idHotel = Menu.preguntaIdHotel(scanner);
                    gestorBBDD.conectar();
                    ArrayList habitaciones = gestorBBDD.obtenerHabitacionesPorHotel(idHotel);
                    Visor.visualizarHabitacionesPantalla(habitaciones);
                    gestorBBDD.cerrar();
                    break;
                case Menu.SALIR:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 3);
	}
	
	
	
	

}
