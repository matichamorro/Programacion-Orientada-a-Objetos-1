package ar.edu.unlp.info.oo1.figurasYCuerpos;

public class Circulo implements Figura2D{
	private double radio;
	
	public Circulo() {
		
	}
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public double getDiametro() {
		return radio * 2;
	}
	
	public void setDiametro() {
		this.radio = radio / 2;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getPerimetro() {
		return Math.PI * this.getDiametro();
	}
	
	public double getArea() {
		return Math.PI * Math.pow(this.getRadio(), 2);
	}
}
