package TP2;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ex1
        System.out.print("Entrez la taille du tableau: ");
        int n = scanner.nextInt();
        int[] tableau = new int[n];
        System.out.println("Entrez les éléments du tableau:");
        for (int i = 0; i < n; i++) {
            tableau[i] = scanner.nextInt();
        }
        Ex1.analyseTableau(tableau);

        // Ex2
        System.out.println("\nEx2: Compter les occurrences des éléments d'un tableau");
        Ex2.compterOccurrences(tableau);

        // Ex3
        System.out.println("\nEx3: Tester si un tableau est symétrique");
        boolean symetrique = Ex3.estSymetrique(tableau);
        System.out.println("Le tableau est symétrique ? " + symetrique);

        // Ex4 
        System.out.print("\\nEx4: Entrez une chaîne: ");
        scanner.nextLine();
        String chaine = scanner.nextLine();
        System.out.println("Chaîne: " + Ex4.formaterChaine(chaine));

        // Ex5
        System.out.print("\nEx5: Entrez une chaîne: ");
        String chaine2 = scanner.nextLine();
        System.out.print("Entrez le caractère 1: ");
        char a = scanner.next().charAt(0);
        System.out.print("Entrez le caractère 2: ");
        char b = scanner.next().charAt(0);
        System.out.println("Nouvelle chaîne: " + Ex5.remplacerOccurrences(chaine2, a, b));

        // Ex6
        System.out.print("\\nEx6: Entrez une phrase: ");
        scanner.nextLine();
        String phrase = scanner.nextLine();
        System.out.println("Nombre de mots: " + Ex6.compterMots(phrase));

        scanner.close();
    }
}
