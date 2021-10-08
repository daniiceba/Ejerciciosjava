package com.example.ejercicio2;

import com.sun.tools.javac.util.Convert;

import java.util.ArrayList;
import java.util.List;

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
