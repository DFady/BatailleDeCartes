import java.util.*;

public class BatailleMain 
{

	/*CREATION DE JOUEURS*/
    public static void main(String[] args) 
    {
        Joueur joueur1 = new Joueur();
        Joueur joueur2 = new Joueur();
        jouer(joueur1, joueur2);
    }

    public static void jouer(Joueur joueur1, Joueur joueur2) 
    {
    	/*TABLEAUX*/
    	 int[] valeurs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    	 String[] couleurs = {"Coeur", "Carreaux", "Pique", "Trèfle"};
    	
    	
        List<Carte> paquetDeCartes = new ArrayList<Carte>();
        for (int i = 0; i < 13; i++) 
        {
            for (int j = 0; j < 4; j++) 
            {
                paquetDeCartes.add(new Carte(valeurs[i], couleurs[j]));
            }
        }
        
        /*MELANGE LES CARTES*/
        Collections.shuffle(paquetDeCartes);

        int size = paquetDeCartes.size();
        for (int i = 0; i < size / 2; i++)
            joueur1.ajouterUneCarte(paquetDeCartes.get(i));
            
        for (int i = size / 2; i < size; i++)
        	joueur2.ajouterUneCarte(paquetDeCartes.get(i));

        while (joueur1.jeuDeCartes.size()>= 1 && joueur2.jeuDeCartes.size()>= 1){
            if (joueur1.jeuDeCartes.size()==1){
                System.out.println("joueur2  est le vainqueur");
                break;
            }
            if (joueur2.jeuDeCartes.size()==1){
                System.out.println("joueur1 est le vainqueur");
                break;
            }
            List<Carte> liste = new ArrayList<Carte>();
            Carte c1 = joueur1.jeuDeCartes.get(0);
            Carte c2 = joueur2.jeuDeCartes.get(0);
            if (c1.getValeur() < c2.getValeur()){
                joueur1.jeuDeCartes.remove(0);
                joueur2.jeuDeCartes.add(c1);
                joueur2.jeuDeCartes.add(c2);
                joueur2.jeuDeCartes.addAll(liste);
                joueur2.points += 1;
            }
            else if (c1.getValeur() > c2.getValeur()) {
            	joueur2.jeuDeCartes.remove(0);
                joueur1.jeuDeCartes.add(c2);
                joueur1.jeuDeCartes.add(c1);
                joueur2.jeuDeCartes.addAll(liste);
                joueur1.points += 1;
            }
            else {
                joueur2.jeuDeCartes.remove(0);
                joueur1.jeuDeCartes.remove(0);
                liste.add(c1);
                liste.add(c2);
            }
        }
    }
}