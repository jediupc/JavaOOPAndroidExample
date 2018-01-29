package com.example.hermes.myapplication;

/**
 * Created by marcos on 24/01/2016.
 */
public class Main {
    public static void main(String[] args) {
        Becario becario = new Becario("Mike", 500.0);
        Consultor consultor = new Consultor("Patrick", 1600.0);
        Directivo directivo = new Directivo("Ernest", 4000.0);

        System.out.println("Becario " + becario.nombre + " sueldo neto " + becario.sueldoNeto());
        System.out.println("Consultor " + consultor.nombre + " sueldo neto " + consultor.sueldoNeto());
        System.out.println("Directivo " + directivo.nombre + " sueldo neto " + directivo.sueldoNeto());
    }
}
