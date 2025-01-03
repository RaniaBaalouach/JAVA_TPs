package TP2;

public class Ex6 {
	public static int compterMots(String phrase) {
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) != ' ') {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        return count;
    }
}
