package figuras;

public class Retangulo {
	private double base, altura;

	protected Retangulo(double base, double altura) throws FiguraException{
		if(base <= 0 || altura <= 0) {
			throw new FiguraException("Retângulo não pode ter base ou altura iguais ou inferiores a zero");
		}
		this.base = base;
		this.altura = altura;
	}
	
	protected double area() {
		return base * altura;
	}

	protected double perimetro() {
		return (2 * base) + (2 * altura);
	}
	
	@Override
	public String toString() {
		return "O retângulo criado tem altura " + altura + " e base " + base;
	}
	
	// Getters e Setters

	protected double getBase() {
		return base;
	}

	protected void setBase(double base) {
		this.base = base;
	}

	protected double getAltura() {
		return altura;
	}

	protected void setAltura(double altura) {
		this.altura = altura;
	}
	
}
