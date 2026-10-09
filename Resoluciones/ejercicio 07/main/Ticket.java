package ar.edu.unlp.info.oo1.ejercicio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ticket {
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	private List<Producto> productos;
	
	public Ticket() {
		this.fecha = null;
		this.cantidadDeProductos = 0;
		this.pesoTotal = 0;
		this.precioTotal = 0;
		this.productos = new ArrayList<>();
	}
	public void setFecha(LocalDate localDate) {
		this.fecha = localDate;
	}
	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}
	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	public double getPesoTotal() {
		return pesoTotal;
	}
	public double getPrecioTotal() {
		return precioTotal;
	}
	
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	public double impuesto() {
		return (getPrecioTotal() / 100) * 21;
	}
}
