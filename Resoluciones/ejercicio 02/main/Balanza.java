package ar.edu.unlp.info.oo1.ejercicio2;

import java.time.LocalDate;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	public Balanza(int cantidadDeProductos, double precioTotal, double pesoTotal) {
		this.cantidadDeProductos = cantidadDeProductos;
		this.precioTotal = precioTotal;
		this.pesoTotal = pesoTotal;
	}
	
	public Balanza() {
		this.cantidadDeProductos = 0;
		this.precioTotal = 0;
		this.pesoTotal = 0;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	
	public void ponerEnCero() {
		setCantidadDeProductos(0);
		setPrecioTotal(0);
		setPesoTotal(0);
	}
	
	public void agregarProducto(Producto producto) {
		setCantidadDeProductos(getCantidadDeProductos() + 1);
		setPrecioTotal(getPrecioTotal() + producto.getPrecio());
		setPesoTotal(getPesoTotal() + producto.getPeso());
	}
	
	public Ticket emitirTicket() {
		Ticket t = new Ticket();
		t.setFecha(LocalDate.now());
		t.setCantidadDeProductos(this.getCantidadDeProductos());
		t.setPesoTotal(this.getPesoTotal());
		t.setPrecioTotal(this.getPrecioTotal());
		return t;
	}
		
}
