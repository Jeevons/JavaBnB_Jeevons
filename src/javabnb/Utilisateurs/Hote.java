package javabnb.Utilisateurs;

public class Hote extends Personne {

    private int nombreLogements;
    private int delaiDeReponse;

    public Hote(String lePrenom, String leNom, int lAge, int nbLogements, int delai) {
        super(lePrenom, leNom, lAge);
        this.nombreLogements = nbLogements;
        this.delaiDeReponse = delai;
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        String message;
        if (this.delaiDeReponse == 1) {
            message = " qui s'engage à répondre dans l'heure";
        } else {
            message = " qui s'engage à répondre dans les " + this.delaiDeReponse + " heures";
        }
        System.out.print(message);
    }

}