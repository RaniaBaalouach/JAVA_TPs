package TP4;

public class Livre extends Produit {
    private String titre;
    private String auteur;
    private String isbn;

    public Livre(int idProduit, String titre, String auteur, String isbn) {
        super(idProduit);
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
    }

    @Override
    public void print() {
        System.out.println(titre + ", " + auteur + ", (ISBN: " + isbn + ")");
    }
}
