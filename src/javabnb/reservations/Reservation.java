package javabnb.reservations;

import java.util.Date;

import javabnb.Utilisateurs.Voyageur;
import javabnb.logement.Logement;
import javabnb.utils.Utils;


public class Reservation {

    private Reservable objetReservable;
    private Voyageur voyageur;
    private Date dateDeReservation;

    public Reservation(Reservable reservable, Voyageur leVoyageur) {
        this.objetReservable = reservable;
        this.voyageur = leVoyageur;
        this.dateDeReservation = new Date(); 
    }

    public void afficher() {
        System.out.println("Date de la réservation : " + Utils.formatterDate(this.dateDeReservation));
        System.out.print("Voyageur : ");
        this.voyageur.afficherInfos();
        System.out.println("\nA réservé chez");
        this.objetReservable.afficher();
    }
}
