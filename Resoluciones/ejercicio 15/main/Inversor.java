package ar.edu.unlp.info.oo1.Inversores;

import java.util.LinkedList;
import java.util.List;

public class Inversor {
	private List<Inversion> cartera;
	
	public Inversor() {
		this.cartera = new LinkedList<>();
	}
	
	public List<Inversion> getCartera() {
		return cartera;
	}

	public void agregarInversion(Inversion i) {
		cartera.add(i);
	}
	
	public boolean sacarInversion(Inversion i) {
		if (cartera.contains(i)) {
			cartera.remove(i);
			return true;
		}
		return false;
	}
	
	public double valorInversionActual() {
		double total = 0;
		for (Inversion i : cartera) {
			total += i.valorActual();
		}
		return total;
	}
}
