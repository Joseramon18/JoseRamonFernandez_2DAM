package unidad0.ejerciciosPracticar.ejercicioLibro;

public class Libreria {

	
	private String nombre;
	private Libro libreoDestacado;
	
	public Libreria(String nombre, Libro libreoDestacado) {
		super();
		this.nombre = nombre;
		this.libreoDestacado = libreoDestacado;
	}
	
	public void mostrarLibreria() {
		System.out.println("Libreria: "+this.nombre);
		this.libreoDestacado.mostrarInfo();
	}
	
}
