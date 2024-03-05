package librairie;

public class BandeDessineeRelie extends BandeDessinee {
    public BandeDessineeRelie(String titre, int anneePublication, int nbPages, int prix) {
        super(titre, anneePublication, nbPages, prix);
    }

    public void afficher() {
        System.out.println("[Bande Dessinee reliée] - Titre: " + this.titre + "| Nombre de pages: " + this.nbPages + "| Prix: " + this.prix + " euros|");
    }

}
