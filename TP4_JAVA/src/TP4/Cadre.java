package TP4;

public class Cadre extends Employe {
    private char grade;

    public Cadre(String numeroCIN, Entreprise entreprise, char grade) {
        super(numeroCIN, entreprise);
        this.grade = grade;
    }

    public Cadre(String numeroCIN, String nom, Entreprise entreprise, char grade) {
        super(numeroCIN, nom, entreprise);
        this.grade = grade;
    }

    public Cadre(String numeroCIN, String nom, String adresse, Entreprise entreprise, char grade) {
        super(numeroCIN, nom, adresse, entreprise);
        this.grade = grade;
    }

    public Cadre(Particulier p, Entreprise entreprise, char grade) {
        super(p, entreprise);
        this.grade = grade;
    }

    public Cadre(Employe e, char grade) {
        super(e.getNumeroCIN(), e.getNom(), e.getAdresse(), e.getEntreprise());
        this.grade = grade;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString() + ", Grade: " + grade;
    }
}
