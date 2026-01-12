package javabnb.reservations;

import java.util.Date;
import javabnb.logement.Logement;
import javabnb.utils.Utils;


public abstract class Sejour implements Reservable {

    private Date dateDebut;
    private int dureeNuits;
    Logement hebergement;
    private int nombrePersonnes;
    protected int prix;

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
        
        // Calcul du prix immédiatement
        miseAJourDuPrixDuSejour();
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
        System.out.println("Prix total du séjour : " + this.prix + "€");
    }
    
    @Override
    public boolean aUneDateArriveeCorrecte() {
        Date maintenant = new Date();
        return this.dateDebut.after(maintenant);
    }

    @Override
    public boolean aUnNombreDeVoyageursCorrect() {
        return this.nombrePersonnes <= this.hebergement.getCapaciteMax();
    }

    public int getDureeNuits() {
        return dureeNuits;
    }

    public Logement getHebergement() {
        return hebergement;
    }

    public abstract void miseAJourDuPrixDuSejour();

}