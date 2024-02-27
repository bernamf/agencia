package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GestorBBDD extends Conectar {

    public static void registrarCliente(Clientes cliente) {

        String sql = "INSERT INTO clientes (dni, nombre, apellidos, direccion, localidad) VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement stmt = cn.prepareStatement(sql);

            stmt.setString(1, cliente.getDni());
            stmt.setString(2, cliente.getNombre());
            stmt.setString(3, cliente.getApellido());
            stmt.setString(4, cliente.getDireccion());
            stmt.setString(5, cliente.getLocalidad());
            stmt.executeUpdate();
            System.out.println("Cliente insertado correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al insertar el cliente en la base de datos.");
            e.printStackTrace();
        }

    }
    
    public static ArrayList<Clientes> obtenerClientes() {
    	
        ArrayList<Clientes> clientes = new ArrayList<>();

        String sql = "SELECT dni, nombre, apellidos, direccion, localidad FROM clientes";

        try {
            PreparedStatement stmt = cn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String dni = rs.getString("dni");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellidos");
                String direccion = rs.getString("direccion");
                String localidad = rs.getString("localidad");

                Clientes cliente = new Clientes(dni, nombre, apellido, direccion, localidad);
                clientes.add(cliente);
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener clientes de la base de datos.");
            e.printStackTrace();
        }

        return clientes;
    }
    
    
    public static ArrayList<Habitaciones> obtenerHabitacionesPorHotel(int idHotel) {
        ArrayList<Habitaciones> habitaciones = new ArrayList<>();
        String sql = "SELECT * FROM habitaciones WHERE id_hotel = ?";

        try (Connection conn = cn;
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idHotel);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int idHabitacion = rs.getInt("id");
                int id_hotel = rs.getInt("id_hotel");
                String numero = rs.getString("numero");
                String descripcion = rs.getString("descripcion");
                double precio = rs.getDouble("precio");
                
                Habitaciones habitacion = new Habitaciones(idHabitacion, id_hotel, numero, descripcion, precio);
                habitaciones.add(habitacion);
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener las habitaciones del hotel desde la base de datos.");
            e.printStackTrace();
        }

        return habitaciones;
    }
}
