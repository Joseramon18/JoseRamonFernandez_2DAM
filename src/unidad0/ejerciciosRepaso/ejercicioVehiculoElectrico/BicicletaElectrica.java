package unidad0.ejerciciosRepaso.ejercicioVehiculoElectrico;

public class BicicletaElectrica extends VehiculoElectrico {

	private boolean tienePedales;

	public BicicletaElectrica(String marca, String modelo, int autonomia, boolean tienePedales) {
		super(marca, modelo, autonomia);
		this.tienePedales = tienePedales;
	}
	
	public void mostrarInformacion() {
		System.out.println("[BICICLETA ELÉCTRICA]");
		super.mostrarInformacion();
		System.out.println("¿Tiene pedales? "+tienePedales);
		
		if (tienePedales) {
			System.out.println("Sí tiene pedales.");
		}else {
			System.out.println("No tiene pedales.");
		}
	}
	
	public void cargar() {
		System.out.println("Cargando bicicleta eléctrica...");
	}

}
