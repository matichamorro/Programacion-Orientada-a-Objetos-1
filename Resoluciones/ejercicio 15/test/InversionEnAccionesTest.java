package ar.edu.unlp.info.oo1.Inversores;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InversionEnAccionesTest {

	private InversionEnAcciones inversionEnAcciones;
	private InversionEnAcciones inversionSinAcciones;
	
	@BeforeEach
	void setUp() {
		inversionEnAcciones = new InversionEnAcciones(4,500,"IBM"); 
		inversionSinAcciones = new InversionEnAcciones(0,500,"NVIDIA"); 
	}
	
	@Test
	void testGetCantidadDeAcciones() {
		assertEquals(4, inversionEnAcciones.getCantidadDeAcciones());
	}

	@Test
	void testGetValorUnitario() {
		assertEquals(500, inversionEnAcciones.getValorUnitario());
	}

	@Test
	void testGetNombre() {
		assertEquals("IBM", inversionEnAcciones.getNombre());
	}
	
	@Test
	void testValorActual() {
		assertEquals(2000, inversionEnAcciones.valorActual());
		assertEquals(0, inversionSinAcciones.valorActual());
	}
}
