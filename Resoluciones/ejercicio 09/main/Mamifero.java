package ar.edu.unlp.info.oo1.Genealogia;

import java.time.LocalDate;

public class Mamifero {
	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	
	public Mamifero(String identificador) {
		this.identificador = identificador;
		this.madre = null;
		this.padre = null;
		this.especie = null;
		this.fechaNacimiento = null;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Mamifero getPadre() {
		return padre;
	}

	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}

	public Mamifero getMadre() {
		return madre;
	}

	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public Mamifero getAbueloMaterno() {
		return (this.getMadre() != null) ? this.getMadre().getPadre() : null;
	}
	
	public Mamifero getAbuelaMaterna() {
		return (this.getMadre() != null) ? this.getMadre().getMadre() : null;	
	}
	
	public Mamifero getAbueloPaterno() {
		return (this.getPadre() != null) ? this.getPadre().getPadre() : null;
	}
	
	public Mamifero getAbuelaPaterna() {
		return (this.getPadre() != null) ? this.getPadre().getMadre(): null;	
	}
	
	public boolean tieneComoAncestroA (Mamifero unMamifero) {
		boolean encontró = this == unMamifero;
		boolean tieneDeAncestro = false;
		if (this.getPadre() != null) {
			encontró = this.getPadre().tieneComoAncestroA(unMamifero);
			if (encontró) tieneDeAncestro = true;
		}
		if (this.getMadre() != null) {
			encontró = this.getMadre().tieneComoAncestroA(unMamifero);
			if (encontró) tieneDeAncestro = true;
		}
		return tieneDeAncestro;
	}
	
}
