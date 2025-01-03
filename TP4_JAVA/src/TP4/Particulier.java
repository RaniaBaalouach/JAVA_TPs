package TP4;

public class Particulier {
    private String numeroCIN;
    private String nom;
    private String adresse;

    public Particulier(String numeroCIN) {
        this.numeroCIN = numeroCIN;
    }

    public Particulier(String numeroCIN, String nom) {
        this.numeroCIN = numeroCIN;
        this.nom = nom;
    }

    public Particulier(String numeroCIN, String nom, String adresse) {
        this.numeroCIN = numeroCIN;
        this.nom = nom;
        this.adresse = adresse;
    }

    public String getNumeroCIN() {
        return numeroCIN;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "CIN: " + numeroCIN + ", Nom: " + nom + ", Adresse: " + adresse;
    }
}
