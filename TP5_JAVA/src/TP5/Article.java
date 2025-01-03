package TP5;

public class Article implements Imprimable {
    private String nomArticle;
    private int nombrePages;

    public Article(String nomArticle, int nombrePages) {
        this.nomArticle = nomArticle;
        this.nombrePages = nombrePages;
    }

    @Override
    public void Imprimer() {
        System.out.println(nomArticle + " est un Article imprimable sur " + nombrePages + " pages.");
    }
}
