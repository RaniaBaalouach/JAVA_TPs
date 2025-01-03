package TP1;

public class Ex5 {
	public static int calculerFactorielle(int n) {
        if (n == 0 || n == 1) return 1;
        return n * calculerFactorielle(n - 1);
    }
}
