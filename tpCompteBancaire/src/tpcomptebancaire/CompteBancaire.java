/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpcomptebancaire;

import java.util.Scanner;

/**
 *
 * @author Patri
 */
public class CompteBancaire {

    private int numCompte;
    private String nomCompte;
    private float solde;

    public Integer getNumcompte() {
        return numCompte;
    }

    public void setNumcompte(Integer numcompte) {
        this.numCompte = numcompte;
    }

    public String getTitulaireCompte() {
        return nomCompte;
    }

    public void setTitulaireCompte(String nomCompte) {
        this.nomCompte = nomCompte;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public CompteBancaire() {
        numCompte = this.numCompte;
        nomCompte = this.nomCompte;
        solde = this.solde;
    }

    @Override
    public String toString() {
        return "Compte numéro :" + this.numCompte + "Titulaire :" + this.nomCompte + " solde :" + this.solde;
    }

    public void affichageDesInformationsBancaires() {

        int afficheNumCompte = getNumcompte();
        String afficheTitulaireCompte = getTitulaireCompte();
        float afficheSoldeCompte = getSolde();
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("numéro de compte : " + afficheNumCompte);
        System.out.println("Titulaire du compte : " + afficheTitulaireCompte);
        System.out.println("Solde du compte : " + afficheSoldeCompte);
    }

    public void saisieDesInformationsBancaires() {
        saisieNumeroDeCompte();
        saisieTitulaireDuCompte();
        saisieSoldeDuCompte();
    }

    public void saisieNumeroDeCompte() {
        System.out.println("numéro de compte : ");
        Scanner saisieNumeroDeCompte = new Scanner(System.in);
        int numCompteLu = saisieNumeroDeCompte.nextInt();
        setNumcompte(numCompteLu);

    }

    public void saisieTitulaireDuCompte() {
        System.out.println("nom de titulaire du compte : ");
        Scanner saisieTitulaireCompte = new Scanner(System.in);
        String nomTitulaireCompte = saisieTitulaireCompte.nextLine();
        setTitulaireCompte(nomTitulaireCompte);

    }

    public void saisieSoldeDuCompte() {
        System.out.println("solde du compte : ");
        Scanner saisieSoldeCOmpte = new Scanner(System.in);
        float soldeCompte = saisieSoldeCOmpte.nextFloat();
        setSolde(soldeCompte);
    }

}
