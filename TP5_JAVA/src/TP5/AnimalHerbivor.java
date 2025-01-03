package TP5;

public class AnimalHerbivor extends Animal {
    public AnimalHerbivor(String nom) {
        super(nom);
    }

    @Override
    public void Manger() {
        System.out.println(nom + " mange l'herbe.");
    }
}
