package com.example.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Punto {
    private double x;
    private double y;

    //constructor
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //getters y setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    //tosting


    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public double distancia(Punto b){
        return Math.sqrt(Math.pow((this.x-b.getX()),2)+Math.pow((this.y-b.getY()),2));
    }
}

public class Principal {

    public static void main(String[] args) {
        double sol = 0;
        List<Punto> lista = new ArrayList<>();
        lista.add(new Punto(2, 0));
        lista.add(new Punto(0, 1));
        lista.add(new Punto(1, 2));
        lista.add(new Punto(1, 4));
        lista.add(new Punto(4, 3));
        for (int i = 0; i <= lista.size()-1 ; i++) {
            if(i<lista.size()-1){
                sol += sol + lista.get(i).distancia(lista.get(i+1));
                System.out.println("primer numero: " +lista.get(i).toString()+"segundo numero: "+lista.get(i+1).toString());
            }else{
                sol += sol + lista.get(i).distancia(lista.get(0));
            }
        }


        //double sol2= sol/lista.size();
        System.out.println("el perimetro es: " + sol);
        //System.out.println("La longitud media del lado es: " + sol2);
    }
}
