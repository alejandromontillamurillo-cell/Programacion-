package Practicas_java;

class MiExepcion extends Exception{
	public MiExepcion(String mensaje) {
		super(mensaje);
		
	}
}

public class Exapcion_2 {
	public static void main (String[]args) {
		try {
			throw new MiExepcion("hola");
			
		}catch (MiExepcion e) {
			System.out.println(e.getMessage());
		}
	}
}
 