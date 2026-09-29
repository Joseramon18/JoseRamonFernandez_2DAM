package unidad0.ejerciciosPracticar.ejercicio2_1;

import java.util.Scanner;

public class HolaMundoPersonalizado {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		String nombre;
		
		System.out.println("Diga su nombre: ");
		nombre= sc.nextLine();
		
		System.out.println("¡Hola, "+nombre+"!");
	}

}
