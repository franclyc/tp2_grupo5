package ar.edu.unju.escmi.tp2.ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {
        int dni = 40123456;
        char letraEjemplar = 'A';
        int edadMadre = 55;
        String nombreProcer = "Santiago Urzagaste";
        int numeroBingo = 47;
        double precioCelular = 350000.50;
        double estatura = 1.78;
        double pesoMascota = 8.5;
        java.time.LocalDate inicioCuatrimestre = java.time.LocalDate.of(2026, 8, 14);
        java.time.LocalDate finCuatrimestre = java.time.LocalDate.of(2026, 11, 25);

        System.out.println("DNI: " + dni);
        System.out.println("Letra ejemplar: " + letraEjemplar);
        System.out.println("Edad de mi madre: " + edadMadre);
        System.out.println("Prócer: " + nombreProcer);
        System.out.println("Número de bingo: " + numeroBingo);
        System.out.println("Precio del celular: $" + precioCelular);
        System.out.println("Mi estatura: " + estatura + " m");
        System.out.println("Peso de mi mascota: " + pesoMascota + " kg");
        System.out.println("Inicio del 2do cuatrimestre: " + inicioCuatrimestre);
        System.out.println("Fin del 2do cuatrimestre: " + finCuatrimestre);
    }
}
