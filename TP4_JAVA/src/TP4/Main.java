package TP4;

public class Main {
    public static void main(String[] args) {
        Entreprise e = new Entreprise("TechCorp", 1000000, 10000);
        Employe emp = new Employe("123ABC", "Ali", "Rabat", e);
        Cadre cadre = new Cadre(emp, 'A');

        System.out.println(emp);
        System.out.println(cadre);

        Livre livre = new Livre(1, "Java for Beginners", "John Doe", "123456789");
        CD cd = new CD(2, "Greatest Hits", "Famous Artist", 19.99);

        livre.print();
        cd.print();

        Produit produit = cd;
        produit.print();

        produit = livre;
        produit.print();
    }
}
