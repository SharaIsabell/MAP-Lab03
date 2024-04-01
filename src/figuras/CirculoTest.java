package figuras;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CirculoTest {

	static Circulo circulo;
	
	@BeforeClass
	public static void criarObjetos() {
		circulo = new Circulo(4);
	}

	@Test(expected = FiguraException.class)
	public void circuloTest() { // Testa a excessão
		circulo = new Circulo(0);
	}
	
	@Test
	public void areaTest() {
		assertEquals(16 * circulo.PI, circulo.area(), 0);
	}
	
	@Test
	public void perimetroTest() {
		assertEquals(8 * circulo.PI, circulo.perimetro(), 0);
	}

}
