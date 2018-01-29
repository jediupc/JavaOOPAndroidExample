package com.example.hermes.myapplication;

/**
 * Created by marcos on 24/01/2016.
 */
public class Directivo extends Trabajador {

    public Directivo(String nombre, Double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    @Override
    Double sueldoNeto() {
        return this.sueldo - this.sueldo * 2.0 / 100;
    }
}
