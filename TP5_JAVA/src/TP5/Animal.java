package TP5;

public abstract class Animal {
    protected String nom;

    public Animal(String nom) {
        this.nom = nom;
    }

    public abstract void Manger();
}
