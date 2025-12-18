/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {

        boolean[][] sensores = {
            {true, true, true, true, true, true},
            {true, false, true, false, true, true},
            {false, false, false, false, false, false},
            {true, true, false, true, true, true}
        };

        int zonasSinFallos = 0;

        System.out.println("REPORTE DE ESTADO DE SENSORES");

        for (int i = 0; i < sensores.length; i++) {
            boolean tieneFallo = false;

            for (int j = 0; j < sensores[i].length; j++) {
                if (!sensores[i][j]) {
                    tieneFallo = true;
                    break;
                }
            }

            if (tieneFallo) {
                System.out.printf("Zona %d: PRESENTA AL MENOS UN FALLO\n", (i + 1));
            } else {
                System.out.printf("Zona %d: FUNCIONA SIN FALLOS\n", (i + 1));
                zonasSinFallos++;
            }
        }

        System.out.printf("Total de zonas que funcionan sin fallos: %d\n", zonasSinFallos);
    }

}

