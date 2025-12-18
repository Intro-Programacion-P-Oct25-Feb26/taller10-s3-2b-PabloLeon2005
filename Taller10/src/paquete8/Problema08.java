/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete8;

/**
 *
 * @author PC
 */
public class Problema08 {

    public static void main(String[] args) {

        double[][] dato1 = {{1, 2, 3}, {6, 8, 9}};
        double[][] dato2 = {{10, 1, 2}, {10, 9, 1}};
        double[][] resultado = new double[2][3];

        for (int i = 0; i < dato1.length; i++) {
            for (int j = 0; j < dato1[i].length; j++) {
                if (dato1[i][j] < dato2[i][j]) {
                    resultado[i][j] = dato1[i][j];
                } else {
                    resultado[i][j] = dato2[i][j];
                }
            }
        }

        System.out.println("Matriz con los valores generados:");
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.printf("%.0f\t", resultado[i][j]);
            }
            System.out.println();
        }
    }
}
