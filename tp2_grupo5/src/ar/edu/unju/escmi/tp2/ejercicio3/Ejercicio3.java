package ar.edu.unju.escmi.tp2.ejercicio3;

public class Ejercicio3 {

    public static final String CODIGO_POSTAL_JUJUY = "Y4600";
    public static final double PI = 3.1415926535;
    public static final int DIAS_SEMANA = 7;
    public static final int MESES_ANIO = 12;

    public static void main(String[] args) {
        System.out.println("Código postal de Jujuy: " + CODIGO_POSTAL_JUJUY);
        System.out.println("Valor matemático de PI: " + PI);
        System.out.println("Cantidad de días de la semana: " + DIAS_SEMANA);
        System.out.println("Cantidad de meses que tiene un año: " + MESES_ANIO);
    }
    {
        /*RESPUESTA: Como en este ejercicio tenemos declarado el método 'public static void main',
no hace falta utilizar 'static final' para las constantes cuando solamente las vamos a utilizar
dentro del método main.

Las constantes que se crean dentro de un método son consideradas constantes locales.
Estas solamente están disponibles mientras dicho método se encuentra en ejecución y no pueden
ser utilizadas desde fuera del mismo.

En cambio, si las constantes fueran declaradas fuera del método main, sería necesario utilizar
'static final', ya que main es un método 'static' y necesita que las variables que utiliza desde
la clase también sean estáticas.
*/}

}
