package tp5;

class Exercice2 {

    String status;
    int speed;
    float temperature;

    void checkTemperature() {
        if (temperature > 660) {
            status = "retour au bercail";
            speed = 5;
        }
    }
    
    void showAttributes() {
        System.out.println("Statut : " + status);
        System.out.println("Vitesse : " + speed);
        System.out.println("Température : " + temperature);
    }

    public static void main(String[] arguments) {
        Robot dante = new Robot();
        dante.status = "explorant";
        dante.speed = 2;
        dante.temperature = 510;
        dante.showAttributes();
        System.out.println("Augmentation vitesse ... 3.");
        dante.speed = 3;
        dante.showAttributes();
        System.out.println("Changement température ... 670.");
        dante.temperature = 670;
        dante.showAttributes();
        System.out.println("Vérification de la température.");
        dante.checkTemperature();
        dante.showAttributes();
    }
}
