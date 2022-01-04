/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5suite;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * *
 * @author Patri
 */
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Personne {

    static String getNbInstance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //champs privés représentant le nom et le prénom et la date de naissance
    private String nom;
    private String prenom;
    private LocalDate date_nais;
    // final : Une fois définie, on ne pourra plus modiffier le numéro
    private final int numero;
    // champ statique privé representant le compteur de personne
    private static int nbInstances;

    public long calculAge() {
        return date_nais.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    public String getNom() {
        return nom;
    }

    /**
     * Stocke le nom en majuscule dans l'objet
     *
     * @param n
     */
    public void setNom(String n) {
        nom = n.toUpperCase();
    }

    public String getPrenom() {
        return prenom;
    }

    /**
     * stocke la date de naissance
     *
     */
    public void setDate_nais(LocalDate date_naiss) {
        date_nais = date_naiss;
    }

    public LocalDate getDate_nais() {
        return date_nais;
    }

    /**
     * Stocke le prénom en minuscule
     *
     * @param p
     */
    public void setPrenom(String p) {
        prenom = p.toLowerCase();
    }

    /*
     * Methode d'instance permettant d'obtenir le numéro d'une personne
     * @return
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Constructeur création d'une nouvelle persone donc incrementation du
     * compteur affectation à la nouvelle personne de son numéro
     */
    public Personne() {
        // nbInstance est static
        nbInstances++;
        //numero n'est pas static
        numero = nbInstances;
    }

    /**
     * Méthode défini dans Personne
     *
     *
     *
     *
     */
    public void affichage() {
        System.out.println("nom : " + nom);
        System.out.println("prénom : " + prenom);
        System.out.println("âge : "
                + calculAge());
    }

    /**
     * Nouveau constructeur
     *
     */
    public Personne(String nom, String prenom, LocalDate date_nais) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setDate_nais(date_nais);
        nbInstances++;
        numero = nbInstances;
    }

//    public String toString() {
//        return "Personne numéro " + this.numero
//                + "; \nNombre total de personne : "
//                + nbInstances;
//    }

}
