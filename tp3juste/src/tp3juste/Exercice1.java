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
public class Exercice1 {
        public static void main(String[] args) {
            int i = 0;
            System.out.println("veuillez saisir la note ( sur 20 )");
            i = Clavier.lireInt();
            if (i>=16) {
                System.out.println("TB");
            } else if (i>=14){
                 System.out.println("B");
            }  else if (i>=12){
                 System.out.println("AB");
            }  else if (i>=10){
                 System.out.println("admis");
            }  else if (i>=8){
                 System.out.println("repeche");
            } else {
                System.out.println("refusé");
            }
        }
}
