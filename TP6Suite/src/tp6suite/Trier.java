package tp6suite;

public class Trier {

    static void trierSelec (int[] tableau) {
        int taille = tableau.length;
        int tmp = 0;
        for (int i = 0; i < taille; i++) {
            for (int j = 1; j < (taille - i); j++) {
                if (tableau[j - 1] > tableau[j]) {
                    //echanges des elements
                    tmp = tableau[j - 1];
                    tableau[j - 1] = tableau[j];
                    tableau[j] = tmp;
                    System.out.println(tmp);
                }

            }
        }
    }

//    static void affiche(int[] tab) {
//        for (int i = 0; i < tab.length; i++) {
//            System.out.print(tab[i] + " ");
//        }
//        System.out.println();
//    }
//}
    static int[] trierBulle(int[] tableau) {
        int taille = tableau.length;
        boolean inversion;
        do {
            inversion = false;
            for (int i = 0; i < taille - 1; i++) {
                System.out.println("tableau i" + tableau[i] + "     tableau i+1" + tableau[i + 1]);
                if (tableau[i] > tableau[i + 1]) {
                    int tampon = tableau[i];
                    tableau[i] = tableau[i + 1];
                    tableau[i + 1] = tampon;               
                    inversion = true;
                }
            }
            System.out.println(inversion);
        } while (inversion);
        System.out.println("j'ai fini" + tableau);
        return tableau;
    }

    static void affiche(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + "  ");
        }
        System.out.println();
    }
    
        

}
