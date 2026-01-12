package javabnb.reservations;

import java.util.Date;
import javabnb.logement.Logement;

public final class SejourFactory {

    private SejourFactory() {
    }

    public static Sejour createSejour(Date dateArrivee, int nbNuits, Logement logement, int nbVoyageurs) {
        Sejour sejour;
        if (nbNuits <= 5) {
            sejour = new SejourCourt(dateArrivee, nbNuits, logement, nbVoyageurs);
        } else {
            sejour = new SejourLong(dateArrivee, nbNuits, logement, nbVoyageurs);
        }
        return sejour;
    }
}
