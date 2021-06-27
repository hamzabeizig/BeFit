package metier;
import java.io.Serializable;
import java.util.*;
public class Date1 extends Date implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int jour ;
	private int mois ;
	private int annee ;
	public int getJour() {
		return jour;
	}
	public void setJour(int jour) {
		this.jour = jour;
	}
	public int getMois() {
		return mois;
	}
	public void setMois(int mois) {
		this.mois = mois;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	
	
	public Date1(int jour , int mois , int annee)
	{
		this.jour = jour ; 
		this.mois = mois ;
		this.annee = annee ; 
	}
	
	public String toString()
	{
		return " "+jour+"/"+mois+"/"+annee ;
	}

	public static void main(String [] args )
	{
		Date1 d = new Date1(11,12,1998);
		int s =d.annee-1900;
		Date d1=new Date();
		@SuppressWarnings("deprecation")
		int y = d1.getYear();
		int z = y-s;
		System.out.println(s);
		System.out.println(y);
		System.out.println(z);



	}
		
	}
	



