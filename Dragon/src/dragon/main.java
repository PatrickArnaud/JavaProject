package dragon;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String begin = "";
        ArrayList<Dragon> tabDragon = new ArrayList<>();
        do {
            Dragon drag;
            drag = new Dragon();
            drag.recordDragon();
            tabDragon.add(drag);
            System.out.println("Voulez-vous recommencer une saisie ?");
            String saisie = sc.nextLine();
            begin = saisie;
        } while (begin.equals("oui"));
        showSearchArray.showArray(tabDragon);

    }

  

}
