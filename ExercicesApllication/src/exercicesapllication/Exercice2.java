package exercicesapllication;

import java.util.Scanner;

public class Exercice2 {

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", ville=" + ville + ", codePostal=" + codePostal + ", age=" + age + '}';
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String nom;
    String prenom;
    String adresse;
    String ville;
    int codePostal;
    int age;

    public Exercice2() {

    }

    public static void saisie() {
        System.out.println("saissisez le nombre de personne à saisir");
        Scanner sc = new Scanner(System.in);
        int nombreDePersonne;
        nombreDePersonne = sc.nextInt();
        

        Personne[] tableau = new Personne[nombreDePersonne];
        for (int i = 0; i < nombreDePersonne; i++) {

            sc.nextLine();
            Personne personne = new Personne();
            System.out.println("saissisez le nom");
            String nom = sc.nextLine();
            personne.setNom(nom);

            System.out.println("saissisez le prenom");
            String prenom = sc.nextLine();
            personne.setPrenom(prenom);

            System.out.println("saissisez l'adresse");
            String adresse = sc.nextLine();
            personne.setAdresse(adresse);

            System.out.println("saissisez la ville");
            String ville = sc.nextLine();
            personne.setVille(ville);
            sc.nextLine();

            System.out.println("saissisez le CP");
            int codePostal = sc.nextInt();
            personne.setCodePostal(codePostal);

            System.out.println("saissisez l'age");
            int age = sc.nextInt();
            personne.setAge(age);
            tableau[i] = personne;

        }
        int tampon = 0;
        int index = 0;
        
        for (int i = 0; i < tableau.length; i++) {
            if (tampon < tableau[i].getAge()) {
                tampon = tableau[i].getAge();
                index = i;
            }
        }
        System.out.println("plus vieux " + tableau[index].getNom());
        
        for (int i = 0; i < tableau.length; i++) {
            if (tampon > tableau[i].getAge()) {
                tampon = tableau[i].getAge();
                index = i;
            }
        }        
        System.out.println("plus jeune " + tableau[index].getNom());
    }

}
