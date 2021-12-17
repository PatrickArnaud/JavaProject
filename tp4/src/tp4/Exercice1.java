package tp4;

public class Exercice1 {

    public static void main(String args[]) {
        int n, som;
        som = 0;
        int i = 0;
        do {
            System.out.println(i + "-Donnez un entier");
            n = Clavier.lireInt();
            som += n;
            i++;
        } while (i < 4) ;
        System.out.println("Somme = " + som);
    }
}
