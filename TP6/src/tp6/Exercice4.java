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
public class Exercice4 {

    public static void IntroExo4() {
        System.out.println("4. Exercice : Saisir et afficher un tabeau\n"
                + "On demande à l'utilisateur de saisir une série de nombres entiers positifs ou négatifs.\n"
                + "A chaque saisie on place la valeur lue dans une case d'un tableau.\n"
                + "La saisie s'arrête lorsque l'utilisateur tape 0 ou lorsque le tableau est plein.\n"
                + "Lorsque la saisie est terminée, le programme affiche le contenu du tableau");
    }

    public static void Saisie4() {

        Scanner sc = new Scanner(System.in);
        System.out.println(" combien de valeur souhaitez vous saisir ?   (0 pour arreter)");
        int longueur = sc.nextInt();
        int[] tab = new int[longueur];

        for (int i = 0; i < longueur; i++) {
            Scanner donne = new Scanner(System.in);
            int saisie = donne.nextInt();
            if (saisie != 0) {
                tab[i] = saisie;
            } else {
                i = longueur;
            }
        }
        System.out.println(Arrays.toString(tab));
    }
}
