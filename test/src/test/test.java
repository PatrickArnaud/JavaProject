/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.security.Identity;
import java.util.Random;

public class test {

    public static void main(String[] args) {

        play();
//        pcHand("pcChoice");
//        comparaison();

    }

    public static String pcHand(String pcChoice) {	// main de l'ordi, au hazars
        String game[][] = {
            {
                "Pierre", "1"
            },
            {
                "Papier", "2"
            },
            {
                "Ciseaux", "3"
            }
        };
        Random random = new Random();
        int randomValue = random.nextInt(game.length);

//	System.out.println("player 1 a joué "+ game[randomValue][0]+" ");
//	System.out.println("qui a pour valeur "+game[randomValue][1] );
        return game[randomValue][1];

    }

    public static void asking() {
        System.out.println("bonjour bienvenue dans ce jeu de Pierre-Papier-Ciseaux.");
        System.out.println("choissez 1 pour Pierre");
        System.out.println("choissez 2 pour Papier");
        System.out.println("choissez 3 pour Ciseaux");

    }

    public static void play() {
        asking();        
        int number = Clavier.lireInt();

        if (number == 1 || number == 2 || number == 3) {
            if (number == 1) {

                System.out.println("vous avez choisi Pierre");
            } else if (number == 2) {

                System.out.println("vous avez choisi Papier");
            } else {

                System.out.println("vous avez choisi Ciseaux");
            }
        } else {
            System.err.println("vous n'avez pas saissi un choix valide, veuillez recommencer");
        }
        comparaison(number);
    }

    public static void comparaison(int number) {

//        String pcChoice = pcHand("0");
//        System.out.println(pcChoice);
//
//        int iPcChoice = Integer.parseInt(pcChoice);
//        System.out.println("je recupère la main du pc qui a joué " + (iPcChoice));

//        int choice = play();
//        System.out.println("je recupère la main du joueur" + choice);

//	if (pcChoice<playerHand) {
//		System.out.println("vous gagnez!");
//	} else if(pcChoice>playerHand) {
//		System.err.println("vous perdez, LOOSER!");
//	}else {
//		play(0);
//	}
//	
    }

}
