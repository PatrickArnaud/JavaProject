package tp6;

import java.util.Arrays;

public class Exercice2 {

    public static int[] notes = {12, 14, 15, 16, 17, 18, 19, 20, 2, 7};

    public static void IntroExo2() {

        System.out.println(" Supposons que nous souhaitions déterminer, à partir de 10 notes d'élèves (fournies en\n"
                + "données), combien d'entre elles sont supérieures à la moyenne de la classe ?\n"
                + "S'il ne s'agissait que de calculer simplement la moyenne de ces notes, il nous suffirait d'en\n"
                + "calculer la somme, en les cumulant dans une variable, au fur et à mesure de leur lecture.\n"
                + "Mais, ici, il nous faut à nouveau pouvoir consulter les notes pour déterminer combien d'entre\n"
                + "elles sont supérieures à la moyenne ainsi obtenue.\n"
                + "Il est donc nécessaire de pouvoir \"mémoriser\" ces 10 notes.\n"
                + "Pour ce faire, il paraît peu raisonnable de prévoir vingt variables scalaires différentes\n"
                + "(méthode qui, de toute manière, serait difficilement transposable à un nombre important de\n"
                + "notes). Le tableau va nous offrir une solution convenable à ce problème");
    }

    public static float CalculMoy() {
        int somme = 0;
        for (int i = 0; i < notes.length; i++) {
            int j = notes[i];
            somme = somme + j;
        }
        float moyenne = somme / notes.length;
        return moyenne;
    }
    
     public static void afficherLesNotes() {
         String affichage = Arrays.toString(notes);
         System.out.println("les notes du candidat :"+affichage);
     }

    public static void auDessusEnDesoous(float moyenne) {
        int superieur = 0;
        int inferieur = 0;
        for (int i = 0; i < notes.length; i++) {
            int note = notes[i];
            if (note > moyenne) {
                superieur++;
            } else {
                inferieur++;
            }
        }
        System.out.println(" nombre de note au dessus de la moyenne  " + superieur);
        System.out.println(" nombre de note en dessous de la moyenne  " + inferieur);
    }

    public static void AfficheMoyenne(float moyenne) {
        System.out.println("Moyenne = " + moyenne);
    }
}
