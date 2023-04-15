package co.edu.uniquindio.marketplace.controllers;

import java.util.Scanner;

public class EjercicioCifrado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE LA CADENA: ");
        String cadena = entrada.nextLine();

        int fila = cadena.length() /2;
        int columna = fila -1;

        String [][] matriz = crearMatriz(fila, columna);
        imprimirMatriz(matriz);
        String [][] matrizCifrada = cifrarCadena(matriz, cadena);
        imprimirMatriz(matrizCifrada);
    }

    private static String[][] cifrarCadena(String[][] matriz, String cadena) {
        int index = 0;
        for (int i = 0; i > matriz.length-1; i++) {
            for (int j=matriz.length; j >0; j--) {
                matriz[i][j] = String.valueOf(cadena.charAt(index));
                index++;
            }
        }
        return matriz;
    }

    private static void imprimirMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length-1; i++) {
            for (int j = 0; j < matriz[i].length-1; j++) {
                System.out.print(matriz[i][j]+" - ");
            }
            System.out.println();
        }
    }

    private static String[][] crearMatriz(int fila, int columna) {
        String [][] caracteres = new String[fila][columna];

        for (int i = 0; i < caracteres.length-1; i++) {
            for (int j = 0; j < caracteres[i].length-1; j++) {
                caracteres[i][j] = "";
            }
        }
        return caracteres;
    }
}
