package GestionDeEmpleados;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    // Crear una lista de empleados
    ArrayList<Empleado> empleados = new ArrayList<>();

    // Crear instancias de EmpleadoAsalariado y EmpleadoPorHoras, y agregarlas a la lista
    EmpleadoAsalariado empleado1 = new EmpleadoAsalariado("Juan", 3000);
    EmpleadoPorHoras empleado2 = new EmpleadoPorHoras("Maria", 15,40);
    EmpleadoPorHoras empleado3 = new EmpleadoPorHoras("Pedro", 20,35);

    empleados.add(empleado1);
    empleados.add(empleado2);
    empleados.add(empleado3);

    // Calcular y mostrar los salarios de los empleados
    System.out.println("Salarios de los empleados:");
    for (Empleado empleado : empleados) {
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Salario: $" + empleado.calcularSalario());
        System.out.println();
    }
}
}