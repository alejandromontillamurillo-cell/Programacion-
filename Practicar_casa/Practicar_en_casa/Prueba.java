package Examen;

import java.util.Scanner;

public class Prueba {
	
	static  String NormalizaIdentificador(String identificador) {
		String quitarEspacios = identificador.trim();
		String minusculas = quitarEspacios.toLowerCase();
		
		return minusculas;
	}
	static boolean validaIdentificador(String identificador) {
		return identificador.matches("[a-z]{2}[0-9]{2}[a-z]");
	}
	static Integer CalculaPuntuacion(String identificador) {
		// 1. Índices correctos: 2 y 3 (porque empieza en 0)
				char caracter1 = identificador.charAt(2);
				char caracter2 = identificador.charAt(3);
				
				// 2. Conversión obligatoria con Integer.parseInt() pasando el char a String
				int dig1 = Integer.parseInt(String.valueOf(caracter1)); 
				int dig2 = Integer.parseInt(String.valueOf(caracter2)); 
				
				// 3. Cálculo y return del resultado final
				int resultadoTotal = (dig1 * 2) + (dig2 * 3);
				return resultadoTotal;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el identificador del robot (SALIR para terminar): ");
		String usuario = sc.nextLine();
		
		String usuarioLimpio = NormalizaIdentificador(usuario);
		
		// 2. Después validamos ese texto ya limpio
		if (validaIdentificador(usuarioLimpio)) {
			System.out.println("Etiqueta: " + usuarioLimpio);
		} else {
			System.out.println("ERROR: El identificador debe tener 2 letras, 2 números y 1 letra (ej: ab12c).");
		}
		Integer resultado = CalculaPuntuacion(usuarioLimpio);
		System.out.println("Etiqueta transformada: " +usuarioLimpio);
	}
}
