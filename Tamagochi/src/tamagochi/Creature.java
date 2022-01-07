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

    private void dort() {
        this.setEnergie(10);
        System.out.println("hummmf grrrrr!! (Kiki à bien dormi il se réveille");
    }

    private void mange() {
        this.setFaim(10);
        this.setPoid(this.getPoid() + 1);
        this.setEnergie(this.getEnergie() - 1);
        System.out.println("hummmf grrrrr!! (Kiki à bien mangé, il n'as plus faim !");
    }

    private void bois() {
        this.setSoif(10);
        this.setEnergie(this.getEnergie() - 1);
        System.out.println("hummmf grrrrr!! (Kiki à bien bu, il n'as plus soif !");
    }

}
