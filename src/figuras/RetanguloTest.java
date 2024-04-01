package figuras;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class RetanguloTest {

	static Retangulo retangulo;
	
	@BeforeClass
	public static void criarObjetos() {
		retangulo = new Retangulo(5, 6);
	}

	@Test(expected = FiguraException.class)
	public void quadradoTest() { // Testa a excessão
		retangulo = new Retangulo(0, -2);
	}
	
	@Test
	public void areaTest() {
		assertEquals(30, retangulo.area(), 0);
	}
	
	@Test
	public void perimetroTest() {
		assertEquals(22, retangulo.perimetro(), 0);
	}

}
