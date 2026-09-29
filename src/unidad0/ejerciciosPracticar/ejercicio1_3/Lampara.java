package unidad0.ejerciciosPracticar.ejercicio1_3;

public class Lampara {

	private boolean encendida;
	
	
	public Lampara(boolean encendida) {
		super();
		this.encendida = encendida;
	}

	public boolean encender() {
		System.out.println("Lámpara encendida");
		return encendida== true;
	}
	
	public boolean apagar() {
		System.out.println("Lámpara apagada");
		return encendida==false;
	}
}
