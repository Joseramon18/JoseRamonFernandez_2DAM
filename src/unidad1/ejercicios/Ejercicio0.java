package unidad1.ejercicios;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class Ejercicio0 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- MENÚ DE GESTIÓN DE ARCHIVOS (NIO.2) ---");
            System.out.println("1. Mostrar la ruta absoluta de la carpeta actual");
            System.out.println("2. Mostrar información de un fichero o carpeta (Existe, Tipo, Fecha, Tamaño)");
            System.out.println("3. Mostrar el contenido de una carpeta");
            System.out.println("4. Crear una carpeta en la ruta por defecto");
            System.out.println("5. Crear un fichero en la ruta por defecto");
            System.out.println("6. Renombrar un fichero");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            
            try {
                opcion = Integer.parseInt(scanner.nextLine());
                switch (opcion) {
                    case 1 -> mostrarRutaActual();
                    case 2 -> mostrarInformacion();
                    case 3 -> mostrarContenidoCarpeta();
                    case 4 -> crearCarpeta();
                    case 5 -> crearFichero();
                    case 6 -> renombrarFichero();
                    case 0 -> System.out.println("¡Hasta luego!");
                    default -> System.out.println("Opción no válida. Inténtalo de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduce un número válido.");
                opcion = -1;
            }
        } while (opcion != 0);
    }

    
    private static void mostrarRutaActual() {
        Path rutaActual = Paths.get("").toAbsolutePath();
        System.out.println("Ruta absoluta de la carpeta actual:\n-> " + rutaActual);
    }

   
    private static void mostrarInformacion() {
        System.out.print("Introduce la ruta del fichero o carpeta: ");
        String entrada = scanner.nextLine();
        Path ruta = Paths.get(entrada);

        if (!Files.exists(ruta)) {
            System.out.println("El elemento introducido NO existe.");
            return;
        }

        System.out.println("Existe: SÍ");
        System.out.println("Tipo: " + (Files.isDirectory(ruta) ? "Carpeta" : "Fichero"));

        try {
            BasicFileAttributes atributos = Files.readAttributes(ruta, BasicFileAttributes.class);
            System.out.println("Última modificación: " + atributos.lastModifiedTime());
            System.out.println("Tamaño: " + atributos.size() + " bytes");
        } catch (IOException e) {
            System.out.println("Error al leer los atributos: " + e.getMessage());
        }
    }

    
    private static void mostrarContenidoCarpeta() {
        System.out.print("Introduce la ruta de la carpeta que quieres listar: ");
        String entrada = scanner.nextLine();
        Path ruta = Paths.get(entrada);

        if (!Files.exists(ruta)) {
            System.out.println("Error: La ruta introducida no existe.");
            return;
        }
        if (!Files.isDirectory(ruta)) {
            System.out.println("Error: La ruta introducida no corresponde a una carpeta.");
            return;
        }

        System.out.println("Contenido de la carpeta " + ruta.toAbsolutePath() + ":");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(ruta)) {
            boolean vacia = true;
            for (Path entradaStream : stream) {
                vacia = false;
                String tipo = Files.isDirectory(entradaStream) ? "[CARPETA]" : "[FICHERO]";
                System.out.println("  " + tipo + " " + entradaStream.getFileName());
            }
            if (vacia) {
                System.out.println("  (La carpeta está vacía)");
            }
        } catch (IOException e) {
            System.out.println("Error al leer el contenido: " + e.getMessage());
        }
    }


    private static void crearCarpeta() {
        System.out.print("Introduce el nombre de la nueva carpeta: ");
        String nombreCarpeta = scanner.nextLine();
        Path nuevaRuta = Paths.get(nombreCarpeta);

        if (Files.exists(nuevaRuta)) {
            System.out.println("Error: Ya existe un fichero o carpeta con ese nombre.");
            return;
        }

        try {
            Files.createDirectory(nuevaRuta);
            System.out.println("Carpeta creada con éxito en: " + nuevaRuta.toAbsolutePath());
        } catch (IOException e) {
            System.out.println("No se pudo crear la carpeta: " + e.getMessage());
        }
    }

    
    private static void crearFichero() {
        System.out.print("Introduce el nombre del nuevo fichero (con extensión si aplica): ");
        String nombreFichero = scanner.nextLine();
        Path nuevaRuta = Paths.get(nombreFichero);

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

    private static void renombrarFichero() {
        System.out.print("Introduce la ruta del fichero original: ");
        String rutaOriginalInput = scanner.nextLine();
        Path rutaOriginal = Paths.get(rutaOriginalInput);

        if (!Files.exists(rutaOriginal) || Files.isDirectory(rutaOriginal)) {
            System.out.println("Error: El fichero original no existe o es una carpeta.");
            return;
        }

        System.out.print("Introduce el NUEVO nombre para el fichero: ");
        String nuevoNombre = scanner.nextLine();
        
      
        Path rutaNueva = rutaOriginal.resolveSibling(nuevoNombre);

        if (Files.exists(rutaNueva)) {
            System.out.println("Error: El nuevo nombre ya está en uso por otro fichero o carpeta.");
            return;
        }

        try {
            Files.move(rutaOriginal, rutaNueva);
            System.out.println("Fichero renombrado con éxito a: " + rutaNueva.getFileName());
        } catch (IOException e) {
            System.out.println("Error al renombrar el fichero: " + e.getMessage());
        }
    }
}
