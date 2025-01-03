package TP3;

public class Personne {
    private int id;
    private String nom;
    private double salaire;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom.toUpperCase();
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public Personne() {}

    public Personne(int id, String nom, double salaire) {
        this.id = id;
        this.nom = nom;
        this.salaire = salaire;
    }

    public Personne(Personne other) {
        this.id = other.id;
        this.nom = other.nom;
        this.salaire = other.salaire;
    }

    public void affichePersonne() {
        System.out.println("ID: " + id + ", Nom: " + nom + ", Salaire: " + salaire);
    }
}
