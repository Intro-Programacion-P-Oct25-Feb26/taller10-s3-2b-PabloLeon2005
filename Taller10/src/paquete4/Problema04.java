/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matrizA = new int[3][2];
        int[][] matrizB = new int[3][2];

        System.out.println("Ingreso de valores para la Matriz A (3x2):");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.print("VALORES A: ");
                matrizA[i][j] = entrada.nextInt();
            }
        }

        System.out.println("\nIngreso de valores para la Matriz B:");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.printf("VALORES  B: ", i, j);
                matrizB[i][j] = entrada.nextInt();
            }
        }

        System.out.println("\nMatriz A:");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.print(matrizA[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMatriz B:");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.print(matrizB[i][j] + "\t");
            }
            System.out.println();
        }

        boolean todasMayorIgual = true;
        boolean existeUnaEstrictamenteMayor = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                if (matrizA[i][j] < matrizB[i][j]) {
                    todasMayorIgual = false;
                }
                if (matrizA[i][j] > matrizB[i][j]) {
                    existeUnaEstrictamenteMayor = true;
                }
            }
        }

        System.out.println("\nResultado de la comparación:");
        if (todasMayorIgual && existeUnaEstrictamenteMayor) {
            System.out.println("La matriz A es mayor que la matriz B");
        } else {
            System.out.println("La matriz A no es mayor que la matriz B");
        }
    }
}
