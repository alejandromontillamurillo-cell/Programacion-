package Practicas_java;

import java.util.Scanner;

class DivisionPorCeroException extends Exception {
 	 public DivisionPorCeroException(String mensaje) {
	     super(mensaje);
	 }
}
class RestaNegativaException extends Exception {
	 public RestaNegativaException(String mensaje) {
	     super(mensaje);
	 }
}

public class Tarea {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Introduce el primer número: ");
     double num1 = sc.nextDouble();

     System.out.print("Introduce el segundo número: ");
     double num2 = sc.nextDouble();

     System.out.print("Elige operación (+, -, *, /): ");
     char operacion = sc.next().charAt(0);

     try {
         double resultado = calcular(num1, num2, operacion);
         System.out.println("Resultado: " + resultado);
     } catch (DivisionPorCeroException e) {
         System.out.println("Error: " + e.getMessage());
     } catch (RestaNegativaException e) {
         System.out.println("Error: " + e.getMessage());
     }catch (Exception e) {
         System.out.println("Fin del programa.");
     }

     sc.close();
 }

 public static double calcular(double a, double b, char op) throws DivisionPorCeroException,RestaNegativaException {
     switch (op) {
         case '+': return a + b;
         case '-':
        	 
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