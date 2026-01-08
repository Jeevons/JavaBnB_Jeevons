package javabnb.utils;

import java.util.Date;


public class Utils {

    // Cette méthode permet de créer une date plus facilement
    public static Date creerDate(int j, int m, int a) {
        // J'ai trouvé ça sur internet, apparement il faut enlever 1900 à l'année et 1 au mois
        return new Date(a - 1900, m - 1, j);
    }

    // Pour afficher la date correctement
    public static String formatterDate(Date laDate) {
        String jourStr = (laDate.getDate() <= 9) ? "0" + laDate.getDate() : "" + laDate.getDate();
        
        int moisNum = laDate.getMonth() + 1;
        String moisStr = (moisNum <= 9) ? "0" + moisNum : "" + moisNum;
        
        int anneeNum = laDate.getYear() + 1900;
        
        String dateFormatee = jourStr + "/" + moisStr + "/" + anneeNum;
        return dateFormatee;
    }

    private Utils(){}

}