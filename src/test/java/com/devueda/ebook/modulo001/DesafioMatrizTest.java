package com.devueda.ebook.modulo001;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DesafioMatrizTest {

    @Test
    void soma() {
        int[][] resultadoEsperado = {
                {6, 8},
                {10, 12}
        };
        int[][] matrizA = {
                { 1, 2 },
                { 3, 4 }
        };
        int[][] matrizB = {
                { 4, 6 },
                { 7, 8 }
        };
        int[][] resultado = DesafioMatriz.soma(matrizA, matrizB);
        assertArrayEquals(resultado, resultadoEsperado);
    }
}