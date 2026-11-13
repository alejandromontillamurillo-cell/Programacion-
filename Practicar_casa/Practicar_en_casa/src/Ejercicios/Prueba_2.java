package Ejercicios;

import java.util.Scanner;

public class Prueba_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int numeroSecreto=7;
		int maxVidas=4;
		int numero;
		
		int sumaNumeros = 0;
		int numerosEscritos=0;
		
		System.out.println("Dime un numero, si lo aciertas ganas, tienes 4 vidas: ");
		numero=sc.nextInt();
		sc.nextLine();
		
		sumaNumeros += numero;
		numerosEscritos++;
		
		while (numero != numeroSecreto && maxVidas>1) {
			maxVidas--;
			System.out.println("Este no es el numero, te quedan " +maxVidas+ " vidas.");
	
			System.out.println("Intentalo de nuevo: ");
			numero=sc.nextInt();
	
			
			sumaNumeros += numero;
			numerosEscritos++;
		}
		if(numero == numeroSecreto) {
			System.out.println("¡Felicidades! Has ganado el premio de la feria.");	
		}
		else {
			System.out.println("Te quedastes sin vidas, el numero era el " +numeroSecreto);

		}
		System.out.println("Metistes " +numerosEscritos+ " numeros.");
	
		System.out.println("La suma de todos los numeros que metistes da " +sumaNumeros);

		
		double media=(double)sumaNumeros/numerosEscritos;
		System.out.println("La media de la suma de los numeros que metistes es " +media);
	}
}
