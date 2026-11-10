package Practicas_java;

import java.util.Scanner;

public class Tarea_2 {
	public static double sumar(double num1, double num2) {
        return num1 + num2;
    }
	
    public static double restar(double num1, double num2) {
    	if (num2 > num1) {
    		throw new ArithmeticException("No se puede restar");
    	}
    	return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return num1 / num2;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("CALCULADORA");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        System.out.print("Elige una opción: ");
        int opcion = teclado.nextInt();

        System.out.print("Introduce el primer número: ");
        double num1 = teclado.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = teclado.nextDouble();

        try {
            switch (opcion) {

                case 1:
                    System.out.println("Resultado: " + sumar(num1, num2));
                    break;

                case 2:
                    System.out.println("Resultado: " + restar(num1, num2));
                    break;

                case 3:
                    System.out.println("Resultado: " + multiplicar(num1, num2));
                    break;

                case 4:
                    System.out.println("Resultado: " + dividir(num1, num2));
                    break;
                    
                default:
                    System.out.println("Opción no válida");
            }

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        teclado.close();
    }
}

