package TP2;

public class Ex1 {
	public static void analyseTableau(int[] tableau) {
        int min = tableau[0];
        int max = tableau[0];
        int somme = 0;

        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] < min) min = tableau[i];
            if (tableau[i] > max) max = tableau[i];
            somme += tableau[i];
        }

        double moyenne = (double) somme / tableau.length;

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Somme: " + somme);
        System.out.println("Moyenne: " + moyenne);
    }
}
