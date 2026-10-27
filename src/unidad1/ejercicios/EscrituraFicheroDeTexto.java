package unidad1.ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class EscrituraFicheroDeTexto {

	static Scanner sc = new Scanner (System.in);
	
    public static void main(String[] args) {
        List<String> productos = List.of("Teclado mecanico","Ratón inalámbrico", "Monitor 27\"");
        
        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter("catalogo/productos.txt", StandardCharsets.UTF_8))) {
        		
        	for (String producto : productos) {
					
					
			do {
			System.out.println("Introduce un producto: ");
			producto = sc.nextLine();
			bw.write(producto);
			bw.newLine();
		
			} while (producto.equalsIgnoreCase("salir"));
          
        	}
        } catch (IOException e) {
            System.err.println("Error de escritura: " + e.getMessage());
        }
    }
}
