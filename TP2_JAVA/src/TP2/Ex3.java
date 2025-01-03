package TP2;

public class Ex3 {
	public static boolean estSymetrique(int[] tableau) {
        for (int i = 0; i < tableau.length / 2; i++) {
            if (tableau[i] != tableau[tableau.length - 1 - i]) {
                return false;
            }
        }
        return true;
	}
}
