package librairie;

public interface Livre {
    public abstract BandeDessinee CreerBandeDessinee(
            String titre,
            int anneePublication,
            int nbPages,
            int prix);

    public abstract Roman CreerRoman(
            String titre,
            int anneePublication,
            int nbPages,
            int prix);

    public abstract Revue CreerRevue(
            String titre,
            int nbPages,
            int prix,
            String editeur);
}
