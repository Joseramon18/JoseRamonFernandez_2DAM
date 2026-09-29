package unidad0.ejerciciosPracticar.gestorMensajes;

public class Main {

	public static void main(String[] args) {
		
		Mensaje m = new Mensaje("Fidel", "ihfgh ehfujenhf ehnfje ");
		
		System.out.println(m.mostrar());
		
		Mensaje m2 = new Mensaje("Molina", "Ha sio fidel el de la muleta");
		System.out.println(m2.mostrar());
	}
}
