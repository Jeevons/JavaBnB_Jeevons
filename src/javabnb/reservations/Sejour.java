package javabnb.reservations;

import java.util.Date;
import javabnb.logement.Logement;
import javabnb.utils.Utils;


public class Sejour implements Reservable {

    private Date dateDebut;
    private int dureeNuits;
    private Logement hebergement;
    private int nombrePersonnes;

    public Sejour(Date laDate, int duree, Logement leLogement, int personnes) {
        // Il faut vérifier que la durée est correcte
        // On peut pas réserver moins d'une nuit
        if (duree < 1) {
            duree = 1;
        }
        // Et pas plus de 31 jours
        if (duree > 31) {
            duree = 31;
        }
        
        this.dateDebut = laDate;
        this.dureeNuits = duree;
        this.hebergement = leLogement;
        this.nombrePersonnes = personnes;
    }

    @Override
    public void afficher() {
        this.hebergement.afficherDetails();
        System.out.println("\n--- Détails de la réservation ---");
        System.out.println("Date d'arrivée : " + Utils.formatterDate(this.dateDebut));
        
        String descriptionNuits;
        if (this.dureeNuits == 1) {
            descriptionNuits = "1 nuit";
        } else {
            descriptionNuits = this.dureeNuits + " nuits";
        }
        System.out.println("Durée du séjour : " + descriptionNuits);
        
        String descriptionPersonnes;
        if (this.nombrePersonnes == 1) {
            descriptionPersonnes = "1 voyageur";
        } else {
            descriptionPersonnes = this.nombrePersonnes + " voyageurs";
        }
        System.out.println("Nombre de voyageurs : " + descriptionPersonnes);
        System.out.println("Prix total du séjour : " + calculerPrixTotal() + "€");
    }

    private int calculerPrixTotal() {
        int montantTotal = this.hebergement.getPrixNuit() * this.dureeNuits;

        /*
         Il y a une réduction si on reste plus de 5 nuits
         Je multiplie par 0.8 pour avoir 20% de réduction
         */
        if (this.dureeNuits > 5) {
            montantTotal = (int) (montantTotal * 0.8);
        }

        return montantTotal;
    }

    public boolean aUneDateArriveeCorrecte() {
        Date maintenant = new Date();
        if (this.dateDebut.after(maintenant)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean aUnNombreDeNuitsCorrect() {
        if (this.dureeNuits >= 1 && this.dureeNuits <= 31) {
            return true;
        } else {
            return false;
        }
    }

    public boolean aUnNombreDeVoyageursCorrect() {
        if (this.nombrePersonnes <= this.hebergement.getCapaciteMax()) {
            return true;
        } else {
            return false;
        }
    }

}