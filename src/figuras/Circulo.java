package figuras;

public class Circulo {
	private double raio;
	public static double PI = 3.14;

	protected Circulo(double raio) {
		if(raio > 0) {
			throw new FiguraException("Círculo não pode ter raio igual ou inferior a zero");
		}
		this.raio = raio;
	}
	
	protected double area() {
		return PI * Math.pow(raio, 2);
	}
	
	protected double perimetro() { 
		return 2 * PI * raio;
	}
	
	@Override
	public String toString() {
		return "O círculo criado tem raio " + raio;
	}
	
	//Getter e Setter

	protected double getRaio() {
		return raio;
	}

	protected void setRaio(double raio) {
		this.raio = raio;
	}
	
	

}
