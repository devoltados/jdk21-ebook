package com.devueda.ebook.modulo001;

public class Main {
    public static void main(String[] args) {
        // Criando objetos da classe Pato
        Pato pato1 = new Pato();
        pato1.cor = "Branco";
        pato1.peso = 2.5;
        pato1.tipoBico = "curvo";

        Pato pato2 = new Pato();
        pato2.cor = "Marrom";
        pato2.peso = 3.0;

        // Chamando métodos dos objetos
        pato1.nadar();
        pato2.grasnar();
    }
}