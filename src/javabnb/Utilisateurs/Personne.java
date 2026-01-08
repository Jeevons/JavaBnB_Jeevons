package javabnb.Utilisateurs;

public class Personne {

    private final String prenom;
    private final String nom;
    private final int age;

    public Personne(String lePrenom, String leNom, int lAge) {
        this.prenom = lePrenom;
        this.nom = leNom;
        this.age = lAge;
    }

    public void afficherInfos() {
        System.out.print(this.prenom + " " + this.nom + ", " + this.age + " ans");
    }

}