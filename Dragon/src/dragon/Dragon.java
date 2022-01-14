package dragon;

import java.util.Scanner;

public class Dragon {

    private String nom;
    private String sexe;
    private int taille;
    private int Ecaille;
    private String feu;
    private String compAmoureux;

    public Scanner sc = new Scanner(System.in);
    public Scanner scInt = new Scanner(System.in);
    public String saisie;
    public int saisieInt;
    public boolean saisiFeu;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public int getEcaille() {
        return Ecaille;
    }

    public void setEcaille(int ecaille) {
        Ecaille = ecaille;
    }

    public String getFeu() {
        return feu;
    }

    public void setFeu(String feu) {
        this.feu = feu;
    }

    public String getCompAmoureux() {
        return compAmoureux;
    }

    public void setCompAmoureux(String compAmoureux) {
        this.compAmoureux = compAmoureux;
    }

    public Dragon(String nom, String sexe, int taille, int ecaille, String feu, String compAmoureux) {
        super();
        this.nom = nom;
        this.sexe = sexe;
        this.taille = taille;
        this.Ecaille = ecaille;
        this.feu = feu;
        this.compAmoureux = compAmoureux;
    }

    public Dragon() {

    }

    public void affichage() {
        System.out.println("Nom : " + getNom());
        System.out.println("sexe : " + getSexe());
        System.out.println("Taille : " + getTaille());
        System.out.println("Ecaille : " + getEcaille());
        System.out.println("Crache t'il du feu? : " + getFeu());
        System.out.println("et il est tr�s : " + getCompAmoureux());

    }

    public Dragon recordDragon() {
        Dragon dragon = new Dragon();
        System.out.println("Veuillez saisir le nom du dragon :");
        dragon.setNom(saisie = sc.nextLine());

        System.out.println("Veuillez saisir le sexe du dragon :F ou M");
        saisie = sc.nextLine();
        if (saisie.equalsIgnoreCase("F")) {
            dragon.setSexe("Feminin");
        } else if (saisie.equalsIgnoreCase("M")) {
            dragon.setSexe("Masculin");
        }
        while (!saisie.equalsIgnoreCase("F") && !saisie.equalsIgnoreCase("M")) {
            System.err.println("veuillez rentrer un format valide");
            System.out.println("Merci de saisir le sexe du dragon :F ou M");
        }
        System.out.println("Veuillez saisir la taille du dragon :");
        dragon.setTaille(saisieInt = scInt.nextInt());

        System.out.println("Veuillez le nombre d'ecaille  dragon :");
        dragon.setEcaille(saisieInt = scInt.nextInt());
//	sc.nextInt();

        System.out.println("Le dragon crache t-il du feu ? - oui -non");
        dragon.setFeu(saisie = sc.nextLine());

        if (saisie.equalsIgnoreCase("non")) {
            System.out.println("votre dragon est compl�tement inutile, non mais serieux un dragon \nqui ne crache pas de feu? c'est pas un dragon mais un l�zard");
        }
        while (!saisie.equalsIgnoreCase("oui") && !saisie.equalsIgnoreCase("non")) {
            System.err.println("veuillez rentrer un format valide");
            System.out.println(saisie);
            System.out.println("Merci de saisir oui ou non");
            dragon.setFeu(saisie = sc.nextLine());
        }

        System.out.println("\r\nQuel est le comportemenent amoureux de votre dragon :");
        String[] comptamoureux = {"1- Fougueux", "2- romantique", "3- solitaire", "4- d�pressif"};

        for (String liste : comptamoureux) {
            System.out.println(liste);
        }

        String choix = null;
        int saisieTab = scInt.nextInt();
        if (saisieTab == 1) {
            choix = "Fougueux";
        } else if (saisieTab == 2) {
            choix = "Romantique";
        } else if (saisieTab == 3) {
            choix = "Solitaire";
        } else if (saisieTab == 4) {
            choix = "Dépressif";
        } else {
            System.out.println("le choix saisi n'est pas valabe");
        }
        dragon.setCompAmoureux(choix);
        dragon.toString();
        return dragon;
    }

}
