package ar.edu.unlp.info.oo1.Inversores;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InversorTest {
	
	private Inversor inversor;
	private Inversion inversionEnAcciones;
	private Inversion inversionEnPlazoFijo;
	
	@BeforeEach
	void setUp() {
		inversor = new Inversor();
		inversionEnAcciones = new InversionEnAcciones(4,500,"IBM"); 
		inversionEnPlazoFijo = new InversionEnPlazoFijo(1000, 2); 
	}
	
	@Test
	void testAgregarInversion() {
		inversor.agregarInversion(inversionEnAcciones);
		assertTrue(inversor.getCartera().contains(inversionEnAcciones));
	}
	
	@Test
	void testSacarInversion() {
		assertFalse(inversor.sacarInversion(inversionEnAcciones));
		
		inversor.agregarInversion(inversionEnAcciones);
		assertTrue(inversor.sacarInversion(inversionEnAcciones));
	}
	
	@Test
	void testValorInversionActual() {
		assertEquals(0, inversor.valorInversionActual());
		
		inversor.agregarInversion(inversionEnAcciones);
		inversor.agregarInversion(inversionEnPlazoFijo);
		assertEquals(3000, inversor.valorInversionActual());
	}
	
	
}
