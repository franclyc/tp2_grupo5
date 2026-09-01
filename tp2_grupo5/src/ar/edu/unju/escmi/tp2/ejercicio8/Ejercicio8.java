package ar.edu.unju.escmi.tp2.ejercicio8;

public class Ejercicio8 {
	public static void main(String[] args) {
		int a = 5, b = 10, c = 2, d = 6;

		System.out.println("Valores antes de aplicar los operadores:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);

		a += 5;
		b -= 2;
		c *= 3;
		d /= 2;

		System.out.println("\nValores despues de aplicar los operadores:");
		System.out.println("a += 5  -> a = " + a);
		System.out.println("b -= 2  -> b = " + b);
		System.out.println("c *= 3  -> c = " + c);
		System.out.println("d /= 2  -> d = " + d);
	}
}
