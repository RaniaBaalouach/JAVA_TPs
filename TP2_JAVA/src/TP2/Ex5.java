package TP2;

public class Ex5 {
	public static String remplacerOccurrences(String chaine, char a, char b) {
        char[] chars = chaine.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == a) {
                chars[i] = b;
            }
        }
        return new String(chars);
    }
}
