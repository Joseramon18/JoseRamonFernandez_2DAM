package unidad1.ejercicios;

import java.io.File;
import java.util.Scanner;

public class Ejercicio1 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String continuar = "s";
		
		while (continuar.equalsIgnoreCase(continuar)) {
			System.out.println("Introduzca la ruta del fichero: ");
			String nombre = sc.nextLine();
			
			File fichero = new File("/home/diurno/git/JoseRamonFernandez_2DAM/JoseRamonFernandez_2DAM/catalogo/"+nombre);
			
			if (!fichero.exists()) {
				System.out.println("EL fichero que me has dicho no existe.");
			}else {
				System.out.println("Existe.");
				if (fichero.isFile()) {
					System.out.println("Tipo: Fichero.");
				}else if (fichero.isDirectory()) {
					System.out.println("Tipo: Carpeta o directorio");
				}
				
				System.out.println("Nombre sin ruta: "+fichero.getName());
				System.out.println("Ruta absoluta: "+fichero.getAbsolutePath());
			}
		}
		
		
	}
}
