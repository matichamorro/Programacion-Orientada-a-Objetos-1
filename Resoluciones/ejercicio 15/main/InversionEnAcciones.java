package ar.edu.unlp.info.oo1.Inversores;

public class InversionEnAcciones implements Inversion {
	private int cantidadDeAcciones;
	private double valorUnitario;
	private String nombre;
	
	public InversionEnAcciones(int cant, double valorUnit, String nombre) {
		this.cantidadDeAcciones = cant;
		this.valorUnitario = valorUnit;
		this.nombre = nombre;
	}
	
	public int getCantidadDeAcciones() {
		return cantidadDeAcciones;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public String getNombre() {
		return nombre;
	}

	public double valorActual() {
		return valorUnitario * cantidadDeAcciones;
	}
}
