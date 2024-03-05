package librairie;

public abstract class BandeDessinee  {
    protected String titre;
    protected int anneePublication;
    protected int nbPages;
    protected int prix;

    public BandeDessinee(String titre, int anneePublication, int nbPages, int prix) {
        this.titre = titre;
        this.anneePublication = (anneePublication > 0) ? anneePublication : 0;
        this.nbPages = (nbPages > 0) ? nbPages : 0;
        this.prix = (prix > 0) ? prix : 0;
    }

    public abstract void afficher();
}
