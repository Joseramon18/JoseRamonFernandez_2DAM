package unidad1.ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio7 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Introduce la ruta del fichero a modificar: ");
		Path rutaOriginal = Paths.get(sc.nextLine().trim());
		
		if (Files.notExists(rutaOriginal)) {
			System.out.println("Error: El fichero original no existe.");
			sc.close();
			return;
		}
		
		System.out.println("Introduce el número de línea que quieres modificar (1 para la primera): ");
		int numLineaModificar =0;
		try {
			numLineaModificar = Integer.parseInt(sc.nextLine().trim());
			} catch (NumberFormatException e) {
			System.out.println("Error: Debes introducir un número entero válido.");
			sc.close();
			return;
		}
		System.out.println("Introduce el nuevo texto para la línea "+numLineaModificar+": ");
		String nuevoTexto = sc.nextLine().trim();
		
		Path rutaTemporal = null;
		try {
		
			 rutaTemporal = Files.createTempFile(rutaOriginal.getParent(), "temp_", ".txt");
			
		try(BufferedReader br = Files.newBufferedReader(rutaOriginal);
			BufferedWriter bw = Files.newBufferedWriter(rutaTemporal)) {
			
			String lineaActual;
			int contadorLinea = 1;
			boolean lineaEncontrada = false;
			
			while ((lineaActual = br.readLine()) != null) {
				
				if (contadorLinea == numLineaModificar) {
					bw.write(nuevoTexto);
					lineaEncontrada = true;
				}else {
					bw.write(lineaActual);
				}
				
				bw.newLine();
				contadorLinea++;
			}
			
			if (!lineaEncontrada) {
				System.out.println("Aviso: El fichero tiene menos de "+numLineaModificar+" líneas. No se modificó nada.");
			}else {
				System.out.println("Línea "+numLineaModificar+" modifica correctamente en el fichero temporal.");
			}
		} 
		}catch (IOException e) {
			System.out.println("Error en la entrada/salida: "+e.getMessage());
		}
	}
}
