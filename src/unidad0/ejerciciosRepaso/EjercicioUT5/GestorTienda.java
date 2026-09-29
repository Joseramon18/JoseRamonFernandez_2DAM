package unidad0.ejerciciosRepaso.EjercicioUT5;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorTienda {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		ArrayList<Videojuego> listaMenu = new ArrayList<Videojuego>();
		int opcion = 0;
		do {
			System.out.println("--- Menú de opciones ---");
			System.out.println("1. Añadir Videojuego: ");
			System.out.println("2. Eliminar por Título: ");
			System.out.println("3. Búsqueda Inteligente: ");
			System.out.println("4. Cambiar Prioridad de Escaparate: ");
			System.out.println("5. Análisis de Precios: ");
			System.out.println("6. Listado Completo: ");
			System.out.println("7. Salir: ");
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1:
				
				break;

			default:
				break;
			}
		} while (opcion>7);
	}

}
