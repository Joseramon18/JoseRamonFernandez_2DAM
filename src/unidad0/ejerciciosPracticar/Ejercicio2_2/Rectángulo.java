package unidad0.ejerciciosPracticar.Ejercicio2_2;

public class Rectángulo {

	private double base;
	private double altura;
	
	public Rectángulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	public void calcularArea() {
		double area = base*altura;
		System.out.println("El area del rectángulo es: "+area);
	}
}
