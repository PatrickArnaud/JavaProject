/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamagochifinal;

public class Tamagochi {

    //variable de notre tamagochi
    private int energie;
    private int bonheur;
    private int poid;
    private int faim;
    private int soif;
    private int taille;
    private int age;
    private boolean alive;

    //constructeur défini
    public Tamagochi(int energie, int bonheur, int poid, int faim, int soif, int taille, int age, boolean alive) {
        this.energie = energie;
        this.bonheur = bonheur;
        this.poid = poid;
        this.faim = faim;
        this.soif = soif;
        this.taille = taille;
        this.age = age;
        this.alive = alive;
    }
    //constructeur libre

    public Tamagochi() {
    }

    // Getter et Setter de base
    public int getEnergie() {
        return energie;
    }

    public void setEnergie(int energie) {
        this.energie = energie;
    }

    public int getBonheur() {
        return bonheur;
    }

    public void setBonheur(int bonheur) {
        this.bonheur = bonheur;
    }

    public int getPoid() {
        return poid;
    }

    public void setPoid(int poid) {
        this.poid = poid;
    }

    public int getFaim() {
        return faim;
    }

    public void setFaim(int faim) {
        this.faim = faim;
    }

    public int getSoif() {
        return soif;
    }

    public void setSoif(int soif) {
        this.soif = soif;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    //affichage des variable de notre Tamagochi
    public String getEnergieAffiche() {
        int energie = this.getEnergie();
        String energieAffiche = Integer.toString(energie);
        return energieAffiche;
    }

    public String getSoifAffiche() {
        int soif = this.getSoif();
        String soifAffiche = Integer.toString(soif);
        return soifAffiche;
    }

    public String getFaimAffiche() {
        int faim = this.getFaim();
        String faimAffiche = Integer.toString(faim);
        return faimAffiche;
    }

    public String getPoidAffiche() {
        int poid = this.getPoid();
        String poidAffiche = Integer.toString(poid);
        return poidAffiche;
    }

    public String getBonheurAffiche() {
        int bonheur = this.getBonheur();
        String bonheurAffiche = Integer.toString(bonheur);
        return bonheurAffiche;
    }

    public String getAgeAffiche() {
        int age = this.getAge();
        String ageAffiche = Integer.toString(age);
        return ageAffiche;
    }

    //action que notre Tamagochi effectue
    void joue() {
        this.setBonheur(10);
        this.setEnergie(this.getEnergie() - 2);
        this.setFaim(this.getFaim() - 2);
        this.setSoif(this.getSoif() - 2);
        this.setAge(this.getAge() + 1);

    }

    void dort() {
        this.setEnergie(10);
        this.setBonheur(this.getBonheur() + 1);
        this.setFaim(this.getFaim() - 2);
        this.setSoif(this.getSoif() - 2);
        this.setAge(this.getAge() + 2);
    }

    void mange() {
        this.setFaim(10);
        this.setBonheur(this.getBonheur() - 1);
        this.setPoid(this.getPoid() + 1);
        this.setEnergie(this.getEnergie() - 1);
        this.setAge(this.getAge() + 1);
    }

    void bois() {
        this.setSoif(10);
        this.setBonheur(this.getBonheur() - 1);
        this.setEnergie(this.getEnergie() - 1);
        this.setFaim(this.getFaim() - 1);
        this.setAge(this.getAge() + 1);
    }

    void sport() {
        this.setPoid(this.getPoid() - 4);
        this.setBonheur(this.getBonheur() - 1);
        this.setSoif(this.getSoif() - 2);
        this.setEnergie(this.getEnergie() - 2);
        this.setFaim(this.getFaim() - 2);
        this.setAge(this.getAge() + 1);
    }

    // Méthode permettant de vérifier que notre Tamagochi est en vie
    boolean checkAlive() {
        if (poid > 15) {
            this.setAlive(false);
        } else if (energie <= 0) {
            this.setAlive(false);
        } else if (soif <= 0) {
            this.setAlive(false);
        } else if (bonheur <= 0) {
            this.setAlive(false);
        } else if (poid <= 0) {
            this.setAlive(false);
        } else if (age > 100) {
            this.setAlive(false);
        }
        return this.isAlive();
    }

    // méthode retournant la cause du décés de notre Tamagochi
    String causeDc() {
        String causeDeMort = "";
        if (poid > 15) {
            causeDeMort = "oups kiki est mort de surpoid";
        } else if (energie == 0) {
            causeDeMort = "oups kiki est mort de fatigue";
        } else if (soif <= 0) {
            causeDeMort = "oups kiki est mort de soif";
        } else if (poid <= 0) {
            causeDeMort = "oups kiki est mort de malnutrition";
        } else if (bonheur <= 0) {
            causeDeMort = "oups kiki est mort de tristesse";
        } else if (age > 100) {
            causeDeMort = "oups kiki est mort de vieillesse";
        }
        return causeDeMort;
    }

}
