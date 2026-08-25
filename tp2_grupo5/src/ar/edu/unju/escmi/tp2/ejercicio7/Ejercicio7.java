package ar.edu.unju.escmi.tp2.ejercicio7;

public class Ejercicio7 {

    public static void main(String[] args) {
        
        int a = 30;
        double b = 1.5;

        System.out.println(a++);// Muestra 30, luego 'a' vale 31

        System.out.println(a);// Muestra 31

        System.out.println(--a);// Resta 1, 'a' pasa a ser 30 y muestra 30

        System.out.println(++b);// Suma 1, 'b' pasa a ser 2.5 y muestra 2.5

        System.out.println(b--);// Muestra 2.5, luego 'b' pasa a ser 1.5

        System.out.println(b); // Muestra 1.5
    }
}