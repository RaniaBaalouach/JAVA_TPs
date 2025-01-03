package TP3;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Marchandise m1 = new Marchandise("001", "Ordinateur");
        Marchandise m2 = new Marchandise("002");
        System.out.println(m1);
        System.out.println(m2);
        System.out.println();

        Personne p1 = new Personne(1, "Ali", 3000);
        Personne p2 = new Personne(p1);
        p2.setNom("Sara");
        p1.affichePersonne();
        p2.affichePersonne();
        System.out.println();

        Utilisateur u1 = new Utilisateur(2, "Sara", 4000, "sara123", "password123");
        Utilisateur u2 = new Utilisateur(3, "Imane", 5000, "imane123", "password456");
        u1.afficheUtilisateur();
        u2.afficheUtilisateur();
        System.out.println();

        ArrayList<Utilisateur> utilisateurs = new ArrayList<>();
        utilisateurs.add(u1);
        utilisateurs.add(u2);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez votre login : ");
        String login = scanner.nextLine();
        System.out.print("Entrez votre mot de passe : ");
        String password = scanner.nextLine();

        boolean found = false;
        for (Utilisateur user : utilisateurs) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                System.out.println("Authentification réussie !");
                user.afficheUtilisateur();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Échec de l'authentification.");
        }
        System.out.println();

        EtudiantFaculte faculte = new EtudiantFaculte();
        faculte.setCin("F123");
        faculte.setNom("Hassan");
        faculte.setAge(20);

        EtudiantENSA ensa = new EtudiantENSA();
        ensa.setCin("E456");
        ensa.setNom("Imane");
        ensa.setAge(21);

        faculte.afficheEtudiant();
        ensa.afficheEtudiant();
    }
}
