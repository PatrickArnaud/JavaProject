/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

import java.util.Scanner;

/**
 *
 * @author Patri
 */
public class Exercice3 {

    public static void IntroExo3() {
        System.out.println("Programme Fairesomme\n"
                + "Var\n"
                + "ValeurLue : Nombre\n"
                + "Lasomme : Nombre\n"
                + "Début\n"
                + "Lasomme =0\n"
                + "Ecrire(ecran, \" Entrez une série de valeurs\")\n"
                + "Lire(clavier, Valeurlue)\n"
                + "Tant que ValeurLue<>0 Faire\n"
                + "Lasomme=LaSomme+ValeurLue\n"
                + "lire(clavier, ValeurLue)\n"
                + "Fin tanque\n"
                + "Afficher \" La somme des valeurs saisie est \", Lasomme\n"
                + "fin\n"
                + "Posons maintenant comme postulat que l'on connaît le nombre maxi de nombre saisis ( 5 ).\n"
                + "Modifiez cet algorithme et produisez le programme correspondant en employant un tableau");
    }

    public static int[] Saisie3() {
        int chiffres;
        int i = 5;
        int[] TableauDeChiffre = new int[i];
        System.out.println("saisissez Cinq chiffre : ");
        for (int j = 0; j < 5; j++) {
            Scanner sc = new Scanner(System.in);
            chiffres = sc.nextInt();
            TableauDeChiffre[j] = chiffres;
        }
        return TableauDeChiffre;
    }

    public static void Calcul3(int[] saisie) {
        int somme = 0;
        for (int i = 0; i < saisie.length; i++) {
            int j = saisie[i];
            somme = somme + j;
        }
        System.out.println(somme);
    }
}
