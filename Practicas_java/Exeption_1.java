package Practicas_java;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Exeption_1 {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int c;
		int a=1;
		int b=0;
		
		try {
		
		c=a/b;
		
		String nombre = null;
		System.out.println(nombre.length());
		
		}catch(ArithmeticException e) {
			System.out.println("Primera: " +e.getMessage());
			
		}catch(Exception e) {
			System.out.println("Segunda: " +e.getMessage());
		}
		System.out.println("¿Llega aquí?");
	}
}
