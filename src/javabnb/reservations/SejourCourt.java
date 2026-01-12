package javabnb.reservations;

import javabnb.logement.Logement;

import java.util.Date;

public class SejourCourt extends Sejour {
 

    SejourCourt(Date laDate, int duree, Logement leLogement, int personnes) {
        super(laDate, duree, leLogement, personnes);


    }

    @Override
    public void miseAJourDuPrixDuSejour() {
        this.prix = this.getDureeNuits() * this.getHebergement().getPrixNuit();
    }
    @Override
    public boolean aUnNombreDeNuitsCorrect() {
        return this.getDureeNuits() >= 1 && this.getDureeNuits() <= 31;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Prix total : " + prix + "€");
    }


}
