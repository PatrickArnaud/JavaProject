/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpcomptebancaire;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.time.Period;
import java.util.Calendar;

/**
 *
 * @author Patri
 */
public class Client {

    public Client() {
    }

    public Client(String nom, String prenom, String adresseLigne1, String adresseLigne2, String adresseCP, Date dateDeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresseLigne1 = adresseLigne1;
        this.adresseLigne2 = adresseLigne2;
        this.adresseCP = adresseCP;
        this.dateDeNaissance = dateDeNaissance;
    }

    private String nom;
    private String prenom;
    private String adresseLigne1;
    private String adresseLigne2;
    private String adresseCP;
    private String adresseVille;
    private Date dateDeNaissance;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresseLigne1() {
        return adresseLigne1;
    }

    public void setAdresseLigne1(String adresseLigne1) {
        this.adresseLigne1 = adresseLigne1;
    }

    public String getAdresseLigne2() {
        return adresseLigne2;
    }

    public void setAdresseLigne2(String adresseLigne2) {
        this.adresseLigne2 = adresseLigne2;
    }

    public String getAdresseCP() {
        return adresseCP;
    }

    public void setAdresseCP(String adresseCP) {
        this.adresseCP = adresseCP;
    }

    public String getAdresseVille() {
        return adresseVille;
    }

    public void setAdresseVille(String adresseVille) {
        this.adresseVille = adresseVille;
    }

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public void setManuelNom() {
        System.out.println("nom du client  : ");
        Scanner saisieNomClient = new Scanner(System.in);
        String nomClient = saisieNomClient.nextLine();
        setNom(nomClient);;
    }

    public void setManuelPrenom() {
        System.out.println("prénom du client  : ");
        Scanner saisiePrenomClient = new Scanner(System.in);
        String prenomClient = saisiePrenomClient.nextLine();
        setPrenom(prenomClient);;
    }

    public void setManuelAdresseLigne1() {
        System.out.println("adresse ligne 1 du client  : ");
        Scanner saisieAdresseLigne1 = new Scanner(System.in);
        String adresseLigne1Client = saisieAdresseLigne1.nextLine();
        setAdresseLigne1(adresseLigne1Client);;
    }

    public void setManuelAdresseLigne2() {
        System.out.println("adresse ligne 2 du client  : ");
        Scanner saisieAdresseLigne2 = new Scanner(System.in);
        String adresseLigne2Client = saisieAdresseLigne2.nextLine();
        setAdresseLigne2(adresseLigne2Client);;
    }

    public void setManueladresseCP() {
        System.out.println("code postal du client  : ");
        Scanner saisieadresseCP = new Scanner(System.in);
        String adresseCPClient = saisieadresseCP.nextLine();
        setAdresseCP(adresseCPClient);;
    }

    public void setManuelAdresseVille() {
        System.out.println("ville du client  : ");
        Scanner saisieAdresseVille = new Scanner(System.in);
        String adresseVilleClient = saisieAdresseVille.nextLine();
        setAdresseVille(adresseVilleClient);;

    }

    public void setManueldateDeNaissance() {
        System.out.println("date de naissance du client au format dd-MM-yyyy : ");
        Scanner saisiedateDeNaissance = new Scanner(System.in);
        String dateDeNaissanceClient = saisiedateDeNaissance.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.FRENCH);
        try {
            Date date = dateFormat.parse(dateDeNaissanceClient);
            setDateDeNaissance(date);
        } catch (ParseException e) {
            e.printStackTrace();

        }

    }

    public void calculAge() {
        Date DateDuJour = new Date();
        DateDuJour.getTime();
        dateDeNaissance.getTime();
        float calcAge = DateDuJour.getTime() - dateDeNaissance.getTime();
        float seconde = (float) (calcAge / 1000.00);
        float minute = (float) (seconde / 60.00);
        float heure = (float) (minute / 60.00);
        float jour = (float) (heure / 24.00);
        float annee = (float) (jour / 365.25);
        float anneeModulo = annee % 1;
        float anneePleine = (int) annee;
        float testEnMois = anneeModulo * 12;
        float moisModulo = testEnMois % 1;
        float moisPlein = (int) testEnMois;

        if ( moisPlein == 1 || moisPlein == 3 || moisPlein == 5 || moisPlein == 7|| moisPlein == 9 || moisPlein == 11 ) {
            float jourPlein = (int) (moisModulo * 31);
            System.out.println("cas 1");
            System.out.println("ans  : " + anneePleine);
            System.out.println("mois : " + moisPlein);
            System.out.println("jour : " + jourPlein);
        } else if (moisPlein == 2) {
            float jourPlein = (int) (moisModulo * 28);
            System.out.println("cas fev");
            System.out.println("ans  : " + anneePleine);
            System.out.println("mois : " + moisPlein);
            System.out.println("jour : " + jourPlein);
        } else {
            float jourPlein = (int) (moisModulo * 30);
            System.out.println("cas 2");
            System.out.println("ans  : " + anneePleine);
            System.out.println("mois : " + moisPlein);
            System.out.println("jour : " + jourPlein);
        }

    }

    public void saisieDesInformationsClient() {
        setManuelNom();
        setManuelPrenom();
        setManuelAdresseLigne1();
        setManuelAdresseLigne2();
        setManueladresseCP();
        setManuelAdresseVille();
        setManueldateDeNaissance();
    }

    public void affichageDesInformationsClient() {
        String affichageNom = getNom();
        String affichagePrenom = getPrenom();
        String affichageAdresseLigne1 = getAdresseLigne1();
        String affichageAdresseLigne2 = getAdresseLigne2();
        String affichageCP = getAdresseCP();
        String affichageVille = getAdresseVille();
        Date affichageDateDeNaissance = getDateDeNaissance();
        SimpleDateFormat s = new SimpleDateFormat("  EE dd MM yyyy   (dd/MM/yyyy)");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("FICHE CLIENT");
        System.out.println(" nom               : " + affichageNom);
        System.out.println(" prénom            : " + affichagePrenom);
        System.out.println(" adresse ligne 1   : " + affichageAdresseLigne1);
        System.out.println(" adresse ligne 2   : " + affichageAdresseLigne2);
        System.out.println(" code postal       : " + affichageCP);
        System.out.println(" Ville             : " + affichageVille);
        System.out.println(" Date de Naissance : " + (s.format(affichageDateDeNaissance)));
    }
}
