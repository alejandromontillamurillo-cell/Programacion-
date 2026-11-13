package Ejercicios;

import java.util.Scanner;

public class Ej4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int contrasenaCorrecta=1234;
		int contrasena;
			int intentos=3;
		
		System.out.println("Introduce la contraseña de la caja fuerte, la clave son 4 digitos: ");
		contrasena=sc.nextInt();
		sc.nextLine();
		
		while (contrasena != contrasenaCorrecta && intentos>1) {
			intentos--;
			
			System.out.println("Contraseña incorrecta. Te quedan " +intentos+ " intentos.");
			System.out.println("Intentalo de nuevos: ");
			contrasena=sc.nextInt();
			

			}
		 if (contrasena == contrasenaCorrecta) {
	            System.out.println("¡Contraseña correcta! Accediendo a tu cuenta...");
	        } else {
	            System.out.println("Se te acabaron los intentos. Tarjeta bloqueada.");
	        }				
		}
	}		
