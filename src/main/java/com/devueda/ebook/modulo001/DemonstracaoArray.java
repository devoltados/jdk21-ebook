package com.devueda.ebook.modulo001;

public class DemonstracaoArray {
    public static void main(String[] args) {
        char[] array = new char[6]; //Definimos o tamanho 6
        array[0] = 'A';
        array[1] = 'B';
        array[2] = 'C';
        array[3] = 'D';
        array[4] = 'E';
        array[5] = 'F';

        // Mostrando elemento na primeira posição do array
        System.out.println(array[0]);

        // Criando uma matriz 2x2 (2 linhas e duas colunas)
        int[][] matriz = {
                { 10, 20},
                { 9, 7}
        };
        // Imprimindo o elemento da matriz na linha = 0 e coluna = 0
        System.out.println("Element linha[0] coluna[0] = " + matriz[0][0]);
    }
}
