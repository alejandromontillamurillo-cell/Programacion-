package Ejercicios;

import java.util.Scanner;

public class Prueba_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int edadMinima=18;
		final int precioEntrada=15;
		int edad;
		boolean mayorEdad=false;
		String invitacion;
		
		System.out.println("Introduce tu edad: ");
		edad=sc.nextInt();
		sc.nextLine();
		
		mayorEdad=(edad>=edadMinima);
		
		if(mayorEdad) {
			System.out.println("¿Tienes invitacion?");
			String invitado=sc.nextLine().toLowerCase();
			
			if(invitado.equals("si")) {
				System.out.println("Acceso permitido");
				System.out.println("Entras gratis");
			}else {
				System.out.println("Acceso permitido");
				System.out.println("Tienes que pagar " +precioEntrada+ " $");
			}
		}
		else {
			System.out.println("No puedes entrar, eres menor de eddad");
		}
	}
}
