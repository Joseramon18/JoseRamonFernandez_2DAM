package unidad0.ejerciciosRepaso.ejercicioVehiculoElectrico;

public class VehiculoElectrico {

	private String marca;
	private String modelo;
	private int autonomia;

	public VehiculoElectrico(String marca, String modelo, int autonomia) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.autonomia = autonomia;
	}

	
	public void mostrarInformacion() {
		System.out.println("[marca=" + marca + ", modelo=" + modelo + ", autonomia=" + autonomia + "]");
	}
	
	public void cargar() {
		System.out.println("Cargando vehículo eléctrico...");
	}
	
}
