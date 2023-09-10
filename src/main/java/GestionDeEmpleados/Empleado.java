package GestionDeEmpleados;

public abstract class Empleado {
	private String nombre;
	private int salarioBase;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSalarioBase() {
		return this.salarioBase;
	}

	public void setSalarioBase(int salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Empleado(String nombre, int salarioBase) {
		this.nombre = nombre;
		this.salarioBase = salarioBase;
	}

	public abstract int calcularSalario();
}