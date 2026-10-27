package unidad1.ejemplos;

import java.io.*;

public class CopiadorImagen {
    public static void main(String[] args) {
        try (InputStream entrada = new BufferedInputStream(new FileInputStream("catalogo/image_98e4e623.jpg"));
             OutputStream salida  = new BufferedOutputStream(new FileOutputStream("/home/diurno/Descargas/image_98e4e623_copia.jpg"))) {

            byte[] buffer = new byte[4096]; // bloques de 4 KB
            int bytesLeidos;
            while ((bytesLeidos = entrada.read(buffer)) != -1) {
                salida.write(buffer, 0, bytesLeidos);
            }
            System.out.println("Imagen copiada correctamente.");

        } catch (IOException e) {
            System.err.println("Error al copiar la imagen: " + e.getMessage());
        }
    }
}