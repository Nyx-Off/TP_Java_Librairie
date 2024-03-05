package librairie;

public abstract class Revue {
    protected String titre;
    protected int nbPages;
    protected int prix;
    protected String editeur;

    public Revue(String titre, int nbPages, int prix, String editeur) {
        this.titre = titre;
        this.nbPages = (nbPages > 0) ? nbPages : 0;
        this.prix = (prix > 0) ? prix : 0;
        this.editeur = editeur;
    }
    public abstract void afficher();
}
