package unidad1.ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio4{
	static Scanner sc = new Scanner (System.in);

    private static void crearFichero() {
        System.out.print("Introduce el nombre del nuevo fichero (con extensión si aplica): ");
        String nombreFichero = sc.nextLine();
        Path nuevaRuta = Paths.get("/home/diurno/git/JoseRamonFernandez_2DAM/JoseRamonFernandez_2DAM/catalogo/"+nombreFichero);

        if (Files.exists(nuevaRuta)) {
            System.out.println("Error: Ya existe un fichero o carpeta con ese nombre.");
            return;
        }

        try {
            Files.createFile(nuevaRuta);
            System.out.println("Fichero creado con éxito en: " + nuevaRuta.toAbsolutePath());
        } catch (IOException e) {
            System.out.println("No se pudo crear el fichero: " + e.getMessage());
        }
    }
    
    public static void main(String[] finalArgs) {
      
    	crearFichero();
    	
        System.out.print("Introduce el nombre del fichero: ");
        String nombreFichero = sc.nextLine();
        
        int contadorPersonas = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader("/home/diurno/git/JoseRamonFernandez_2DAM/JoseRamonFernandez_2DAM/catalogo/"+nombreFichero))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.trim().isEmpty()) {	
                    String[] datos = linea.split(";");
                    if (datos.length >= 3) {
                        String nombre = datos[0].trim();
                        String apellidos = datos[1].trim();
                        String fechaNacimiento = datos[2].trim();
                        
                        System.out.println("Nombre: " + nombre + " | Apellidos: " + apellidos + " | Ficha de Nacimiento: " + fechaNacimiento);
                        contadorPersonas++;
                    }
                }
            }
            System.out.println("\nNúmero total de personas: " + contadorPersonas);
            
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
