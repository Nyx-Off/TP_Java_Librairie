package librairie;

public class LivreBroche implements Livre {
    public BandeDessinee CreerBandeDessinee(String titre, int anneePublication, int nbPages, int prix) {
        return new BandeDessineeBroche(titre, anneePublication, nbPages, prix);
    }

    public Roman CreerRoman(String titre, int anneePublication, int nbPages, int prix) {
        return new RomanBroche(titre, anneePublication, nbPages, prix);
    }

    public Revue CreerRevue(String titre, int nbPages, int prix, String editeur) {
        return new RevueBroche(titre, nbPages, prix, editeur);
    }

}
