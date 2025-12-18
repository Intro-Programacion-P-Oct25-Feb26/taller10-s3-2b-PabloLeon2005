/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {

        int[][] edades = {
            {5, 12, 35, 40},
            {8, 15, 33, 38},
            {6, 10, 30, 36}
        };

        int totalMenores = 0;
        int[] adultosPorFamilia = new int[edades.length];

        for (int i = 0; i < edades.length; i++) {
            int contadorAdultos = 0;
            for (int j = 0; j < edades[i].length; j++) {
                if (edades[i][j] < 18) {
                    totalMenores++;
                } else {
                    contadorAdultos++;
                }
            }
            adultosPorFamilia[i] = contadorAdultos;
        }

        System.out.println("REPORTE DE EDADES");

        for (int i = 0; i < adultosPorFamilia.length; i++) {
            System.out.printf("Familia %d - Cantidad de adultos: %d\n", (i + 1), adultosPorFamilia[i]);
        }

        System.out.printf("Total de menores de edad en el registro: %d\n", totalMenores);

    }
}
