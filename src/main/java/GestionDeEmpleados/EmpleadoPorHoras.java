package GestionDeEmpleados;

public class EmpleadoPorHoras extends Empleado {
	private int horasTrabajadas;
	private int salarioPorHoras;

	public int getHorasTrabajadas() {
		return this.horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public int getSalarioPorHoras() {
		return this.salarioPorHoras;
	}

	public void setSalarioPorHoras(int salarioPorHoras) {
		this.salarioPorHoras = salarioPorHoras;
	}

	public EmpleadoPorHoras() {
		throw new UnsupportedOperationException();
	}

	public void calcularSalario() {
		throw new UnsupportedOperationException();
	}
}