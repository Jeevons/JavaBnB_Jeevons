package javabnb.reservations;

import javabnb.logement.Logement;

import java.util.Date;

public class SejourLong extends Sejour {

    // private int prix; // On utilise celui de la mère
    private int promotion;
    private static final int PROMOTION_EN_POURCENTAGE = 20;

    SejourLong(Date laDate, int duree, Logement leLogement, int personnes) {
        super(laDate, duree, leLogement, personnes);
    }

    @Override
    public void miseAJourDuPrixDuSejour() {
        int prixInitial = this.hebergement.getPrixNuit() * this.getDureeNuits();
        this.promotion = prixInitial * PROMOTION_EN_POURCENTAGE / 100;
        this.prix = prixInitial - this.promotion;
    }
    
    @Override
    public boolean aUnNombreDeNuitsCorrect() {
        return true; 
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Promotion : " + promotion + "€");
        System.out.println("Prix total : " + prix + "€");
    }
}
