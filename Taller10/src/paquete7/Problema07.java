/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete7;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Problema07 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        double[][] matrizX = new double[3][3];
        double[][] matrizA = new double[3][3];
        double[][] matrizB = new double[3][3];
        
        System.out.println("Ingreso de valores para la Matriz X (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("X  :");
                matrizX[i][j] = entrada.nextDouble();
            }
        }
        
        boolean todasIguales = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                double x = matrizX[i][j];
                
                matrizA[i][j] = (x + 1) * (x + 1);
                
                matrizB[i][j] = (x * x) + (2 * x) + 1;
                
                if (matrizA[i][j] != matrizB[i][j]) {
                    todasIguales = false;
                }
            }
        }
        
        if (todasIguales == true) {
            System.out.println("La identidad algebraica se cumple.");
        } else {
            System.out.println("La identidad algebraica no se cumple.");
        }
    }
}
        

