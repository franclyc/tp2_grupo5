package ar.edu.unju.escmi.tp2.ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamanio;

		do {
			System.out.print("Ingrese un numero entero entre 5 y 10: ");
			tamanio = sc.nextInt();
		} while (tamanio < 5 || tamanio > 10);

		String[] nombres = new String[tamanio];

		for (int i = 0; i < tamanio; i++) {
			System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
			nombres[i] = sc.next();
		}

		System.out.println("\nContenido del array desde el indice 0:");
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Indice " + i + ": " + nombres[i]);
		}

		System.out.println("\nContenido del array desde la ultima posicion:");
		for (int i = nombres.length - 1; i >= 0; i--) {
			System.out.println("Indice " + i + ": " + nombres[i]);
		}

		sc.close();
	}
}