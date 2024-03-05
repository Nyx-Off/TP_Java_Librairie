package librairie;

public class RevueBroche extends Revue {
    public RevueBroche(String titre, int nbPages, int prix, String editeur) {
        super(titre, nbPages, prix, editeur);
    }

    public void afficher() {
        System.out.println("[Revue brochée] - " + "Titre: " + this.titre + "| " + "Nombre de pages: " + this.nbPages + "| " + "Prix: " + this.prix + " euros| " + "Editeur: " + this.editeur + "|");
    }
}
