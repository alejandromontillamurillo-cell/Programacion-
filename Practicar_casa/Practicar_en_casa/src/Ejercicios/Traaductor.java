package Ejercicios;

import java.util.Scanner;

// Excepción personalizada para palabras no válidas
class PalabraNoValidaException extends Exception {
    public PalabraNoValidaException(String mensaje) {
        super(mensaje);
    }
}

// Excepción personalizada para idiomas no válidos
class IdiomaNoValidoException extends Exception {
    public IdiomaNoValidoException(String mensaje) {
        super(mensaje);
    }
}

public class Traaductor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Mostramos las opciones al iniciar
        System.out.println("=== MINI TRADUCTOR ===");
        System.out.print("Elige una palabra (hola, adios, buenos dias): ");
        String palabra = sc.nextLine().toLowerCase().trim();

        System.out.print("Elige el idioma de destino (ingles, italiano, aleman): ");
        String idioma = sc.nextLine().toLowerCase().trim();

        try {
            String traduccion = traducir(palabra, idioma);
            System.out.println("Traducción: " + traduccion);
        } catch (PalabraNoValidaException e) {
            System.out.println("Error de palabra: " + e.getMessage());
        } catch (IdiomaNoValidoException e) {
            System.out.println("Error de idioma: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado. Fin del programa.");
        } finally {
            sc.close();
        }
    }

    public static String traducir(String palabra, String idioma) throws PalabraNoValidaException, IdiomaNoValidoException {
        
        // 1. Validamos primero el idioma para lanzar su excepción si no existe
        if (!idioma.equals("ingles") && !idioma.equals("italiano") && !idioma.equals("aleman")) {
            throw new IdiomaNoValidoException("El idioma '" + idioma + "' no está soportado.");
        }

        // 2. Evaluamos la palabra y devolvemos su traducción según el idioma
        switch (palabra) {
            case "hola":
                switch (idioma) {
                    case "ingles": return "Hello";
                    case "italiano": return "Ciao";
                    case "aleman": return "Hallo";
                }
                break;

            case "adios":
                switch (idioma) {
                    case "ingles": return "Goodbye";
                    case "italiano": return "Arrivederci";
                    case "aleman": return "Auf Wiedersehen";
                }
                break;

            case "buenos dias":
                switch (idioma) {
                    case "ingles": return "Good morning";
                    case "italiano": return "Buongiorno";
                    case "aleman": return "Guten Morgen";
                }
                break;

            default:
                // Si la palabra no coincide con ninguna de las 3, lanzamos la otra excepción
                throw new PalabraNoValidaException("La palabra '" + palabra + "' no está en el diccionario.");
        }
        
        return "";
    }
}