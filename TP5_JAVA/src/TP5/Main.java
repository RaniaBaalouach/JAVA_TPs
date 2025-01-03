package TP5;

public class Main {
    public static void main(String[] args) {
        // Exercice 1 :
        System.out.println("=== Test de l'interface Imprimable ===");
        Article article = new Article("Les bases de Java", 10);
        Magazine magazine = new Magazine("Science et Vie", 50);

        article.Imprimer();
        magazine.Imprimer();

        System.out.println();

        // Exercice 2 :
        System.out.println("=== Test de la classe abstraite Animal ===");
        Animal lion = new AnimalCarnivor("Lion");
        Animal vache = new AnimalHerbivor("Vache");

        lion.Manger();
        vache.Manger();
    }
}
