package tamagochi;

import java.util.Scanner;

public class Tamagochi {

    public static void main(String[] args) {
        
        System.out.println("Lancer le jeu (True/False) ?");
        Scanner scn = new Scanner(System.in);
        Boolean lancement = scn.nextBoolean() ;
        if (lancement) {
            Creature kiki = new Creature(10, 10, 10, 10, 10, true);
        kiki.bois();
        kiki.mange();
        kiki.bois();
        kiki.mange();
        kiki.bois();
        kiki.mange();
        kiki.bois();
        kiki.mange();
        kiki.sport();
        kiki.mange();
        kiki.mange();
        System.out.println(kiki.toString());
        }
        else {
            System.out.println("A plus"); 
        }
        

    }

}
