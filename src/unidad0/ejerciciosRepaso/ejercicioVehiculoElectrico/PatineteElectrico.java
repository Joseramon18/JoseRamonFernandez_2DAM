package unidad0.ejerciciosRepaso.ejercicioVehiculoElectrico;

public class PatineteElectrico extends VehiculoElectrico {

	private int potenciaMotor;

	public PatineteElectrico(String marca, String modelo, int autonomia, int potenciaMotor) {
		super(marca, modelo, autonomia);
		this.potenciaMotor = potenciaMotor;
	}
	
	@Override
	public void mostrarInformacion() {
		System.out.println("[PATINETE ELÉCTRICO]");
		super.mostrarInformacion();
		System.out.println("Potencia: "+potenciaMotor+" W.");
	}
	
	@Override
	public void cargar() {
		// TODO Auto-generated method stub
		System.out.println("Cargando patinete eléctrico...");
	}
}
