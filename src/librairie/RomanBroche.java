package librairie;

public class RomanBroche extends Roman {
    public RomanBroche(String titre, int anneePublication, int nbPages, int prix) {
        super(titre, anneePublication, nbPages, prix);
    }

    public void afficher() {
        System.out.println("[Romain brochée] - " + "Titre: " + this.titre + "| " + "Nombre de pages: " + this.nbPages + "| " + "Prix: " + this.prix + " euros| ");
    }
}
