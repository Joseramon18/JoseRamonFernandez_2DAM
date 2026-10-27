package unidad1.ejercicios;

import java.io.File;
import java.util.Scanner;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        String nombreFichero = "personas.txt";
        
        Scanner teclado = new Scanner(String.valueOf(System.in));
        char continuar;

        try (FileWriter fw = new FileWriter(nombreFichero, true);
             PrintWriter pw = new PrintWriter(fw)) {

            do {
                System.out.println("--- Introducir datos de la persona ---");
                
                System.out.print("Nombre: ");
                String nombre = teclado.nextLine();
                
                System.out.print("Apellidos: ");
                String apellidos = teclado.nextLine();
                
                System.out.print("Teléfono: ");
                String telefono = teclado.nextLine();

                pw.println(nombre + ";" + apellidos + ";" + telefono);
                System.out.println("¡Datos guardados correctamente!");

                System.out.print("¿Deseas añadir otra persona? (s/n): ");
                continuar = teclado.nextLine().toLowerCase().charAt(0);

            } while (continuar == 's');

        } catch (IOException e) {
            System.out.println("Ocurrió un error al interactuar con el fichero: " + e.getMessage());
        } finally {
            teclado.close();
        }
        
        System.out.println("Programa finalizado.");
    }
}

