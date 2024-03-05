package librairie;

public class LivreRelie implements Livre {
    public BandeDessinee CreerBandeDessinee(String titre, int anneePublication, int nbPages, int prix) {
        return new BandeDessineeRelie(titre, anneePublication, nbPages, prix);
    }

    public Roman CreerRoman(String titre, int anneePublication, int nbPages, int prix) {
        return new RomanRelie(titre, anneePublication, nbPages, prix);
    }

    public Revue CreerRevue(String titre, int nbPages, int prix, String editeur) {
        return new RevueRelie(titre, nbPages, prix, editeur);
    }

}
