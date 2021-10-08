package com.example.ejercicio1;


import java.util.HashSet;
import java.util.Set;

public class Unidades {
    private static int[] NUMEROS = {7, 77, 21, 28, 48, 42, 49, 56, 62, 70};

    public static void main(String[] args) {
        Set<Integer> unidades = new HashSet<>();
        for (int i = 0; i < NUMEROS.length; i++) {
            int res = NUMEROS[i] % 10;
            unidades.add(res);
        }
        for (int d : unidades) {
            System.out.println(d);
        }
    }
}
