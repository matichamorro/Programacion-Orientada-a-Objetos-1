package ar.edu.unlp.info.oo1.figurasYCuerpos;

public class Cuadrado implements Figura2D{
	private double lado;
	
	public Cuadrado() {
		
	}
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}
	
	public double getPerimetro() {
		return getLado() * 4;
	}
	
	public double getArea() {
		return getLado() * getLado();
	}

}
