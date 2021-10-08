package com.example.ejercicio3;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import javax.swing.JFormattedTextField;

public class Lectura {
    static long FECHA[] = {1288122023000L, 1288122023000L, 1288122223000L, 1288122223000L, 1288122223000L, 1288122623000L, 1288122623000L, 1288122623000L};
    static String HABITACION[] = {"cocina", "baño", "cocina", "baño", "comedor", "cocina", "baño", "comedor"};
    static int TEMPERATURA[] = {18, 19, 17, 19, 17, 19, 22, 22};


    private long tiempo;
    private String habitacion;
    private int temperatura;
//constructor

    public Lectura(long tiempo, String habitacion, int temperatura) {
        this.tiempo = tiempo;
        this.habitacion = habitacion;
        this.temperatura = temperatura;
    }

    //getter y setter


    public long getTiempo() {
        return tiempo;
    }

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    //main()

    public static void main(String[] args) {
        List<Lectura> lecturas = new ArrayList<>();
        double contador = 0;
        double total = 0;
        int contadorRep = 0;

        for (int n = 0; n < 8; n++) {
            lecturas.add(new Lectura(FECHA[n],HABITACION[n], TEMPERATURA[n]));
        }

        Set<String> habitaciones = new HashSet<>();
        for (Lectura lectura : lecturas) {
            habitaciones.add(lectura.getHabitacion());
        }
        System.out.println(habitaciones.toString());

        for (String habitacion : habitaciones) {
            total = 0;
            contador = 0;
            for (Lectura lectura : lecturas) {
                if (lectura.getHabitacion().equals(habitacion)) {
                    total += lectura.getTemperatura();
                    contador++;
                }
            }
            System.out.println("Media " + habitacion + " = " + total / contador);
        }
    }
}