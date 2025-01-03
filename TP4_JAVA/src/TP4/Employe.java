package TP4;

public class Employe extends Particulier {
    private static int matriculeCounter = 0;
    private int matricule;
    private Entreprise entreprise;

    public Employe(String numeroCIN, Entreprise entreprise) {
        super(numeroCIN);
        this.entreprise = entreprise;
        this.matricule = ++matriculeCounter;
    }

    public Employe(String numeroCIN, String nom, Entreprise entreprise) {
        super(numeroCIN, nom);
        this.entreprise = entreprise;
        this.matricule = ++matriculeCounter;
    }

    public Employe(String numeroCIN, String nom, String adresse, Entreprise entreprise) {
        super(numeroCIN, nom, adresse);
        this.entreprise = entreprise;
        this.matricule = ++matriculeCounter;
    }

    public Employe(Particulier p, Entreprise entreprise) {
        super(p.getNumeroCIN(), p.getNom(), p.getAdresse());
        this.entreprise = entreprise;
        this.matricule = ++matriculeCounter;
    }

    public Entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }

    public int getMatricule() {
        return matricule;
    }

    @Override
    public String toString() {
        return super.toString() + ", Matricule: " + matricule + 
               ", Entreprise: " + entreprise.getRaisonSociale();
    }
}
