package jeux;

import java.util.Random;
import java.util.Scanner;

public class Jeux {

    public static void main(String[] args) {
        int scoreJoueur = 0;
        int scoreOrdinateur = 0;

        while (scoreJoueur != 3 && scoreOrdinateur != 3) {
            Random aleatoire = new Random();
            int choixOrdinateur = aleatoire.nextInt(3) + 1;
            switch (manche(choisir(), choixOrdinateur)) {
                case 1:
                    scoreJoueur++;
                    break;
                case 2:
                    scoreOrdinateur++;
                    break;
            }
            System.out.println("votre score : " + scoreJoueur + " score adversaire : " + scoreOrdinateur);
        }
    }

    public static int choisir() {
        int choix;
        System.out.println("Selectionnez Pierre (1), Feuille (2) ou Ciseaux (3)  :");
        Scanner saisie = new Scanner(System.in);
        do {
            System.out.println("1 pour Pierre, 2 pour Feuille, 3 pour Ciseaux ");
            choix = saisie.nextInt();
        } while (choix > 3 || choix < 1);
        return choix;
    }

    public static String choixJoueur(int choix) {
        String main = null;
        switch (choix) {
            case 1:
                main = "Pierre";
                break;
            case 2:
                main = "Feuille";
                break;
            case 3:
                main = "Ciseaux";
                break;
        }
        return main;
    }

    public static int manche(int choix, int choixOrdinateur) {
        int resultat;
        System.out.println(" vous avez joué " + choixJoueur(choix) + ", votre adversaire a joué " + choixJoueur(choixOrdinateur) + ".");
        if (choix == 1 && choixOrdinateur == 3 || choix == 2 && choixOrdinateur == 1 || choixOrdinateur == 2 && choix == 3) {
            System.out.println("Tu as gagné !  car tu as fait " + choixJoueur(choix) + ", et ton adversaire a fait " + choixJoueur(choixOrdinateur));
            resultat = 1;
        } else if (choixOrdinateur == choix) {
            System.out.println("Egalité !");
            resultat = 0;
        } else {
            System.out.println("tu as perdu cette manche car tu as fait " + choixJoueur(choix) + "et ton adversaire a fait " + choixJoueur(choixOrdinateur) + ".");
            resultat = 2;
        }
        return resultat;
    }
}
//    void rejouer() {
//        if (scoreJoueur == 3 || scoreOrdinateur == 3) {
//            int choix;
//            Scanner saisie = new Scanner(System.in);
//            System.out.println("votre score : " + scoreJoueur + " score adversaire : " + scoreOrdinateur);
//            System.out.println("La partie est terminée !");
//            System.out.println("souhaitez-vous rejouer ? ");
//            do {
//                System.out.println("1 : oui   || 2 : non  ");
//                choix = saisie.nextInt();
//            } while (choix > 2 || choix < 1);
//            if (choix == 1) {
//                scoreJoueur = 0;
//                scoreOrdinateur = 0;
//                System.out.println("Nouvelle partie  !");
//
//            } else {
//                System.out.println("Aurevoir !");
////            }
//            }
//        }
//    }
//}

//    public static boolean rejouer(int scoreJoueur, int scoreOrdinateur) {
//        if (scoreJoueur == 3 || scoreOrdinateur == 3) {
//            int choix;
//            Scanner saisie = new Scanner(System.in);
//            System.out.println("votre score : " + scoreJoueur + " score adversaire : " + scoreOrdinateur);
//            System.out.println("La partie est terminée !");
//            System.out.println("souhaitez-vous rejouer ? ");
//            do {
//                System.out.println("1 : oui   || 2 : non  ");
//                choix = saisie.nextInt();
//            } while (choix > 2 || choix < 1);
//            if (choix == 1) {
//                scoreJoueur = 0;
//                scoreOrdinateur = 0;
//                System.out.println("Nouvelle partie  !");
//
//            } else {
//                System.out.println("Aurevoir !");
//            }
//        } else {
//            System.out.println("continuons de jouer...");
//        }
//        return false;
//    }
//
//    public static boolean victoire(int scoreJoueur, int scoreOrdinateur) {
//        if (scoreJoueur == 3 || scoreOrdinateur == 3) {
//
//            if (scoreJoueur > scoreOrdinateur) {
//                System.out.println("Félicitation vous-avez gagné :) ");
//            } else {
//                System.out.println("Désolé, vous avez perdu :( ");
//            }
//        } else {
//        }
//        return true;
//    }

