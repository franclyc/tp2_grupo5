package ar.edu.unju.escmi.tp2.ejercicio5;

public class Ejercicio5 {
     public static void main(String[] args) {
        int a = 8, b = 3, c = -5;

        int r1 = a + b + c;
        int r2 = 2 * b + 3 * (a - c);
        double r3 = (double) a / b;
        int r4 = a % b;
        double r5 = (double) a / c;
        int r6 = a % c;
        int r7 = a * b / c;
        double r8 = a * ((double) b / c);
        int r9 = (a * c) % b;
        int r10 = a * (c % b);
        int r11 = (3 * a - 2 * b) % (2 * a - c);
        int r12 = 2 * (a / 5 + (4 - b * 3)) % (a + c - 2);
        double r13 = (double) ((a - 3 * b) % (c + 2 * a)) / (a - c);
        int r14 = a - b - c * 2;

        System.out.println("a) a+b+c = " + r1);
        System.out.println("b) 2b+3(a-c) = " + r2);
        System.out.println("c) a/b = " + r3);
        System.out.println("d) a%b = " + r4);
        System.out.println("e) a/c = " + r5);
        System.out.println("f) a%c = " + r6);
        System.out.println("g) a*b/c = " + r7);
        System.out.println("h) a*(b/c) = " + r8);
        System.out.println("i) (a*c)%b = " + r9);
        System.out.println("j) a*(c%b) = " + r10);
        System.out.println("k) (3a-2b)%(2a-c) = " + r11);
        System.out.println("l) 2*(a/5+(4-b*3))%(a+c-2) = " + r12);
        System.out.println("m) (a-3b)%(c+2a)/(a-c) = " + r13);
        System.out.println("n) a-b-c*2 = " + r14);
}
}
