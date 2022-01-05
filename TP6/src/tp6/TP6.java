/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

import static tp6.Exercice1.Saisie;
import static tp6.Exercice2.AfficheMoyenne;
import static tp6.Exercice2.CalculMoy;
import static tp6.Exercice2.IntroExo2;
import static tp6.Exercice2.afficherLesNotes;
import static tp6.Exercice2.auDessusEnDesoous;
import static tp6.Exercice3.Calcul3;
import static tp6.Exercice3.IntroExo3;
import static tp6.Exercice3.Saisie3;
import static tp6.Exercice4.Saisie4;

public class TP6 {

    public static void main(String[] args) {

//      lancement exo1
//        Exercice1.IntroExo1();
//        Exercice1.Calcul(Saisie());
//        lancement exo2
        IntroExo2();
        afficherLesNotes();
        AfficheMoyenne(CalculMoy());
        auDessusEnDesoous(CalculMoy());
//        lancement exo3
//        IntroExo3();
//        Calcul3(Saisie3());
//        Saisie4();
    }

}
