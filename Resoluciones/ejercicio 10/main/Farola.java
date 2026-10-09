package ar.edu.unlp.info.oo1.RedDeAlumbrado;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Farola {
	private boolean isOn;
	private List<Farola> neighbors;
	
	/*
	* Crear una farola. Debe inicializarla como apagada
	*/
	public Farola () {
		this.isOn = false;
		this.neighbors = new LinkedList<>();
	}

	/*
	* Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca, es decir el receptor del mensaje será vecino de otraFarola, al igual que otraFarola también se convertirá en vecina del receptor del mensaje
	*/
	public void pairWithNeighbor( Farola otraFarola ) {
		this.neighbors.add(otraFarola);
		otraFarola.getNeighbors().add(this);
	}

	/*
	* Retorna sus farolas vecinas
	*/
	public List<Farola> getNeighbors () {
		return this.neighbors;
	}

	/*
	* Si la farola no está encendida, la enciende y propaga la acción.
	*/
	public void turnOn() {
		if (this.isOff()) {
			Queue<Farola> q = new LinkedList<>();
			Farola f;
			q.add(this);
			while (!q.isEmpty()) {
				int length = q.size();
				for (int i=0; i < length; i++) {
					f = q.poll();
					f.setOn();
					for (Farola n: f.getNeighbors())
						if (n.isOff()) q.offer(n);
				}
			}				
		}
	}

	/*
	* Si la farola no está apagada, la apaga y propaga la acción.
	*/
	public void turnOff() {
		if (this.isOn()) {
			Queue<Farola> q = new LinkedList<>();
			Farola f;
			q.add(this);
			while (!q.isEmpty()) {
				int length = q.size();
				for (int i=0; i < length; i++) {
					f = q.poll();
					f.setOff();
					for (Farola n: f.getNeighbors())
						if (n.isOn()) q.offer(n);
				}
			}				
		}
	}

	/*
	* Retorna true si la farola está encendida.
	*/
	public boolean isOn() {
		return this.isOn;
	}

	/*
	* Retorna true si la farola está apagada.
	*/
	public boolean isOff() {
		return !this.isOn;
	}

	public void setOn() {
		this.isOn = true;
	}
	
	public void setOff() {
		this.isOn = false;
	}
}
