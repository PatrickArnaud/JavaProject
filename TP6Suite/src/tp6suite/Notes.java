package tp6suite;

import java.util.Scanner;
import static tp6suite.Aleatoire.alea;

public class Notes {

    static double note[][];
    double moyenne[] = new double[3];

    public void calculeMoyennes() {
        double sum;
        for (int i = 0; i < 3; ++i) {
            sum = 0.0;
            for (int j = 0; j < 4; ++j) {
                sum += note[i][j];
            }
            moyenne[i] = sum / 4;
        }
    }

    public void afficheNotesMoy() {
        for (int i = 0; i < 4; ++i) {
            System.out.print("\tét." + i);
        }
        System.out.println("\tmoyenne");
        for (int i = 0; i < 3; ++i) {
            System.out.print("Grp " + i + '\t');
            for (int j = 0; j < 4; ++j) {
                System.out.print(note[i][j] + "\t");
            }
            System.out.println(moyenne[i]);
        }
    }

    public static void testNotes() {
        Notes f = new Notes();
        f.calculeMoyennes();
        f.afficheNotesMoy();
    }

    public static void remplirMatrice(int n, int m) {
        int[][] notes = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                notes[i][j] = alea(0, 20);
            }
        }
        for (int i = 0; i < notes.length; i++) {
            for (int j = 0; j < notes[0].length; j++) {
                System.out.print(notes[i][j] + "\t");
            }
            System.out.println("examen :" + i);
        }
    }

    public static void matriceSaisie() {
        System.out.print("Saisir le nombre de lignes dans la matrice: ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.print("Saisir le nombre de colonnes dans la matrice: ");
        int n = sc.nextInt();
        //déclarer la matrice
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(String.format("Entrez a[%d][%d] : ", i, j));
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        // fermez scanner
        sc.close();
    }

    public static void multiplie() {
        int A[][] = {{1, 2}, {3, 4}};
        int B[][] = {{5, 6}, {7, 8}};
        //Créer une matrice pour stocker la multiplication
        //2 lignes et 2 colonnes    
        int C[][] = new int[2][2];
        //multiplication
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                C[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
