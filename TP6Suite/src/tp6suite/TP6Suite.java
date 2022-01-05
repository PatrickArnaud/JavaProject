package tp6suite;



public class TP6Suite {

    public static void main(String[] args) {

//         String[] preNom = {"Leila", "Kader", "Richard", "Pablo",
//        "Guillaume", "Fethi", "Garance", "Charles", "Sébastien", "Eric",
//        "Jose-Luis"};
//        Nom bigData = new Nom();
//        bigData.afficheNoms();
//        bigData.afficheQueNoms();
//        bigData.afficheQuePrenoms();
//        bigData.afficheNimp(bigData.getNomDeFamille());
//        System.out.println("Aleatoire");
//        Aleatoire r = new Aleatoire();
//        r.stockeNombres();
//        r.afficheNombres();
//        System.out.println();//
//        float note[][] = new float[3][4];
//        for (int i = 0; i < note.length; ++i) {
//            for (int j = 0; j < note[0].length; ++j) {
//                note[i][j] = Aleatoire.alea(0, 10);
//            }
//            
//            
//        }
//testNotes();
//remplirMatrice(3,4);
//matriceSaisie();
//multiplie();

        int arr[] = {84, 12, 1, 43, 5, 10};

//        System.out.println("---Avant le tri a bulle---"); 
//    
//        affiche(arr);
// 
//        // tri des elements de tableau avec le tri a bulle
//        trier(arr);
// 
//        System.out.println("---Apres le tri a bulle---");  
//    
//        affiche(arr); 
        Trier.trierSelec(arr);
        
        Trier.affiche(arr);
    }
}
