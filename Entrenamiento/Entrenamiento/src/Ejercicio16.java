package co.edu.uniquindio.marketplace.controllers;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio16 {
    private final static float [] numeros = new float[100];

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        float numero = entrada.nextFloat();

        numeros[0]= (numero);
        llenarArreglo((numero));
        imprimirArreglo(numeros);

    }

    private static void llenarArreglo(float num) {
        for (int i = 1; i < numeros.length-1; i++) {
            numeros[i] = numeros[i-1]/2;
        }
    }
    private static void imprimirArreglo(float [] numeros){
        DecimalFormat formato =new DecimalFormat("##.0000");
        for (int i = 0; i <numeros.length; i++) {
            System.out.println("POSICION["+i+"] = "+formato.format(numeros[i]));
        }
    }
}
