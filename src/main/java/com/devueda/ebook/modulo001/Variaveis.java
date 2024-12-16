package com.devueda.ebook.modulo001;

/**
 * Exemplo de variáveis no Java
 */
public class Variaveis {
    public static void main(String[] args) {
        int idade = 18;
        char sexo = 'M';
        int indice = 0;
        boolean pronto = false;

        System.out.println("Idade = " + idade);
        System.out.println("Sexo = " + sexo);
        System.out.println("Índice = " + indice);
        System.out.println("Pronto = " + pronto);

        // Literais hexadecimais começam com 0x
        int valorHexadecimal = 0x1a;
        // Literais binárias começam com 0b
        int valorBinario = 0b11010;

        /*
        Muito embora as variáveis tenha sido atribuídas com literais
        no formato hexadecimal e binário, ao mostrá-las com o comando
        System.out.println elas são impressas no formato decimal.
        */
        System.out.println("valorHexadeicmal " + valorHexadecimal);
        System.out.println("valorBinário " + valorBinario);
    }
}
