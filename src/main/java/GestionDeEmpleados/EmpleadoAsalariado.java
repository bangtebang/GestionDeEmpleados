package GestionDeEmpleados;

public class EmpleadoAsalariado extends Empleado {

	public EmpleadoAsalariado(String nombre, int salarioBase) {
		super(nombre, salarioBase);
	}

	public int calcularSalario() {

		return getSalarioBase();
	}
}