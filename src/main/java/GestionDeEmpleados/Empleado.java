package GestionDeEmpleados;

public abstract class Empleado {
	private String nombre;
	private Object salarioBase;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void getSalarioBase() {
		return this.salarioBase;
	}

	public void setSalarioBase(Object salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Empleado() {
		throw new UnsupportedOperationException();
	}

	public abstract void calcularSalario();
}