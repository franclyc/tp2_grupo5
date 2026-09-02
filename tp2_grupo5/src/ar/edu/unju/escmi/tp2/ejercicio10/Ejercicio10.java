package ar.edu.unju.escmi.tp2.ejercicio10;

public class Ejercicio10 {
	public static void main(String[] args) {
		int a = 7, b = 5, c = -14;

		boolean r1 = a > 3;
		boolean r2 = a > c;
		boolean r3 = a < c;
		boolean r4 = b < c;
		boolean r5 = b != c;
		boolean r6 = a == 3;
		boolean r7 = a * b == 15;
		boolean r8 = a * b == -30;
		boolean r9 = c / b < a;
		boolean r10 = c / b == -10;
		boolean r11 = c / b == -4;
		boolean r12 = a + b + c == 5;
		boolean r13 = (a + b == 8) && (a - b == 2);
		boolean r14 = (a + b == 8) || (a - b == 6);
		boolean r15 = a > 3 && b > 3 && c < 3;
		boolean r16 = a > 3 && b >= 3 && c < -3;

		System.out.println("a) a > 3 -> " + r1);
		System.out.println("b) a > c -> " + r2);
		System.out.println("c) a < c -> " + r3);
		System.out.println("d) b < c -> " + r4);
		System.out.println("e) b != c -> " + r5);
		System.out.println("f) a == 3 -> " + r6);
		System.out.println("g) a * b == 15 -> " + r7);
		System.out.println("h) a * b == -30 -> " + r8);
		System.out.println("i) c / b < a -> " + r9);
		System.out.println("j) c / b == -10 -> " + r10);
		System.out.println("k) c / b == -4 -> " + r11);
		System.out.println("l) a + b + c == 5 -> " + r12);
		System.out.println("m) (a+b==8) && (a-b==2) -> " + r13);
		System.out.println("n) (a+b==8) || (a-b==6) -> " + r14);
		System.out.println("o) a>3 && b>3 && c<3 -> " + r15);
		System.out.println("p) a>3 && b>=3 && c<-3 -> " + r16);
	}
}
