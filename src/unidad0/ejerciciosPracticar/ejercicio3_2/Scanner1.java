package unidad0.ejerciciosPracticar.ejercicio3_2;

import java.util.Scanner;

public class Scanner1 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		String nombre;
		int edad;
		
		System.out.println("Introduzca su nombre: ");
		nombre= sc.nextLine();
		
		System.out.println("Introduzca su edad: ");
		edad = sc.nextInt();
		
		System.out.println("Hola "+nombre+", tienes "+edad+" años.");
	}

}
