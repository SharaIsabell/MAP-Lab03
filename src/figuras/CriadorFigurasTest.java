package figuras;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CriadorFigurasTest {

	static Retangulo retangulo;
	static Quadrado quadrado;
	static Circulo circulo;
	static CriadorFiguras criadorFiguras;
	
	@BeforeClass
	public static void criarObjetos() {
		criadorFiguras = new CriadorFiguras();
		retangulo = criadorFiguras.criarRetangulo(10, 5);
		quadrado = criadorFiguras.criarQuadrado(7);
		circulo = criadorFiguras.criarCirculo(25);
	}
	
	@Test
	public void adicionarAreaTest() {
		assertEquals(true, criadorFiguras.getAreas().containsKey(retangulo.area()));
		
	}
	
	@Test
	public void adicionarPerimetroTest() {
		assertEquals(true, criadorFiguras.getPerimetros().containsKey(circulo.perimetro()));
	}

}
