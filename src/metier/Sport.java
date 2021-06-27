package metier;

import java.io.Serializable;

public class Sport implements Serializable{

	
	private int calories ;
	private String nom;
	private int consomme ;
	
	
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Sport() {
		
		this.calories=0;
		this.nom="";	
	}
	public Sport (int calories, String nom )
	{
		this.calories=calories;
		this.nom=nom;
	}
	 public int caloriesP( int heures   )
	    {
	    	int k ; 
	    	k=heures;
	    	k=k*this.calories ;
	    	this.consomme=k;
	    	return k ;
	    }
	public int getConsomme() {
		return consomme;
	}
	public void setConsomme(int consomme) {
		this.consomme = consomme;
	}
	
	
	
}
