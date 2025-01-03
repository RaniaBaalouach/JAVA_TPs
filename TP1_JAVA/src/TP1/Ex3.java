package TP1;

public class Ex3 {
	public static int calculerSomme(int a, int b, int c) {
        return a + b + c;
    }

    public static double calculerMoyenne(int a, int b, int c) {
        int somme = calculerSomme(a, b, c);
        return somme / 3.0;
    }
}
