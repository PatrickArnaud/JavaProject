package dragon;

import java.util.ArrayList;
import java.util.Scanner;

public class SaisieDragon {
	public Scanner sc = new Scanner(System.in);
	public Scanner scInt = new Scanner(System.in);
public String saisie;
public int saisieInt;
public boolean saisiFeu;


public ArrayList<Dragon> creatTabDragon() {
	
	
	ArrayList<Dragon> tabDragon= new ArrayList<>();
	
System.out.println("Bienvenue dans le monde fantastique des dragons");

System.out.println("vous souhaitez commencer? -oui -non");
	
	
	saisie=sc.nextLine();
	while (saisie.equalsIgnoreCase("oui") || saisie.equalsIgnoreCase("non")) {
		if (saisie.equalsIgnoreCase("oui")) {
			tabDragon.add(recordDragon());			
		} else {
			System.out.println("Merci � la prochaine fois");
			break;
		}
		
	}
	afficheTabDragon(tabDragon);
	return tabDragon;
	
}
public Dragon recordDragon() {
	Dragon dragon = new Dragon();
	do {
	System.out.println("Veuillez saisir le nom du dragon :");
	dragon.setNom(saisie=sc.nextLine());
	
	System.out.println("Veuillez saisir le sexe du dragon :F ou M");
	saisie=sc.nextLine();
		if (saisie.equalsIgnoreCase("F")) {
			dragon.setSexe("Feminin");
		} else if (saisie.equalsIgnoreCase("M")) {
			dragon.setSexe("Masculin");
		}	
	while (!saisie.equalsIgnoreCase("F")&&!saisie.equalsIgnoreCase("M")) {
		System.err.println("veuillez rentrer un format valide");
		
		System.out.println("Merci de saisir le sexe du dragon :F ou M");
		break;
	}
	System.out.println("Veuillez saisir la taille du dragon :");
	dragon.setTaille(saisieInt=scInt.nextInt());
	
	System.out.println("Veuillez le nombre d'ecaille  dragon :");
	dragon.setEcaille(saisieInt=scInt.nextInt());
//	sc.nextInt();
	
	System.out.println("Le dragon crache t-il du feu ? - oui -non");
	dragon.setFeu(saisie=sc.nextLine());
	
	if (saisie.equalsIgnoreCase("non")) {
		System.out.println("votre dragon est compl�tement inutile, non mais serieux un dragon \nqui ne crache pas de feu? c'est pas un dragon mais un l�zard");
	}
	while (!saisie.equalsIgnoreCase("oui")&& !saisie.equalsIgnoreCase("non")) {
		System.err.println("veuillez rentrer un format valide");
		System.out.println(saisie);
		System.out.println("Merci de saisir oui ou non");
		dragon.setFeu(saisie=sc.nextLine());	
		break;
	}
	
	System.out.println("\r\nQuel est le comportemenent amoureux de votre dragon :");
	String [] comptamoureux = {"1- Fougueux", "2- romantique","3- solitaire", "4- d�pressif"};

	
	for (String liste : comptamoureux) {
		System.out.println(liste);		
	}
	
	String choix = null;
	int saisieTab = scInt.nextInt();
	if (saisieTab==1) {
		choix = "Fougueux";
	} else if (saisieTab==2) {
		choix = "Romantique";
	}else if (saisieTab==3) {
		 choix = "Solitaire";
	}else if (saisieTab==4) {
		 choix = "D�pressif";
	}else {System.out.println("le choix saisi n'est pas valabe");}
			
	dragon.setCompAmoureux(choix);
	
	
	System.out.println("Souhaitez-vous enregistrer un nouveau dragons? -oui -non");
	
	saisie=sc.nextLine();
	}while(!saisie.equalsIgnoreCase("oui")&&!saisie.equalsIgnoreCase("non"));

	
	return dragon;
}



public void afficheTabDragon(ArrayList<Dragon> tabDragon) {
	
	for (int i = 0; i < tabDragon.size(); i++) {
		System.out.println("voici votre saisie : ");
		System.out.println("Pour le dragon : "+tabDragon.get(i).getNom());		
		System.out.println("Il est de sexe : "+tabDragon.get(i).getSexe());
		System.out.println("Il poss�de "+tabDragon.get(i).getEcaille()+ " �cailles");
		System.out.println("Il fait "+tabDragon.get(i).getTaille()+" cm de grandeur");
		System.out.println("Et en amoure il est plutot "+tabDragon.get(i).getCompAmoureux());
		
	}

}

public void rechercheDragon(ArrayList<Dragon> tabDragon) {
	
	System.out.println("Veuillez saisir le nom du dragon que vous recherchez");
	saisie=sc.nextLine();
	
	int position = tabDragon.indexOf(saisie);
	System.out.println("voici les informations trouv� pour  : "+saisie);
			
	System.out.println("Il est de sexe : "+tabDragon.get(position).getSexe());
	System.out.println("Il poss�de "+tabDragon.get(position).getEcaille()+ " �cailles");
	System.out.println("Il fait "+tabDragon.get(position).getTaille()+" cm de grandeur");
	System.out.println("Et en amoure il est plutot "+tabDragon.get(position).getCompAmoureux());
	
	
	
	
}


}

