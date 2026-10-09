package ar.edu.unlp.info.oo1.CuentaConGanchos;

public class CajaDeAhorro extends Cuenta {
	
	public CajaDeAhorro() {
		super();
	}
	
	public void depositar(double monto) {
		super.depositar(monto * 0.98);
	}
	
	protected void extraerSinControlar(double monto) {
		super.extraerSinControlar(monto * 1.02);
	}
	
	protected boolean puedeExtraer(double monto) {
		if (this.getSaldo() >= monto * 1.02)
			return true;
		return false;	
	}

}
