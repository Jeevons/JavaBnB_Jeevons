package javabnb;

import javabnb.logement.Appartement;
import javabnb.logement.Maison;
import javabnb.utils.Utils;
import javabnb.Utilisateurs.Voyageur;
import javabnb.Utilisateurs.Hote;
import javabnb.reservations.Sejour;
import javabnb.reservations.Reservation;


public class Main {

    public static void main(String[] args) {

        Voyageur client1 = new Voyageur("Thomas", "Bernard", 32);
        Hote proprietaire = new Hote("Marie", "Laurent", 45, 2, 12);

        Maison maisonParis = new Maison(proprietaire, 95, "23 avenue des Fleurs, 75015 Paris", 85, 5, 40, false);
        Appartement appartBordeaux = new Appartement(proprietaire, 65, "12 rue Saint-Michel, 33000 Bordeaux", 55, 3, 8, 2);

        Sejour leSejour = new Sejour(Utils.creerDate(5, 7, 2024), 4, maisonParis, 3);
        
        // Création de la réservation (Le Voyageur réserve le séjour)
        Reservation laReservation = new Reservation(leSejour, client1);
        
        laReservation.afficher();

    }

}