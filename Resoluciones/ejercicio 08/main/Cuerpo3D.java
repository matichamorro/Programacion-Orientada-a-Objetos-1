package ar.edu.unlp.info.oo1.figurasYCuerpos;

public class Cuerpo3D {
	private double altura;
	private Figura2D caraBasal;
	
	public Cuerpo3D() {

	}
	
	public Cuerpo3D(double altura, Figura2D caraBasal) {
		this.altura = altura;
		this.caraBasal = caraBasal;
	}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setCaraBasal(Figura2D caraBasal) {
		this.caraBasal = caraBasal;
	}
	
	public double getVolumen() {
	// área-cara-basal * altura
		return caraBasal.getArea() * this.getAltura();
	}
	
	public double getSuperficieExterior() {
	// 2* área-cara-basal + perímetro-cara-basal * altura-del-cuerpo
		return 2 * caraBasal.getArea() + caraBasal.getPerimetro() * this.getAltura();
	}
}
