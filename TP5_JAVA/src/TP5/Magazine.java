package TP5;

public class Magazine implements Imprimable {
    private String nomMagazine;
    private int nombrePages;

    public Magazine(String nomMagazine, int nombrePages) {
        this.nomMagazine = nomMagazine;
        this.nombrePages = nombrePages;
    }

    @Override
    public void Imprimer() {
        System.out.println(nomMagazine + " est un Magazine imprimable sur " + nombrePages + " pages.");
    }
}
