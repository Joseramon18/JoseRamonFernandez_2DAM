package unidad0.ejerciciosRepaso;

import java.util.Scanner;

public class EjercicioA {
	 
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		String frase;
		
		System.out.println("Introduzca una frase: ");
		frase= sc.nextLine();
		
		System.out.println("Longitud de la frase: "+frase.length());
		System.out.println("Primera y ultima letra de la frase: "+frase.charAt(0)+", "+frase.charAt(frase.length()-1));
		System.out.println("Frase en mayúscula: "+frase.toUpperCase());
		System.out.println("Número de palabras: "+frase.split(" ").length);
		System.out.println(new StringBuilder(frase).reverse().toString());
		
	}
}
