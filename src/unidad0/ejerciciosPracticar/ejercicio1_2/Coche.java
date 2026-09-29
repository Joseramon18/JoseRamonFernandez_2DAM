package unidad0.ejerciciosPracticar.ejercicio1_2;

public class Coche {

	private String marca;
	private int velocidad;
	
	public Coche(String marca, int velocidad) {
		super();
		this.marca = marca;
		this.velocidad = velocidad;
	}

	public String getMarca() {
		return marca;
	}

	public int getVelocidad() {
		return velocidad;
	}
	
	public int acelerar(int cantidad) {
		System.out.println("Aceleramos "+cantidad+" km/h");
		return velocidad+= cantidad;
	}
	
	public void mostrarVelocidad() {
		System.out.println("Velocidad actual: "+velocidad+"km/h");
	}
}
