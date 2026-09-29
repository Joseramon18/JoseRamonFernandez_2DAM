package unidad0.ejerciciosPracticar.ejercicioLibro;

public class Descuento {

	public static double calcularPrecioConDescuento(double precio, double porcentaje) {
		
		return Math.round(precio= precio-(precio*porcentaje/100));
		
	}
}
