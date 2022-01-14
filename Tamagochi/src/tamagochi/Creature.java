package tamagochi;

public class Creature {

    public int getEnergie() {
        return energie;
    }

    public void setEnergie(int energie) {
        this.energie = energie;
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

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    private int energie;
    private int poid;
    private int faim;
    private int soif;
    private int taille;
    private boolean alive;

    @Override
    public String toString() {
        return "Creature{" + "energie=" + energie + ", poid=" + poid + ", faim=" + faim + ", soif=" + soif + ", taille=" + taille + ", alive=" + alive + '}';
    }

    public Creature() {
    }

    /**
     * Description
     *
     * @energie
     * @poid
     * @faim
     * @soif
     * @taille
     * @alive (bool)
     */
    public Creature(int energie, int poid, int faim, int soif, int taille, boolean alive) {
        this.energie = energie;
        this.poid = poid;
        this.faim = faim;
        this.soif = soif;
        this.taille = taille;
        this.alive = alive;
    }

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

    void dort() {
        this.setEnergie(10);
        this.setFaim(this.getFaim() - 2);
        this.setSoif(this.getSoif() - 2); 
        
    }

    void mange() {
        this.setFaim(10);
        this.setPoid(this.getPoid() + 1);
        this.setEnergie(this.getEnergie() - 1);       
    }

    void bois() {
        this.setSoif(10);
        this.setEnergie(this.getEnergie() - 1);
        this.setFaim(this.getFaim() - 1);      
    }

    void sport() {
        this.setPoid(this.getPoid() - 4);
        this.setSoif(this.getSoif() - 2);
        this.setEnergie(this.getEnergie() - 2);
        this.setFaim(this.getFaim() - 2);
    }

    boolean checkAlive() {
        if (poid > 15) {
            this.setAlive(false);
        } else if (energie == 0) {
            this.setAlive(false);
        } else if (soif == 0) {
            this.setAlive(false);
        } else if (poid <= 0) {
            this.setAlive(false);
        }
        return this.isAlive(); 
    }
    
    String causeDc() {
        String causeDeMort="";
         if (poid > 15) {
             causeDeMort = "oups kiki est mort de surpoid";
        } else if (energie == 0) {
             causeDeMort = "oups kiki est mort de fatigue";
        } else if (soif <= 0) {
             causeDeMort = "oups kiki est mort de soif";
        } else if (poid <= 0) {
             causeDeMort = "oups kiki est mort de malnutrition";
        }       
        return causeDeMort;        
    }
    
}
