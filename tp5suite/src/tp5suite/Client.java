package tp5suite;

import java.time.LocalDate;

public class Client extends Personne {

    public Client(char type) {
        this.type = type;
    }

    public Client(char type, String string, String string1, LocalDate ld) {
        super(string, string1, ld);
        this.type = type;
    }

    private char type;

    Client() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public char getType() {

        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    @Override
    public void affichage() {
        super.affichage();       
        switch (type) {
            case 'P':
                System.out.println("type de client : particulier");
                break;
            case 'E':
                System.out.println("type de client : entreprise");
                break;
            case 'A':
                System.out.println("type de client : Administation");
                break;
            default:
                System.out.println("type de client : inconnu");
                break;
        }

    }

}
