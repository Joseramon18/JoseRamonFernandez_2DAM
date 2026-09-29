package unidad0.ejerciciosPracticar.ejercicio1_2;

public class TestCoche {

	public static void main(String[] args) {

		Coche coche1 = new Coche("Peugeot", 120);
		
		coche1.mostrarVelocidad();
		coche1.acelerar(80);
		coche1.mostrarVelocidad();
		coche1.acelerar(15);
		coche1.mostrarVelocidad();
	}

}
