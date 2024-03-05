package librairie;

public class RevueRelie extends Revue {
    public RevueRelie(String titre, int nbPages, int prix, String editeur) {
        super(titre, nbPages, prix, editeur);
    }

    public void afficher() {
        System.out.println("[Revue reliée] - Titre: " + this.titre + "| Nombre de pages: " + this.nbPages + "| Prix: " + this.prix + " euros| Editeur: " + this.editeur + "|");
    }
}
