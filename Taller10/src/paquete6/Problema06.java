/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema06 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el número para multiplicar la matriz: ");
        double multiplicador = entrada.nextDouble();

        double[][] matrizOriginal = new double[5][6];
        double[][] matrizResultante = new double[5][6];

        System.out.println("\nIngrese los valores para la matriz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(" --> ");
                matrizOriginal[i][j] = entrada.nextDouble();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                matrizResultante[i][j] = matrizOriginal[i][j] * multiplicador;
            }
        }

        System.out.println("\nMATRIZ ORIGINAL:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matrizOriginal[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMATRIZ RESULTANTE :");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matrizResultante[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
