package GestionDeEmpleados;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    ArrayList<Empleado> empleados = new ArrayList<>();

    EmpleadoAsalariado empleado1 = new EmpleadoAsalariado("Juan", 3000);
    EmpleadoPorHoras empleado2 = new EmpleadoPorHoras("Maria", 15,40);
    EmpleadoPorHoras empleado3 = new EmpleadoPorHoras("Pedro", 20,35);

    empleados.add(empleado1);
    empleados.add(empleado2);
    empleados.add(empleado3);
    GestorDeDatos.guardarEmpleadosEnArchivo("empleados.csv", empleados);
        ArrayList<Empleado> empleadosLeidos = GestorDeDatos.leerEmpleadosDesdeArchivo("empleados.csv");
        if (empleadosLeidos != null) {
            for (Empleado empleado : empleadosLeidos) {
                System.out.println("Nombre: " + empleado.getNombre());
                System.out.println("Salario: " + empleado.calcularSalario());
                System.out.println("------------------------");}}
    }
}