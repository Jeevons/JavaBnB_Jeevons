package javabnb.logement;

import javabnb.Utilisateurs.Hote;

public class Maison extends Logement {

    private final int tailleJardin;
    private final boolean avecPiscine;

    public Maison(Hote leProprio, int lePrix, String lAdresse, int laSurface, int capacite, int jardin, boolean piscine) {
        super(leProprio, lePrix, lAdresse, laSurface, capacite);
        this.tailleJardin = jardin;
        this.avecPiscine = piscine;
    }

    @Override
    public void afficherDetails() {
        System.out.println("\n========== Informations du logement ==========");
        System.out.println("Type : Maison");
        System.out.print("Propriétaire : ");
        this.getProprietaire().afficherInfos();
        System.out.println("\nAdresse : " + this.getAdresse());
        System.out.println("Surface habitable : " + this.getSurface() + " m²");

        String infoJardin;
        if (this.tailleJardin > 0) {
            infoJardin = "Oui, " + this.tailleJardin + " m²";
        } else {
            infoJardin = "Non";
        }
        System.out.println("Jardin : " + infoJardin);

        String infoPiscine;
        if (this.avecPiscine) {
            infoPiscine = "Oui";
        } else {
            infoPiscine = "Non";
        }
        System.out.println("Piscine : " + infoPiscine);
        System.out.println("Tarif : " + this.getPrixNuit() + "€ par nuit");
    }

}