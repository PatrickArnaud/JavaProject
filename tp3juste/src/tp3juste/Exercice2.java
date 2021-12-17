/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

/**
 *
 * @author Patri
 */
public class Exercice2 {

    public static void main(String[] args) {
        int i;
        int o;
        int p;
        int q;
        System.out.println("saisir un premier nombre");
        i = Clavier.lireInt();
        System.out.println("saisir un deuxième nombre");
        o = Clavier.lireInt();
        System.out.println("saisir un deuxième nombre");
        p = Clavier.lireInt();
        System.out.println("saisir un deuxième nombre");
        q = Clavier.lireInt();
        if (i > o && i > p && i > q) {
            System.out.println("I est le plus grand    :" + i);
        } else if (o > i && o > p && o > q) {
            System.out.println("O est le plus grand    :" + o);
        } else if (p > i && p > o && p > q) {
            System.out.println("P est le plus grand    :" + p);
        } else {
            System.out.println("Q est le plus grand    :" + q);

        }
    }
}
