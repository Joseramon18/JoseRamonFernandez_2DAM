package unidad0.ejerciciosPracticar.ejercicio3_1;

public class String1 {

	public static void main(String[] args) {
		
		String texto = " Hola Java ";
		
		System.out.println("Longitud: "+texto.length());
		System.out.println("Sin espacios: "+texto.trim());
		System.out.println("En mayúsculas: "+texto.toUpperCase());
		System.out.println("¿Contiene la palabra Java?: "+texto.contains("Java"));
		
	}
}
