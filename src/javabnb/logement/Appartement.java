package javabnb.logement;

import javabnb.Utilisateurs.Hote;

public class Appartement extends Logement {

    private final int tailleBalcon;
    private final int etage;

    public Appartement(Hote leProprio, int lePrix, String lAdresse, int laSurface, int capacite, int balcon, int letage) {
        super(leProprio, lePrix, lAdresse, laSurface, capacite);
        this.tailleBalcon = balcon;
        this.etage = letage;
    }

    @Override
    public void afficherDetails() {
        System.out.println("\n========== Informations du logement ==========");
        System.out.println("Type : Appartement");
        System.out.print("Propriétaire : ");
        this.getProprietaire().afficherInfos();
        System.out.println("\nAdresse : " + this.getAdresse());
        System.out.println("Étage : " + obtenirEtage());
        System.out.println("Surface habitable : " + this.getSurface() + " m²");
        
        String infoBalcon;
        if (this.tailleBalcon > 0) {
            infoBalcon = "Oui, " + this.tailleBalcon + " m²";
        } else {
            infoBalcon = "Non";
        }
        System.out.println("Balcon : " + infoBalcon);
        System.out.println("Tarif : " + this.getPrixNuit() + "€ par nuit");
    }

    private String obtenirEtage() {
        if (this.etage == 0) {
            return "Rez-de-chaussée";
        } else if (this.etage == 1) {
            return "1er étage";
        } else {
            return this.etage + "e étage";
        }
    }

}