package Ejercicios;

import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int alturaMinima= 140;
		int altura;
			
			System.out.println("Dime tu altura en centimetros: ");
			altura=sc.nextInt();
			
			if(altura>=alturaMinima) {
				System.out.println("¡Acceso permitido! Disfruta de la atracción.");
			}
			else {
				System.out.println("Acceso denegado. Eres demasiado bajo.");
			}
	}      
}
