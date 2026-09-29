package unidad0.ejerciciosPracticar.ejercicioLibro;

public class Libro {

	private String titulo;
	private String autor;
	private double precio;
	private String comentario;
	private int isbn;
	
	public Libro() {
		titulo = "Sin título";
		autor = "Anónimo";
		precio = 0.0;
		comentario ="Sin comentario";
		isbn = (int)(Math.random()*(999999-100000+1))+100000;
	}

	public Libro(String titulo, String autor, double precio, String comentario) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
		this.comentario = comentario;
		this.isbn = (int)(Math.random()*(999999-100000+1))+100000;
	}
	
	public void procesarComentario() {
		this.comentario = this.comentario.trim();
		System.out.println("Longitud del comentario: "+this.comentario.length());
		this.comentario = this.comentario.toUpperCase();
	}
	
	public void mostrarInfo() {
		System.out.println("Mostrando los datos del libro: ");
		System.out.println("Autor: "+autor);
		System.out.println("Título: "+titulo);
		
		this.procesarComentario();
		System.out.println("Comentario: "+comentario);
		
		System.out.println("Precio: "+precio);
		System.out.println("ISBN: "+isbn);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	
}
