package unidad0.ejerciciosPracticar.ejercicioLibro;

import java.util.Scanner;

public class TestLibreria {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Libro milibro = new Libro("Stoner", "John Williams", 25.0, "Humanismo");
		
		
		System.out.println(Descuento.calcularPrecioConDescuento(milibro.getPrecio(), 10));
	}
}
