package unidad1.ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LeerPersonas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el nombre del fichero: ");
        String nombreFichero = teclado.nextLine();

        int contadorPersonas = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                if (datos.length >= 3) {
                    System.out.println("Nombre: " + datos[0] + " | Apellidos: " + datos[1] + " | Fecha de Nacimiento: " + datos[2]);
                    contadorPersonas++;
                }
            }
            System.out.println("\nNúmero total de personas: " + contadorPersonas);
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        } finally {
            teclado.close();
        }
    }
}
