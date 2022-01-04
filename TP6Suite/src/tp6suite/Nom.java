/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6suite;

/**
 *
 * @author Patri
 */
public class Nom {
       

   private String[] preNom = {"Leila", "Kader", "Richard", "Pablo",
        "Guillaume", "Fethi", "Garance", "Charles", "Sébastien", "Eric",
        "Jose-Luis"};
    private String[] nomDeFamille = {"ABERKANE", "AOUAD", "AVISSE", "BLEY",
        "LAFFORGUE", "MEZILLET", "RICHARD", "TAMDRARI", "TRAPE", "TSHIBWID",
        "VICENTE"};

    public void afficheNoms() {
        for (int i = 0; i < preNom.length; ++i) {
            System.out.println(preNom[i] + " " + nomDeFamille[i]);
        }
    }
    
     public void afficheQueNoms() {
        for (int i = 0; i < preNom.length; ++i) {
            System.out.println( nomDeFamille[i]);
        }
    }

    public String[] getPreNom() {
        return preNom;
    }

    public void setPreNom(String[] preNom) {
        this.preNom = preNom;
    }
    

    public String[] getNomDeFamille() {
        return nomDeFamille;
    }

    public void setNomDeFamille(String[] nomDeFamille) {
        this.nomDeFamille = nomDeFamille;
    }
     
      public void afficheQuePrenoms() {
        for (int i = 0; i < preNom.length; ++i) {
            System.out.println(preNom[i] );
        }
    }
      public void afficheNimp(String[] nomDuTableau) {
           for (int i = 0; i < nomDuTableau.length; ++i) {
            System.out.println( nomDuTableau[i]);
        }
      }
}
