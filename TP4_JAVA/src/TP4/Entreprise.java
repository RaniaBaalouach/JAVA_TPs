package TP4;

public class Entreprise {
    private String raisonSociale;
    private double capital;
    private int nombreActions;

    public Entreprise(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public Entreprise(String raisonSociale, double capital) {
        this.raisonSociale = raisonSociale;
        this.capital = capital;
    }

    public Entreprise(String raisonSociale, double capital, int nombreActions) {
        this.raisonSociale = raisonSociale;
        this.capital = capital;
        this.nombreActions = nombreActions;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public int getNombreActions() {
        return nombreActions;
    }

    public void setNombreActions(int nombreActions) {
        this.nombreActions = nombreActions;
    }

    public double prixAction() {
        return capital / nombreActions;
    }

    @Override
    public String toString() {
        return "Entreprise: " + raisonSociale + ", Capital: " + capital + 
               ", Nombre d'actions: " + nombreActions;
    }
}
