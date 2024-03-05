package librairie;

public class BandeDessineeBroche extends BandeDessinee {
    public BandeDessineeBroche(String titre, int anneePublication, int nbPages, int prix) {
        super(titre, anneePublication, nbPages, prix);
    }

    public void afficher() {
        System.out.println("[Bande Dessinee brochée] - " + "Titre: " + this.titre + "| " + "Nombre de pages: " + this.nbPages + "| " + "Prix: " + this.prix + " euros| ");
    }

}
