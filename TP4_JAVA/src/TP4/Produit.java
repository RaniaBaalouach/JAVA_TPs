package TP4;

public class Produit {
    private int idProduit;

    public Produit(int idProduit) {
        this.idProduit = idProduit;
    }

    public void print() {
        System.out.println("ID: " + idProduit);
    }
}
