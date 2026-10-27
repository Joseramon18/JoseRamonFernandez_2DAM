package unidad0.ejerciciosRepaso.ejercicioVehiculoElectrico;

public class CocheElectrico extends VehiculoElectrico {

	private int numeroPlazas;

	public CocheElectrico(String marca, String modelo, int autonomia, int numeroPlazas) {
		super(marca, modelo, autonomia);
		this.numeroPlazas = numeroPlazas;
	}
	
	@Override
	public void mostrarInformacion() {
		System.out.println("[COCHE ELÉCTRICO]");
		super.mostrarInformacion();
		System.out.println("Número de plazas: "+numeroPlazas);
	}
	
	@Override
	public void cargar() {
		// TODO Auto-generated method stub
		System.out.println("Cargando coche eléctrico...");
	}
}
