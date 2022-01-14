/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication32;



import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Patri
 */
public class JavaApplication32 {

  





    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SaisieDragon dragons = new SaisieDragon();


        dragons.creatTabDragon();


        Scanner scanner=new Scanner(System.in);
        String saisieMain = scanner.nextLine();
        int saisiMainInt=scanner.nextInt();
        System.out.println("A present que souhaitez-vous faire? ");
        String [] todo = {"1- recherchez", "\n2- qui crache du feux?","\n3- Classez par taille croissante", "\n4- Classez par taille décroissante", "\n5- Modifier un comportement", "\n6- supprimer un dragon" };

        while (saisieMain.equalsIgnoreCase("oui")&&saisieMain.equalsIgnoreCase("non")) {
        if(saisieMain.equalsIgnoreCase("oui")) {

            dragons.recordDragon();

        } else {
            System.out.println("merci");
        }

        }


    }
}

    
