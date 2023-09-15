package GestionDeEmpleados;
import java.io.*;
import java.util.ArrayList;

public class GestorDeDatos {
    public static void guardarEmpleadosEnArchivo(String archivo, ArrayList<Empleado> empleados) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(archivo))) {
            for (Empleado empleado : empleados) {
                if (empleado instanceof EmpleadoAsalariado) {
                    writer.println("EmpleadoAsalariado," + empleado.getNombre() + "," + empleado.getSalarioBase());
                } else if (empleado instanceof EmpleadoPorHoras) {
                    EmpleadoPorHoras empleadoPorHoras = (EmpleadoPorHoras) empleado;
                    writer.println("EmpleadoPorHoras," + empleadoPorHoras.getNombre() + "," + empleadoPorHoras.getSalarioPorHoras() + "," + empleadoPorHoras.getHorasTrabajadas());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static ArrayList<Empleado> leerEmpleadosDesdeArchivo(String archivo) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length >= 3) {
                    String tipoEmpleado = partes[0];
                    String nombre = partes[1];
                    int salarioBase = Integer.parseInt(partes[2]);

                    Empleado empleado = null;

                    if (tipoEmpleado.equals("EmpleadoAsalariado")) {
                        empleado = new EmpleadoAsalariado(nombre, salarioBase);
                    } else if (tipoEmpleado.equals("EmpleadoPorHoras") && partes.length == 4) {
                        int salarioPorHora = Integer.parseInt(partes[2]);
                        int horasTrabajadas = Integer.parseInt(partes[3]);
                        empleado = new EmpleadoPorHoras(nombre, salarioPorHora, horasTrabajadas);
                    }
                    if (empleado != null) {
                        empleados.add(empleado);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return empleados;
    }
}
