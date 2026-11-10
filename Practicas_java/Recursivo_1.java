package Practicas_java;

import java.util.Scanner;

public class Recursivo_1 {
	
	public static long contador (int n) {
		if (n < 10) {
			return 1;
		}
		
		return 1 + contador(n/10);
	}
	
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Introduce un numero y te digo cuantas cifras tiene: ");
	int n = sc.nextInt();
	
	
	System.out.println("Numero de digitos: " +contador(n));
	
	}
}
