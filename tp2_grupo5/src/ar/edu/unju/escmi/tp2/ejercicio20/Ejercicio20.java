package ar.edu.unju.escmi.tp2.ejercicio20;

public class Ejercicio20 {
    public static void main(String[] args) {
        String textoOriginal = "Hoja";
        String textoModificado = textoOriginal.replace("ja", "la");

        System.out.println("Texto original: " + textoOriginal);
        System.out.println("Texto modificado: " + textoModificado);
    }
}

// El valor de texto original no cambia despues de utilizar el metodo replace ya que el tipo de dato string 
//en java son inmutables , es decir que cuando llamamos al metodo replace , no modifica la cadena original sino que crea una cadena nueva con el valor 
//modificado y la retorna. Por lo tanto, el valor de textoOriginal permanece igual a "Hoja" mientras que textoModificado 
//contiene el valor "Hola".