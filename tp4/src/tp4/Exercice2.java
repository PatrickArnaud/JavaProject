package tp4;

public class Exercice2 {

    public static void main(String args[]) {
        int i = 0;
        int notes;
        float somme = 0;
        double saisie;
        System.out.println("combien de notes souhaitez-vous rentrer ?");
        notes = Clavier.lireInt();
        do {
            System.out.println(i + 1 + " sur " + notes + " //  Donnez une note");
            saisie = Clavier.lireDouble();
            if (saisie >= 0 && saisie <= 20) {
                somme += saisie;
                i++;
            } else {
                System.out.println("merci de rentrer une note entre 0 et 20");
            }
        } while (i < notes);
        resultat(moyenne(somme, i));
        moyenne(somme, i);
    }

    public static double moyenne(float somme, int i) {
        float moyenne = somme / i;
        double resultatAcomparer = moyenne;
        return resultatAcomparer;
    }

    public static void resultat(double resultatAcomparer) {
        double resultatArrondi = Math.round(resultatAcomparer * 100.0) / 100.0;
        if (resultatAcomparer < 8) {
            System.out.println("vous êtes recalé // moyenne :" + resultatArrondi);
        } else if (resultatAcomparer >= 8 && resultatAcomparer < 10) {
            System.out.println("repêchage // moyenne :" + resultatArrondi);
        } else if (resultatAcomparer >= 10 && resultatAcomparer < 12) {
            System.out.println("admis // moyenne :" + resultatArrondi);
        } else if (resultatAcomparer >= 12 && resultatAcomparer < 14) {
            System.out.println("assez bien // moyenne :" + resultatArrondi);
        } else if (resultatAcomparer >= 14 && resultatAcomparer < 16) {
            System.out.println("bien // moyenne :" + resultatArrondi);
        } else {
            System.out.println("Très bien  // moyenne :" + resultatAcomparer);
        }
    }
}

