package Ejercicios; // Asegúrate de mantener el nombre de tu paquete

import java.util.Scanner;

class PalabraNoValidaException extends Exception {
    public PalabraNoValidaException(String mensaje) {
        super(mensaje);
    }
}

class IdiomaNoValidoException extends Exception {
    public IdiomaNoValidoException(String mensaje) {
        super(mensaje);
    }
}

public class Traductor_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== MINI TRADUCTOR ===");

        // Metemos todo el proceso dentro del try
        try {
            System.out.print("Elige una palabra (hola, adios, buenos dias): ");
            String palabra = sc.nextLine().toLowerCase().trim();
            
            // 1. Validamos la palabra al instante. Si falla, salta directo al catch
            validarPalabra(palabra);

            System.out.print("Elige el idioma de destino (ingles, italiano, aleman): ");
            String idioma = sc.nextLine().toLowerCase().trim();
            
            // 2. Validamos el idioma al instante
            validarIdioma(idioma);

            // 3. Si ambos datos pasaron las validaciones, traducimos
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

    // Método exclusivo para validar la palabra
    public static void validarPalabra(String palabra) throws PalabraNoValidaException {
        if (!palabra.equals("hola") && !palabra.equals("adios") && !palabra.equals("buenos dias")) {
            throw new PalabraNoValidaException("La palabra '" + palabra + "' no está en el diccionario.");
        }
    }

    // Método exclusivo para validar el idioma
    public static void validarIdioma(String idioma) throws IdiomaNoValidoException {
        if (!idioma.equals("ingles") && !idioma.equals("italiano") && !idioma.equals("aleman")) {
            throw new IdiomaNoValidoException("El idioma '" + idioma + "' no está soportado.");
        }
    }

    // Método que solo se encarga de traducir (ya sabe que los datos son correctos)
    public static String traducir(String palabra, String idioma) {
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
        }
        return "";
    }
}
