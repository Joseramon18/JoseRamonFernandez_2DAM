package unidad1.ejerciciosRepasoExamen;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.stream.Stream;

public class BuscadorTextoRecursivo {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Introduce la ruta de una carpeta:");
		String entrada = sc.nextLine();
		
		Path rutaCarpeta = Path.of(entrada);
		
		if (!Files.exists(rutaCarpeta)|| !Files.isDirectory(rutaCarpeta)) {
			System.err.println("Error: La ruta no existe o no es una carpeta válida.");
			return;
		}
		
		System.out.println("\n--- Iniciando búsqueda de ficheros .txt ---");

		try (Stream<Path> arbol = Files.walk(rutaCarpeta)) {
			
			Iterable<Path> contenido = arbol :: iterator;
			
			for (Path p : contenido) {
				if (Files.isRegularFile(p)) {
					
					String nombreFichero = p.getFileName().toString();
					
					if (nombreFichero.endsWith(".txt")) {
						long tamano = Files.size(p);
					
						System.out.println("Fichero: "+nombreFichero+" |Tamaño: "+tamano+" bytes.\n");
					}
				}
			}
			
		} catch (IOException e) {
			System.err.println("Error al leer el systema de archivos: "+e.getMessage());
		}
		System.out.println("Búsqueda finalizada.");
	}
}
