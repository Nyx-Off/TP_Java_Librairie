package librairie;

public class RomanRelie extends Roman {
    public RomanRelie(String titre, int anneePublication, int nbPages, int prix) {
        super(titre, anneePublication, nbPages, prix);
    }

    public void afficher() {
        System.out.println("[Roman reliée] - Titre: " + this.titre + "| Nombre de pages: " + this.nbPages + "| Prix: " + this.prix + " euros|");
    }

}
