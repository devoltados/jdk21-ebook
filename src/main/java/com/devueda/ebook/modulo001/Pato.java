package com.devueda.ebook.modulo001;

public class Pato extends Ave implements Voador {
    // Atributos (características)
    String cor;
    double peso;

    // Comportamentos (métodos)
    public void nadar() {
        System.out.println("O pato está nadando.");
    }

    public void grasnar() {
        System.out.println("Quá, quá!");
    }

    @Override
    public void voar() {
        System.out.println("O Pato está voando");
    }
}
