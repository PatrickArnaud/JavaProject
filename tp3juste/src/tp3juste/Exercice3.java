/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Patri
 */
public class Exercice3 {

    public static void main(String[] args) {

        Date dateDuJour = new Date();
        jour(dateDuJour);
        heure(dateDuJour);
        System.out.println("saisir le jour");
        int jour;
        jour = Clavier.lireInt();
        System.out.println("saisir le mois");
        String mois;
        mois = Clavier.lireString();
        System.out.println("saisir l'année");
        int annee;
        annee = Clavier.lireInt();
        saisirDate(jour,mois,annee);

    }

     public static void jour(Date dateDuJour){
         SimpleDateFormat dateFormate = new SimpleDateFormat("dd MM yyyy");  
         System.out.println(dateFormate.format(dateDuJour));
         
             }
     public static void heure(Date dateDuJour){
          SimpleDateFormat dateFormate = new SimpleDateFormat("HH:MM:ss"); 
          System.out.println(dateFormate.format(dateDuJour));
             }
     public static void saisirDate (int jour, String mois, int annee){
         System.out.println("vous êtes né le :" + jour +"/"+ mois +"/"+ annee );          
             }
   
}
