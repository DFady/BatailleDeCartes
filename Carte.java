public class Carte
{
	
	
	/* ATTRIBUTS */
	private int valeur;
	private String couleur;
	
	
	
	/*CONSTRUCTEURS*/
	public Carte(int valeur, String couleur) 
	{
		this.valeur = valeur;
		this.couleur = couleur;
	}
	
	
	
	/*GETTERS*/
	public int getValeur() 
	{ 
		return valeur; 
	}
	
	public String getCouleur() 
	{
		return couleur; 
	}
	
	/*SETTERS*/
	public void setValeur(int valeur)
	{
		this.valeur=valeur;
	}
	public void setCouleur(String couleur)
	{
		this.couleur=couleur;
	}
	
	
	/*METHODE COMPARATEURS*/
	public String toString() 
	{
		String Carte = " de " + couleur;
		if (valeur == 1) 
		{
			Carte = "AS" + valeur;
		} 
		else if (valeur == 11) 
		{
			Carte = "VALET" + valeur;
		} 
		else if (valeur == 12) 
		{
			Carte = "REINE" + valeur;
		} 
		else if (valeur == 13) 
		{
			Carte = "ROI" + valeur;
		} else
		{
			Carte = valeur + couleur;
		}
		return Carte;
	}	
}