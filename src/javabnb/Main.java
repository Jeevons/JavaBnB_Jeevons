package javabnb;

import javabnb.logement.Appartement;
import javabnb.logement.Maison;
import javabnb.utils.Utils;
import javabnb.Utilisateurs.Voyageur;
import javabnb.Utilisateurs.Hote;
import javabnb.reservations.Sejour;
import javabnb.reservations.Reservation;
import javabnb.reservations.SejourFactory;
import java.util.Date;


public class Main {

    public static void main(String[] args) {

        Voyageur client1 = new Voyageur("Thomas", "Bernard", 32);
        Hote proprietaire = new Hote("Marie", "Laurent", 45, 2, 12);

        Maison maisonParis = new Maison(proprietaire, 95, "23 avenue des Fleurs, 75015 Paris", 85, 5, 40, false);
        Appartement appartBordeaux = new Appartement(proprietaire, 65, "12 rue Saint-Michel, 33000 Bordeaux", 55, 3, 8, 2);

        int duree = 20;
        Date dateArrivee = Utils.creerDate(5, 7, 2024);
        
        int nbVoyageurs = 6;
        
        // Utilisation de la Factory pour créer le bon type de séjour automatiquement
        Sejour leSejour = SejourFactory.createSejour(dateArrivee, duree, maisonParis, nbVoyageurs);
        
        Reservation laReservation = new Reservation(leSejour, client1);
        
        laReservation.afficher();

    }

}