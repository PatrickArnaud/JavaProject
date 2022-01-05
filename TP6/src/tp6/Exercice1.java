/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Patri
 */
public class Exercice1 {

    public static int TableauDeChiffre[];

    public static void IntroExo1() {
        System.out.println("1. Exercice : saisir un tableau\n"
                + "Ecrire un programme ( n'oubliez pas qu'il est plus facile de commencer par un algo ) qui : Lit\n"
                + "dans un tableau 5 valeurs fournie au clavier (voir Scanner précédent tp)En calcule et en\n"
                + "affiche la moyenne, la plus grande et la plus petite valeur");
    }

    public static int[] Saisie() {
        int chiffres;
        int i = 5;
        int[] TableauDeChiffre = new int[i];
        System.out.println("saisissez Cinq chiffre : ");
        for (int j = 0; j < 5; j++) {
            Scanner sc = new Scanner(System.in);
            chiffres = sc.nextInt();
            TableauDeChiffre[j] = chiffres;
        }
        System.out.println(Arrays.toString(TableauDeChiffre));
        return TableauDeChiffre;
    }

    public static void LireTableau(int[] saisie) {
        for (int i = 0; i < saisie.length; i++) {
            int j = saisie[i];
            System.out.println(j);
        }
        String affichage = Arrays.toString(saisie);
        System.out.println(" contenu du tableau " + affichage);
    }

    public static void Calcul(int[] saisie) {
        float somme = 0;
        for (int i = 0; i < saisie.length; i++) {
            int j = saisie[i];
            somme = somme + j;
        }
        System.out.println("  " + somme);
        float moyenne = somme / saisie.length;
        System.out.println("moyenne : " + moyenne);
        int maxVal = Integer.MAX_VALUE;
        int minVal = Integer.MIN_VALUE;
        for (int i = 0; i < saisie.length; i++) {
            if (saisie[i] < maxVal) {
                maxVal = saisie[i];
            }
            if (saisie[i] > minVal) {
                minVal = saisie[i];
            }
        }
        System.out.print("\nValeur minimale = " + maxVal);
        System.out.print("\nValeur maximale = " + minVal);
        System.out.println("");
    }

}
