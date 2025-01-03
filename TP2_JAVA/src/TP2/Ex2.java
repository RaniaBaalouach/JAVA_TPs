package TP2;

public class Ex2 {
	public static void compterOccurrences(int[] tableau) {
		boolean[] visited = new boolean[tableau.length];

        for (int i = 0; i < tableau.length; i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < tableau.length; j++) {
                if (tableau[i] == tableau[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println("Élément " + tableau[i] + " : " + count + " fois.");
        }
    }
}
