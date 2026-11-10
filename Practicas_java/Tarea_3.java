package Practicas_java;

import java.util.Scanner;

class PalabraDescException extends Exception {
 	 public PalabraDescException(String mensaje) {
	     super(mensaje);
	 }
}
class IdiomaDescException extends Exception {
	 public IdiomaDescException(String mensaje) {
	     super(mensaje);
	 }
}

public class Tarea_3 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Introduce un idioma: ");
     String idioma = sc.next();

     System.out.print("Introduce el segundo número: ");
     String palabra = sc.next();


     System.out.print("Elige idioma 1,2,3(Español,Ingles,Italiano): ");
     int opcion = sc.next().charAt(0);

     try {
         double resultado = calcular(idioma, palabra, opcion);
         System.out.println("Resultado: " + resultado);
     } catch (DivisionPorCeroException e) {
         System.out.println("Error: " + e.getMessage());
     } catch (RestaNegativaException e) {
         System.out.println("Error: " + e.getMessage());
     }catch (Exception e) {
         System.out.println("Operación no válida.");
     }

     sc.close();
 }

 public static String calcular(String idioma, String palabra, int opcion) throws DivisionPorCeroException,RestaNegativaException {
     switch (opcion) {
         case "Español": return idioma;
         case "Ingles": return idioma;
         case "Italiano": return idioma;
        	 
        	 if (b > a) {
                 throw new RestaNegativaException("No se le puede restar un numero mas grande a un numero mas chico.");
             }
             return a-b;
        	 
         case '*': return a * b;
         case '/':
        	 
        	 if (b == 0) {
                 throw new DivisionPorCeroException("No se puede dividir entre cero.");
             }
        	 return a / b;
             
         default:
             throw new IllegalArgumentException("Operación desconocida.");
     }
 }
}