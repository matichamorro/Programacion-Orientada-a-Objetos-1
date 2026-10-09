package ar.edu.unlp.info.oo1.CuentaConGanchos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CajaDeAhorroTest {

	private CajaDeAhorro caja;
	private CajaDeAhorro caja2;
	
	@BeforeEach
	void setUp() {
		caja = new CajaDeAhorro();
		caja2 = new CajaDeAhorro(); 
	}
	
	@Test
	void testDepositar() {
		caja.depositar(100);
		assertEquals(98, caja.getSaldo());
	}
	
	@Test
	void testExtraer() {
		boolean aux;
		
		caja.depositar(100);
		aux = caja.extraer(50);
		assertTrue(aux);
		assertEquals(47, caja.getSaldo());
		
		caja2.depositar(100);
		aux = caja2.extraer(100);
		assertFalse(aux);
		assertEquals(98, caja2.getSaldo());
	}
	
	@Test
	void testTransferirACajaDeAhorro() {
		caja.depositar(100);
		assertEquals(98, caja.getSaldo());
		
		boolean aux;
		aux = caja.transferirACuenta(98, caja2);
		assertFalse(aux);
		assertEquals(98, caja.getSaldo());
		assertEquals(0, caja2.getSaldo());

		aux = caja.transferirACuenta(50, caja2);
		assertTrue(aux);
		assertEquals(47, caja.getSaldo());
		assertEquals(49, caja2.getSaldo());
	}
	
	@Test
	void testTransferirACuentaCorriente() {
		CuentaCorriente cuenta = new CuentaCorriente();
		caja.depositar(300);
		boolean aux;
		
		aux = caja.transferirACuenta(300, cuenta);
		assertFalse(aux);
		assertEquals(0,cuenta.getSaldo());
		assertEquals(294,caja.getSaldo());
		
		aux = caja.transferirACuenta(100, cuenta);
		assertTrue(aux);
		assertEquals(100,cuenta.getSaldo());
		assertEquals(192,caja.getSaldo());
	}
}
