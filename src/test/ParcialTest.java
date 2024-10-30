package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logica.Parcial;

class ParcialTest {
	
	private Parcial parcial;
	
	@BeforeEach
	public void setUp() {
		this.parcial = new Parcial();
	}

	@Test
	public void cuadraticaDosSolucionesTest() throws Exception {
		ArrayList<Double> resultados = this.parcial.cuadratica(1, 3, 2);
		assertTrue(resultados.get(0) == -1 && resultados.get(1) == -2);
		assertFalse(resultados.get(0) == -2 && resultados.get(1) == -2);
		assertEquals(2, resultados.size());
	}
	
	@Test
	public void cuadraticaUnaSolucionTest() throws Exception {
		ArrayList<Double> resultados = this.parcial.cuadratica(1, -4, 4);
		assertTrue(resultados.get(0) == 2);
		assertFalse(resultados.get(0) == -2);
		assertEquals(1, resultados.size());
	}
	
	@Test
	public void cuadraticaConA0Test() throws Exception {
		assertThrows(Exception.class, () -> this.parcial.cuadratica(0, -4, 4));
	}
	
	@Test
	public void cuadraticaConDiscriminantenegativoTest() throws Exception {
		assertThrows(Exception.class, () -> this.parcial.cuadratica(2, 1, 2));
	}

}
