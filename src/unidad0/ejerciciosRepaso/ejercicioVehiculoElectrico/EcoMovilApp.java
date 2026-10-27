package unidad0.ejerciciosRepaso.ejercicioVehiculoElectrico;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EcoMovilApp {

	static List<VehiculoElectrico> misVehiculos = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	static int contaBicis;
	static int contaPatin;
	static int contaCoches;
	
	public static void agregarBicicleta() {
		
		if (contaBicis<=5) {
			System.out.println("Introduce la marca: ");
			String marca = sc.nextLine();
			
			System.out.println("Introduce el modelo: ");
			String modelo = sc.nextLine();
			
			System.out.println("Introduce la autonomía: ");
			int autonomia = sc.nextInt();
			sc.nextLine();
			
			System.out.println("¿Tiene pedales? true/false");
			boolean pedales = sc.nextBoolean();
			sc.nextLine();
			
			BicicletaElectrica miBici = new BicicletaElectrica(marca, modelo, autonomia, pedales);
			misVehiculos.add(miBici);
			contaBicis++;
			
			System.out.println("Bicicleta añadida correctamente.");
		}else {
			System.err.println("Ya has introducido 5 bicicletas eléctricas, no se pueden añadir más.");
		}
		
	}
	
	public static void agregarPatinete() {
		
		if (contaPatin<=5) {
			System.out.println("Introduce la marca: ");
			String marca = sc.nextLine();
			
			System.out.println("Introduce el modelo: ");
			String modelo = sc.nextLine();
			
			System.out.println("Introduce la autonomía: ");
			int autonomia = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Introduce la potencia de motor en W: ");
			int potencia = sc.nextInt();
			sc.nextLine();
			
			PatineteElectrico miPatin = new PatineteElectrico(marca, modelo, autonomia, potencia);
			misVehiculos.add(miPatin);
			contaPatin++;
			
			System.out.println("Patinete añadido correctamente.");
		}else {
			System.err.println("Ya has introducido 5 patinetes eléctricos, no se pueden añadir más.");
		}
	}
	public static void agregarCoche() {
		
		if (contaCoches<=5) {
			System.out.println("Introduce la marca: ");
			String marca = sc.nextLine();
			
			System.out.println("Introduce el modelo: ");
			String modelo = sc.nextLine();
			
			System.out.println("Introduce la autonomía: ");
			int autonomia = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Introduce el numero de plazas: ");
			int plazas = sc.nextInt();
			sc.nextLine();
			
			CocheElectrico miCoche = new CocheElectrico(marca, modelo, autonomia, plazas);
			misVehiculos.add(miCoche);
			contaCoches++;
			
			System.out.println("Coche añadido correctamente.");
		}else {
			System.err.println("Ya has introducido 5 coches eléctricos, no se pueden añadir más.");
		}
	}
	
	public static void mostrarVehiculos() {
		
		Iterator<VehiculoElectrico> it = misVehiculos.iterator();
		
		System.out.println("--- Vehículos registrados ---\n");
		
		while (it.hasNext()) {
			
			/*if (it.next() instanceof BicicletaElectrica) {
				BicicletaElectrica miBici = (BicicletaElectrica)it.next();
				miBici.mostrarInformacion();
			}else if (it.next() instanceof PatineteElectrico) {
				PatineteElectrico miPatin = (PatineteElectrico)it.next();
				miPatin.mostrarInformacion();
			}else if (it.next() instanceof CocheElectrico) {
				CocheElectrico miCoche = (CocheElectrico)it.next();
				miCoche.mostrarInformacion();
			}**/
			it.next().mostrarInformacion();
			
		}
	}
	
	public static void cargarVehiculos() {
		
		Iterator<VehiculoElectrico> it = misVehiculos.iterator();
		
		while (it.hasNext()) {
			VehiculoElectrico vehiculoElectrico = it.next();
			vehiculoElectrico.cargar();
		}
	}
	public static void main(String[] args) {

		int opcion;
		contaBicis =0;
		contaPatin=0;
		contaCoches=0;
		
		System.out.println("Bienvenido a la aplicacion EcoMovilApp.");
		System.out.println();
		
		do {
			System.out.println("=== MENÚ ECO-MOVIL ===");
			System.out.println("1. Agregar una bicicleta eléctrica.");
			System.out.println("2. Agregar un patinete eléctrico.");
			System.out.println("3. Agregar un coche eléctrico.");
			System.out.println("4. Mostrar todos los vehículos registrados.");
			System.out.println("5. Cargar todos los vehículos.");
			System.out.println("6. Salir del programa.");
			opcion = sc.nextInt();
			sc.nextLine();
			
			switch (opcion) {
			case 1:
				agregarBicicleta();
				break;
			case 2: 
				agregarPatinete();
				break;
			case 3: 
				agregarCoche();
				break;
			case 4:
				mostrarVehiculos();
				break;
			case 5:
				cargarVehiculos();
				break;
			case 6:
				System.out.println("Has elegido salir.");
				break;
			}
		} while (opcion!=6);
	}

}
