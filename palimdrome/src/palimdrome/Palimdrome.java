/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palimdrome;

import java.util.Scanner;


public class Palimdrome {

//    
    public static void main(String[] args) {
        Compare(Test(Mot()));
    }

    public static String Mot() {
        String mot;
        System.out.println("saisissez un mot: ");
        Scanner scanner = new Scanner(System.in);
        mot = scanner.nextLine();
        return mot;
    }

    public static boolean Test(String mot) {
        System.out.println("traitement ...");       
        return mot.equals(new StringBuffer().append(mot).reverse().toString());
    }

    public static void Compare(Boolean mot) {
        if (mot == true) {
            System.out.println("le mot est un palimdrome");
        } else {
            System.out.println("le mot n'est pas un palimdrome");
        }
    }
}
