package ar.edu.unlp.info.oo1.Inversores;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class InversionEnPlazoFijo implements Inversion {
	private LocalDate fecha;
	private double montoDepositado;
	private double interesDiario;
	
	public InversionEnPlazoFijo(double monto, double interes) {
		this.fecha = LocalDate.now();
		this.montoDepositado = monto;
		this.interesDiario = interes;
	}
	
	public double getMontoDepositado() {
		return montoDepositado;
	}

	public double getInteresDiario() {
		return interesDiario;
	}

	public double valorActual() {
		LocalDate fechaActual = LocalDate.now();
		long diasTranscurridos = ChronoUnit.DAYS.between(this.fecha, fechaActual);
		return this.montoDepositado + 
				this.montoDepositado * this.interesDiario * diasTranscurridos;
	}
}
