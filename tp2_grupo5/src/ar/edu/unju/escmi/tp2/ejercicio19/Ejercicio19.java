package ar.edu.unju.escmi.tp2.ejercicio19;

public class Ejercicio19 {

    public static void main(String[] args) {

        String texto1 = "Hola";
        String texto2 = "Hola";

        System.out.println(
                "texto1 == texto2: "
                + (texto1 == texto2)
        );

        System.out.println(
                "texto1.equals(texto2): "
                + texto1.equals(texto2)
        );

        String texto3 = new String("Hola");

        System.out.println(
                "texto1 == texto3: "
                + (texto1 == texto3)
        );

        System.out.println(
                "texto1.equals(texto3): "
                + texto1.equals(texto3)
        );

        System.out.println("\nRespuestas:");

        System.out.println(
                "1. texto1 == texto2 devuelve true porque ambos "
                + "son cadenas literales con el mismo contenido y "
                + "Java reutiliza el mismo objeto del String Pool."
        );

        System.out.println(
                "2. texto1 == texto3 devuelve false porque texto3 "
                + "fue creado con new String(), creando un objeto "
                + "diferente. Por eso las referencias no son iguales."
        );

        System.out.println(
                "3. equals() compara el contenido de los objetos String. "
                + "Por eso texto1.equals(texto3) devuelve true, ya que "
                + "ambos contienen la palabra Hola."
        );
    }
}