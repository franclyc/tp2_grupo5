package ar.edu.unju.escmi.tp2.ejercicio15;

import java.util.Scanner;

public class ejercicio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanio;

        do {
            System.out.print("Ingrese el tamaño del arreglo (entre 3 y 10): ");
            tamanio = scanner.nextInt();

            if (tamanio < 3 || tamanio > 10) {
                System.out.println("Error: El número debe estar en el rango [3, 10]. Intente nuevamente.");
            }
        } while (tamanio < 3 || tamanio > 10);

        int[] arreglo = new int[tamanio];

        System.out.println("\n--- Carga de elementos ---");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese el número entero para la posición [" + i + "]: ");
            arreglo[i] = scanner.nextInt();
        }
        int suma = 0;
        System.out.println("\n--- Contenido del arreglo ---");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Posición [" + i + "] = " + arreglo[i]);
            suma += arreglo[i];
        }

        System.out.println("-----------------------------");
        System.out.println("La suma de todos los valores es: " + suma);

        scanner.close();
    }
}