package javabnb.logement;

import javabnb.Utilisateurs.Personne;


public class Logement {

    private Personne proprietaire;
    private int prixNuit;
    private String adresse;
    private int surface;
    private int capaciteMax;

    public Logement(Personne leProprio, int lePrix, String lAdresse, int laSurface, int capacite) {
        this.proprietaire = leProprio;
        this.prixNuit = lePrix;
        this.adresse = lAdresse;
        this.surface = laSurface;
        this.capaciteMax = capacite;
    }

    public int getPrixNuit() {
        return prixNuit;
    }

    public Personne getProprietaire() {
        return proprietaire;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getSurface() {
        return surface;
    }

    public void afficherDetails() {
        System.out.println("\n========== Informations du logement ==========");
        System.out.print("Propriétaire : ");
        this.proprietaire.afficherInfos();
        System.out.println("\nAdresse : " + this.adresse);
        System.out.println("Surface habitable : " + this.surface + " m²");
        System.out.println("Tarif : " + this.prixNuit + "€ par nuit");
    }

}