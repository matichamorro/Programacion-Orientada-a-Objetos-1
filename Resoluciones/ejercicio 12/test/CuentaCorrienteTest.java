package ar.edu.unlp.info.oo1.CuentaConGanchos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CuentaCorrienteTest {

	private CuentaCorriente cuenta;
	private CuentaCorriente cuenta2;
	
	@BeforeEach
	void setUp() {
		cuenta = new CuentaCorriente();
		cuenta2 = new CuentaCorriente();
	}
	
	@Test
	void testDepositar() {
		cuenta.depositar(100);
		assertEquals(100,cuenta.getSaldo());
	}
	
	@Test
	void testExtraer() {
		boolean aux;

		cuenta.setDescubierto(500);
		aux = cuenta.extraer(300);
		assertTrue(aux);
		assertEquals(-300,cuenta.getSaldo());
		
		cuenta2.setDescubierto(500);
		aux = cuenta2.extraer(600);
		assertFalse(aux);
		assertEquals(0,cuenta2.getSaldo());
	}
	
	@Test
	void testTransferirACuentaCorriente() {
		cuenta.setDescubierto(200);
		boolean aux;
		
		aux = cuenta.transferirACuenta(300, cuenta2);
		assertFalse(aux);
		assertEquals(0,cuenta.getSaldo());
		assertEquals(0,cuenta2.getSaldo());
		
		aux = cuenta.transferirACuenta(100, cuenta2);
		assertTrue(aux);
		assertEquals(-100,cuenta.getSaldo());
		assertEquals(100,cuenta2.getSaldo());
	}
	
	@Test
	void testTransferirACajaDeAhorro() {
		CajaDeAhorro caja = new CajaDeAhorro();
		cuenta.setDescubierto(200);
		boolean aux;
		
		aux = cuenta.transferirACuenta(300, caja);
		assertFalse(aux);
		assertEquals(0,cuenta.getSaldo());
		assertEquals(0,caja.getSaldo());
		
		aux = cuenta.transferirACuenta(100, caja);
		assertTrue(aux);
		assertEquals(-100,cuenta.getSaldo());
		assertEquals(98,caja.getSaldo());
	}
}
