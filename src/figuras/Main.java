package figuras;

public class Main {
	public static void main(String[] args) {
		CriadorFiguras criadorFiguras = new CriadorFiguras();
		
		Retangulo retangulo = criadorFiguras.criarRetangulo(10, 5);
		Quadrado quadrado = criadorFiguras.criarQuadrado(7);
		Circulo circulo = criadorFiguras.criarCirculo(25);
		
		System.out.println(criadorFiguras.todasAreas());
		System.out.println(criadorFiguras.todosPerimetros());
		
		System.out.println();
		
		System.out.println(retangulo);
		System.out.println(quadrado);
		System.out.println(circulo);
	}
}
