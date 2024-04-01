package figuras;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class QuadradoTest {
	
	static Quadrado quadrado;
	
	@BeforeClass
	public static void criarObjetos() {
		quadrado = new Quadrado(5);
	}

	@Test(expected = FiguraException.class)
	public void quadradoTest() { // Testa a excessão
		quadrado = new Quadrado(0);
	}
	
	@Test
	public void areaTest() {
		assertEquals(25, quadrado.area(), 0);
	}
	
	@Test
	public void perimetroTest() {
		assertEquals(20, quadrado.perimetro(), 0);
	}

}
