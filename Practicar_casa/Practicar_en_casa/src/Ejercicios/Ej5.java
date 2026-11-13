package Ejercicios;

public class Ej5 {
	public static void main(String[] args) {
	final int TAMANIO = 5;
	
	for (int i = 0; i < TAMANIO; i++) {
		for (int j = 0; j < TAMANIO; j++) {			
		
		if(i == 0 || j == 0) {
			System.out.print("*");
			
			}else {
				System.out.print(" ");
			}
		   }
		System.out.println();
		}
	}
}
