package figuras;

import java.util.HashMap;

public class CriadorFiguras {
	private HashMap<Double, String> areas;
	private HashMap<Double, String> perimetros;
	private Integer idCir = 0, idRet = 0, idQua = 0;
	
	public CriadorFiguras() {
		areas = new HashMap<>();
		perimetros = new HashMap<>();
	}
	
	public Quadrado criarQuadrado(double lado) {
		Quadrado quadrado = new Quadrado(lado);
		idQua++;
		adicionarArea(quadrado.area(), "Quadrado ".concat(idQua.toString()));
		adicionarPerimetro(quadrado.perimetro(), "Quadrado ".concat(idQua.toString()));
		return quadrado;
	}
	
	public Retangulo criarRetangulo(double base, double altura) {
		Retangulo retangulo = new Retangulo(base, altura);
		idRet++;
		adicionarArea(retangulo.area(), "Retângulo ".concat(idRet.toString())); 
		adicionarPerimetro(retangulo.perimetro(), "Retângulo ".concat(idRet.toString()));
		return retangulo;
	}
	
	public Circulo criarCirculo(double raio) {
		Circulo circulo = new Circulo(raio);
		idCir++;
		adicionarArea(circulo.area(), "Círculo ".concat(idCir.toString())); 
		adicionarPerimetro(circulo.perimetro(), "Círculo ".concat(idCir.toString()));
		return circulo;
	}
	
	private void adicionarArea(double area, String figura) {
		areas.put(area, figura);
	}
	
	private void adicionarPerimetro(double perimetro, String figura) {
		perimetros.put(perimetro, figura);
	}
	
	public String todasAreas() {
		StringBuilder areasString = new StringBuilder();
		
		for (Double key : areas.keySet()) {
			areasString.append(areas.get(key)).append(": ").append(key).append(" ");
		}

		return areasString.toString().trim();
	}
	
	public String todosPerimetros() {
		StringBuilder perimetrosString = new StringBuilder();
		
		for (Double key : perimetros.keySet()) {
			perimetrosString.append(perimetros.get(key)).append(": ").append(key).append(" ");
		}

		return perimetrosString.toString().trim();
	}

	// Getters
	
	protected HashMap<Double, String> getAreas() {
		return areas;
	}

	protected HashMap<Double, String> getPerimetros() {
		return perimetros;
	}

}
