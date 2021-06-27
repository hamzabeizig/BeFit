package metier;

import java.io.Serializable;

public class Aliment implements Serializable {
	private int calories ;
	private String nom ;
	private int consomme;
	public Aliment ( )
	{
		this.calories = 0;
		this.setNom("");
		this.setConsomme(0);
	}

	public Aliment (int calories,String nom )
	{
		this.calories=calories ; 
		this.setNom(nom);
		this.setConsomme(0);
	}
	
    public int caloriesP( int grammes   )
    {
    	int k ;
    	k=grammes*this.calories ;
    	this.setConsomme(k);
    	return k ;
    }

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getConsomme() {
		return consomme;
	}

	public void setConsomme(int consomme) {
		this.consomme = consomme;
	}
	
	
	
	

}
