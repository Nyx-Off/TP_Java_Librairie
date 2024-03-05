package librairie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Catalogue {
    public static void main(String[] args) {
        char c;
        int index = 0;

        Scanner sc = new Scanner(System.in);

        List<BandeDessinee> tBD = new ArrayList<>();
        List<Roman> tRom = new ArrayList<>();
        List<Revue> tRev = new ArrayList<>();

        Livre createRelie = new LivreRelie();
        Livre createBroche = new LivreBroche();

        tBD.add(createRelie.CreerBandeDessinee("Dragon Ball", 2000, 60, 20));
        tBD.add(createBroche.CreerBandeDessinee("One Piece", 2010, 75, 25));
        tBD.add(createBroche.CreerBandeDessinee("Picsou", 1981, 52, 17));
        tBD.add(createRelie.CreerBandeDessinee("Fullmetal Alchemist", 2007, 46, 12));
        tBD.add(createRelie.CreerBandeDessinee("Batman", 1990, 59, 15));

        tRom.add(createBroche.CreerRoman("Les grandes espérances", 1984, 220, 80));
        tRom.add(createRelie.CreerRoman("Crime et châtiment", 2020, 125, 54));
        tRom.add(createBroche.CreerRoman("Les Hauts de Hurle-Vent", 2010, 250, 120));
        tRom.add(createRelie.CreerRoman("Madame Bovary", 1980, 96, 15));
        tRom.add(createBroche.CreerRoman("Le procès", 1998, 310, 150));

        tRev.add(createBroche.CreerRevue("TV Magazine", 30, 8, "ENI"));
        tRev.add(createRelie.CreerRevue("Femme Actuelle", 35, 10, "FATON"));
        tRev.add(createBroche.CreerRevue("Vies de Famille", 28, 15, "ENI"));

        do {
            System.out.print("\na: Afficher catalogue | p: <= livre précédent | s: => livre suivant | x: Fermer | Choix : ");
            c = sc.next().charAt(0);
            System.out.println();

            switch (c) {
                case 'a':
                    for (int i = 0; i < tRom.size(); i++) {
                        System.out.print(i + 1 + ". ");
                        tRom.get(i).afficher();
                    }
                    for (int i = 0; i < tBD.size(); i++) {
                        System.out.print(i + tRom.size() + 1 + ". ");
                        tBD.get(i).afficher();
                    }
                    for (int i = 0; i < tRev.size(); i++) {
                        System.out.println(i + tBD.size() + tRom.size() + 1 + ". ");
                        tRev.get(i).afficher();
                    }
                    index = 0;
                    break;
                case 'p':
                case 's':
                    if (c == 'p') {
                        if (index > 0) {
                            index--;
                        } else {
                            index = tRom.size() + tBD.size() + tRev.size() - 1;
                        }
                    } else {
                        if (index < tRom.size() + tBD.size() + tRev.size() - 1) {
                            index++;
                        } else {
                            index = 0;
                        }
                    }
                    if (index < tRom.size()) {
                        System.out.print((index) + ". ");
                        tRom.get(index).afficher();
                    } else if (index < (tRom.size() + tBD.size())) {
                        System.out.print((index) + ". ");
                        tBD.get(index - tRom.size()).afficher();
                    } else {
                        System.out.print((index) + ". ");
                        tRev.get(index - tRom.size() - tBD.size()).afficher();
                    }
                    break;
                case 'f':
                    System.out.println("Fermeture du programme.");
                    sc.close();
                    break;
                default:
                    System.out.println("Choix non valide. Veuillez réessayer.");
                    break;
            }
        } while (c != 'f');
    }
}
