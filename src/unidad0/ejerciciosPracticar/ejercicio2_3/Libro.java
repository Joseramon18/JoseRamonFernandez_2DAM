package unidad0.ejerciciosPracticar.ejercicio2_3;

public class Libro {

	private String titulo;
	private String autor;
	
	public Libro(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
	}

	//Mostramos la información
	public void mostrarInfo() {
		System.out.println("Título: "+titulo);
		System.out.println("Autor: "+autor);
	}

	
	
}
