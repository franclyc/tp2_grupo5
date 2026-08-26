package ar.edu.unju.escmi.tp2.ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int[] numeros=new int[8];
          for (int i=0; i<numeros.length; i++) {
            System.out.print("Ingrese un numero para la posición "+i+": ");
            numeros[i]=scanner.nextInt();
        }
        System.out.println("Valores almacenados:");
        for (int i=0; i<numeros.length; i++) {
           System.out.println("Indice "+i+" - Valor: "+numeros[i]);
        }
        scanner.close();
    }
}