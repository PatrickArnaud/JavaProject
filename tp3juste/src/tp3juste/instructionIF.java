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
public class instructionIF {

    public static void main(String[] args) {

        int i;
        System.out.println("saisir chiffre :");
        i = Clavier.lireInt();
        if (i != 1) {
            System.out.println("t'est un champion");
            System.exit(-1);
        } else {
            System.out.println("naze!");
        }
    }
}
