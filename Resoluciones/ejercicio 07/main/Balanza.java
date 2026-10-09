package ar.edu.unlp.info.oo1.ejercicio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Balanza {
	private int cantidadDeProductos;
	private List<Producto> productos;
	
	public Balanza() {
		this.cantidadDeProductos = 0;
		this.productos = new ArrayList<>();
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}
	
	public void ponerEnCero() {
		setCantidadDeProductos(0);
		productos.clear();
	}
	
	public void agregarProducto(Producto producto) {
		setCantidadDeProductos(getCantidadDeProductos() + 1);
		productos.add(producto);
	}
	
	public Ticket emitirTicket() {
		Ticket t = new Ticket();
		t.setFecha(LocalDate.now());
		t.setCantidadDeProductos(this.getCantidadDeProductos());
		double pesoTotal = 0, precioTotal = 0;
		for (Producto p: productos) {
			pesoTotal += p.getPeso();
			precioTotal += p.getPrecio();
		}
		t.setPesoTotal(pesoTotal);
		t.setPrecioTotal(precioTotal);
		t.setProductos(productos);
		return t;
	}
	
	public List<Producto> getProductos() {
		return productos;
	}

	public double getPesoTotal() {
		double pesoTotal = 0;
		for (Producto p: productos) 
			pesoTotal += p.getPeso();
		return pesoTotal;
	}
	
	public double getPrecioTotal() {
		double precioTotal = 0;
		for (Producto p: productos) 
			precioTotal += p.getPrecio();
		return precioTotal;
	}
		
}
