package unidad1.ejercicios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio5 {

	static Scanner sc = new Scanner (System.in);
	
	public static void añadirTextoAlFinal(String rutaFichero, String textoAñadir) {
       
		File fichero = new File (rutaFichero);
        boolean noExiste = !fichero.exists();
        
        try (FileWriter fw = new FileWriter(rutaFichero, true)) {
        	if (noExiste) {
				System.out.println("El fichero no existe.");
			}else {
				fw.write(textoAñadir);
	            System.out.println("Texto añadido correctamente.");
			}
        	
        } catch (IOException e) {
            System.err.println("Ocurrió un error al escribir en el fichero: " + e.getMessage());
        }
    }
	
	public static void main(String[] args) {
	        String ruta;
	       
	        System.out.println("Indica la ruta del fichero:");
	        ruta = sc.nextLine();
	       
	        String texto;
	        System.out.println("Indica el texto a añadir: ");
	        texto = sc.nextLine();
	        
	        añadirTextoAlFinal(ruta, texto);
	    
	}
}
