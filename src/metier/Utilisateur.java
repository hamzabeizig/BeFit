package metier;
import java.io.Serializable;
import java.sql.*;
import java.util.Date;
import java.util.Vector;
import Interface.Connecter;



public class Utilisateur implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nom ; 
	private String prenom ; 
	private String sexe ;   /* H ou F */
	private Date1 dateN ;   /*date naissonce */
    private float taille ; /* en CM */
    private float poids ;   /* en KG */
    private String pseudo ;  /* un autre nom */ 
    private String mp;      /*mots de pass*/
    private int age ;    /* en calcul age dans le methode calcul age  a l aide de dateN */
    
    public static Vector<Aliment> A=new Vector<Aliment>() ;
    public static Vector<Sport> S=new Vector<Sport>() ;
    
  
   
    public  Utilisateur (String nom,String prenom,String sexe, Date1 dateN,float taille,float poids,String pseudo, String mp  )
    {
    	this.setNom(nom);
    	this.setPrenom(prenom);
    	this.setSexe(sexe);
    	this.setDateN(dateN);
    	this.setTaille(taille);
    	this.setPoids(poids);
    	this.setPseudo(pseudo);
    	this.setMp(mp);
    	
    }
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date1 getDateN() {
		return dateN;
	}
	public void setDateN(Date1 dateN) {
		this.dateN = dateN;
	}
	public float getTaille() {
		return taille;
	}
	public void setTaille(float taille) {
		this.taille = taille;
	}
	public float getPoids() {
		return poids;
	}
	public void setPoids(float poids) {
		this.poids = poids;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getMp() {
		return mp;
	}
	public void setMp(String mp) {
		this.mp = mp;
	}
	 public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
			   
	
	   
	@SuppressWarnings("unchecked")
	public static void ajouterU(Utilisateur abc)
	{
		Conexion c = null;
		
		try {
			 c =new Conexion();
			 String nom =abc.getNom(); 
			 String prenom =abc.getPrenom(); 
			 String sexe =abc.getSexe();
			 Date1 dateN =abc.getDateN();
		     float taille =abc.getTaille();
		    float poids =abc.getPoids();
		     String pseudo =abc.getPseudo();
		     String mp=abc.getMp();
		     int age =abc.getAge();
		     String d=dateN.toString();
	        
			String requete = "insert into utilisateur values ('"+nom+"','"+prenom+"','"+sexe+"','"+d+"','"+taille+"','"+poids+"','"+pseudo+"','"+mp+"','"+age+"')";
			int nb = c.getStmt().executeUpdate(requete);
	        if(nb==0)
	            System.out.println("Echec d'ajout");
	        else
	            System.out.println("ajout reussi");
	        
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
		
 
	}
@SuppressWarnings("unchecked")
public static boolean verification ( String pseudo,String mp)
  { 
	Conexion c = null;
	
	  
	
	try {
		 c =new Conexion();
		 String nom = null;
		 String prenom = null ;
		 String sexe = null ;
		 Date1 dateN=new Date1 (13,5,1996);
		 float taille = 0 ;
		 float poids = 0 ;
		 String pseudo1 = null ;
		 String mp1 = null ;
		 int age = 0 ;
		 ResultSet rs = c.getStmt().executeQuery("select * from utilisateur  where psuedo='"+pseudo+"' and mp='"+mp+"'");
		 while(rs.next())
		 {
			 nom =rs.getString(1); 
			 prenom =rs.getString(2); 
			 sexe =rs.getString(3);
			
		     taille =Float.parseFloat(rs.getString(5));
		     poids =Float.parseFloat(rs.getString(6));
		     pseudo1 =rs.getString(7);
		     mp1=rs.getString(8);
		     age =Integer.parseInt(rs.getString(9));
		 }
		 if((mp1==null)&&(pseudo1==null))
		 {
			 return false ;
		 }
		 else 
		 {
		 Utilisateur k2 = new Utilisateur(nom, prenom, sexe,dateN, taille, poids ,pseudo1,mp1);
		 System.out.println("ee");
		 k2.setAge(age);
		System.out.println(k2);
		 Connecter.util=k2;
		
		 return true ;
		 }
    } catch (ClassNotFoundException ex) {
        ex.printStackTrace();
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
	
	

	  return false ;   
	  
  }
  
  
  
  
  public void calcul_age()
  {
	  Date d=new Date();
	  @SuppressWarnings("deprecation")
	int s =d.getYear();
	  int k=dateN.getAnnee();
	  k=k-1900;
	  s=s-k;
	  this.age=s;
	  
  }
  public float poids_ideal_sexe()
  {  float po =0;
	  if(this.sexe == "homme")
	  {
		  po= (this.taille - 100 -(float)((this.taille-150) / 4)) ;
		  return po ;
	  }
	  else                  /* donc sexe = FEMME */
		  po =  (this.taille - 100 - (float)((this.taille-150) / 2.5)) ;
	  return po ;
  }
  
  
   public float poids_ideal_morphologie(String type_morph)
   {  float po=0 ;
   this.calcul_age();
	   if (type_morph=="NORMALE") 
	   {    
		   po = this.taille - 100 + (float)((this.age/10)*0.9);
		 
	   }
	     else
	          { if(type_morph=="LARGE")
		                        {
			                   po = this.taille - 100 + (float)((this.age/10)*0.9*1.1);
		                        }
	                   else 
	                         {  if(type_morph=="MINCE")
		                         po = this.taille - 100 + (float)((this.age/10)*0.9*0.9);
	                         }
	         }
	return po ;   
   }
   
   public float calories_par_jour()
   {
	   float cl =0;
		  if(this.sexe == "HOMME")
		  {
			  cl= (float)(10*this.poids)+(float)(6.25*this.taille)-(float)(5*this.age)+5;
			  return cl ;
		  }
		  else                          /* donc sexe = FEMME */
			  cl =  (float)(10*this.poids)+(float)(6.25*this.taille)-(float)(5*this.age)-161;
		  return cl ;
   }

   
   
   
   @Override
public String toString() {
	return "Utilisateur [nom=" + nom + ", prenom=" + prenom + ", sexe=" + sexe + ", taille=" + taille + ", poids="
			+ poids + ", pseudo=" + pseudo + ", mp=" + mp + ", age=" + age + "]";
}
   public static void ajouterA(Aliment a )
   {
	   
	   A.addElement(a);
	   
   }
   public static void ajouterS(Sport a )
   {
	   
	   S.addElement(a);
	   
   }
   public static int calculA()
   {
	   int somme = 0 ;
	   int i=0;
	   for(i=0;i<A.size();i++) {
	   somme= somme  + A.get(i).getConsomme();
	   
	   }
	   
	   return somme;
	   
   }
   
   public static int calculS()
   {
	   int somme = 0 ;
	   int i=0;
	   for(i=0;i<S.size();i++) {
	   somme= somme  + S.get(i).getConsomme();
	   
	   }
	   
	   return somme;
	   
   }
   
   
   
   
   
   
   
   
   
   

}
