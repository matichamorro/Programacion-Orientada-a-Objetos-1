package ar.edu.unlp.info.oo1.Inversores;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InversionEnPlazoFijoTest {

	private InversionEnPlazoFijo inversionEnPlazoFijo;
	
	@BeforeEach
	void setUp() {
		inversionEnPlazoFijo = new InversionEnPlazoFijo(1000, 2); 
	}
	
	@Test
	void testGetMontoDepositado() {
		assertEquals(1000, inversionEnPlazoFijo.getMontoDepositado());
	}
	
	@Test
	void testGetInteresDiario() {
		assertEquals(2, inversionEnPlazoFijo.getInteresDiario());
	}
	
	@Test
	void testValorActual() {
		// No transcurre ni un dia entre la fecha de creacion y la de consulta, no hay intereses generados
		assertEquals(1000, inversionEnPlazoFijo.valorActual());
		
	}
}
