import java.util.ArrayList;
import java.util.List;


public class Joueur 
{
	
	/*ATTRIBUTS*/
    public int points;
    List<Carte> jeuDeCartes = new ArrayList<Carte>();
    
    
    /*CONSTRUCTEURS*/
    public Joueur() 
    {
        this.points = 0;
    }
    
    
    /*METHODE*/
    public String affichageDuResultat() 
    {
        return this.points + " ";
	}
    
    /*METHODE TIRER UNE CARTE*/
    
    public Carte tirerUneCarte(int indiceCarte)
    {
    	Carte carte = jeuDeCartes.get(indiceCarte);
    	jeuDeCartes.remove(indiceCarte);
    	return carte;
    }
    
    /*METHODE AJOUTER UNE CARTE*/
    public void ajouterUneCarte(Carte uneCarte)
    {
    	jeuDeCartes.add(uneCarte);
    }
}

