package Ejercicios;

import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int contrasenaCorrecta=1234;
		int contrasena;
		
		System.out.println("Introduce la contraseña de la caja fuerte, la clave son 4 digitos: ");
		contrasena=sc.nextInt();
		sc.nextLine();
		
		while (contrasena != contrasenaCorrecta) {
			System.out.println("Contraseña incorrecta. Inténtalo de nuevo: ");
			contrasena=sc.nextInt();									
			}
		System.out.println("¡Contraseña correcta! Accediendo a tu cuenta...");
		}		
	}

