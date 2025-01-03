package TP5;

public class AnimalCarnivor extends Animal {
    public AnimalCarnivor(String nom) {
        super(nom);
    }

    @Override
    public void Manger() {
        System.out.println(nom + " mange la viande.");
    }
}
