package TP3;

public class Etudiant {
    private String cin;
    private String nom;
    private int age;

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void afficheEtudiant() {
        System.out.println("CIN: " + cin + ", Nom: " + nom + ", Age: " + age);
    }
}
