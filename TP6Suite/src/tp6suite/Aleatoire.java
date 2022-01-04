package tp6suite;

public class Aleatoire {

    int[] nombre = new int[5];

    public static int alea(int lower, int higher) {
        int random = (int) (Math.random() * (higher - lower + 1)) + lower;
        return random;
    }

    public void stockeNombres() {
        for (int i = 0; i < nombre.length; ++i) {
            nombre[i] = alea(0, 10);
        }
    }

    public void afficheNombres() {
        for (int i = 0; i < nombre.length; ++i) {
            System.out.println(nombre[i] + "\n");
        }

    }

}
