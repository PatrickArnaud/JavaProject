/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesapllication;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Patri
 */
public class Exercice3 {

    public static String test;

    public static void saisie() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Personne> arraylist = new ArrayList<>();
        System.out.println("voulez vous rentrer saisir une personne?");
        test = sc.nextLine();

        do {
            if (test.equals("oui")) {
                Personne personne = new Personne();
                System.out.println("saissisez le nom");
                String nom = sc.nextLine();
                personne.setNom(nom);

                System.out.println("saissisez le prenom");
                String prenom = sc.nextLine();
                personne.setPrenom(prenom);

                System.out.println("saissisez l'adresse");
                String adresse = sc.nextLine();
                personne.setAdresse(adresse);

                System.out.println("saissisez la ville");
                String ville = sc.nextLine();
                personne.setVille(ville);
                sc.nextLine();

                System.out.println("saissisez le CP");
                int codePostal = sc.nextInt();
                personne.setCodePostal(codePostal);

                System.out.println("saissisez l'age");
                int age = sc.nextInt();
                personne.setAge(age);
                
                sc.nextLine();
                arraylist.add(personne);

                System.out.println("continuez ?");
                test = sc.nextLine();
            }

        } while (test.equals("oui"));
    }
}

//        int tampon = 0;
//        int index = 0;
//
//        for (int i = 0; i < tableau.length; i++) {
//            if (tampon < tableau[i].getAge()) {
//                tampon = tableau[i].getAge();
//                index = i;
//            }
//        }
//        System.out.println("plus vieux " + tableau[index].getNom());
//
//        for (int i = 0; i < tableau.length; i++) {
//            if (tampon > tableau[i].getAge()) {
//                tampon = tableau[i].getAge();
//                index = i;
//            }
//        }
//        System.out.println("plus jeune " + tableau[index].getNom());
//    }

