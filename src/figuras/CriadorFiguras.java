package figuras;

import java.util.ArrayList;

public class CriadorFiguras {
	private ArrayList<Double> areas;
	private ArrayList<Double> perimetros;
	
	public CriadorFiguras() {
		areas = new ArrayList<>();
		perimetros = new ArrayList<>();
	}
	
	public Quadrado criarQuadrado(double lado) {
		Quadrado quadrado = new Quadrado(lado);
		adicionarArea(quadrado.area()); 
		adicionarPerimetro(quadrado.perimetro());
		return quadrado;
	}
	
	public Retangulo criarRetangulo(double base, double altura) {
		Retangulo retangulo = new Retangulo(base, altura);
		adicionarArea(retangulo.area()); 
		adicionarPerimetro(retangulo.perimetro());
		return retangulo;
	}
	
	public Circulo criarRetangulo(double raio) {
		Circulo circulo = new Circulo(raio);
		adicionarArea(circulo.area()); 
		adicionarPerimetro(circulo.perimetro());
		return circulo;
	}
	
	private void adicionarArea(double area) {
		areas.add(area);
	}
	
	private void adicionarPerimetro(double perimetro) {
		perimetros.add(perimetro);
	}

}
