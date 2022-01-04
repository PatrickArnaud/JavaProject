package tp5suite;

public class Tp5suite {

    public static void main(String[] args) {

//        Personne personne1;
//        Personne personne2;
//        Personne personne3;
//        personne1 = new Personne('A', "Lapointe", "Bobby",1);
//        personne2 = new Client('B', "LaRamasse", "Jacky", 2);
//
//        System.out.println("personne numéro " + personne1.getNumero());
//        System.out.println("nombre personne  " + Personne.getNbInstance());
//
//        System.out.println("personne numéro " + personne2.getNumero());
//        System.out.println("nombre personne  " + Personne.getNbInstance());
//
//        personne3 = new Client('C', "LaMurge", "Thierry", 3);
//        System.out.println("personne numéro " + personne3.getNumero());
//        System.out.println("nombre personne  " + Personne.getNbInstance());
        Client client1 = new Client();
        client1.setNom("Prout");
        client1.setPrenom("caca");
        System.out.println(client1);
        client1.affichage();

    }

}
