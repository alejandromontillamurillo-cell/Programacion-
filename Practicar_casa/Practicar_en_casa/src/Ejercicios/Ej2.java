package Ejercicios;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			final int edadMinima =18;
			boolean esmayorEdad;
			
			System.out.println("Dime tu edad: ");
			int edad=sc.nextInt();
			sc.nextLine();
						
			esmayorEdad=(edad>=edadMinima);	
			
			if (esmayorEdad) {
				
				System.out.println("¿Tienes pase VIP?: ");
				String pase= sc.nextLine().toLowerCase();
				
				if (pase.equals("si")) {
					System.out.println("Bienvenido a la discoteca");
					System.out.println("Estas en la zona VIP");
					
				}else {
					System.out.println("Bienvenido a la discoteca");
					System.out.println("No estas en la zona VIP");
				}				
			}
			else {
				System.out.println("Acceso denegado. Eres menor de edad.");
			}
	}
}
