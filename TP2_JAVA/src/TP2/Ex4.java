package TP2;

public class Ex4 {
    public static String formaterChaine(String chaine) {
        if (chaine.length() == 0) return chaine;

        char first = Character.toUpperCase(chaine.charAt(0));
        String result = "" + first; 
        
        for (int i = 1; i < chaine.length(); i++) {
            result += Character.toLowerCase(chaine.charAt(i));
        }

        return result;
    }
}
