package Interface;
import javax.swing.*;

import metier.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Inscription extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel logo  ;
    private JLabel wallinscri2 ;
    private JLabel title ;
    private JLabel nom;
    private JLabel prenom;
    private JLabel pseudo;
    private JLabel password  ;
    private JLabel taille ;
    private JLabel poids ;
    private JLabel date;
    private JLabel sexe;
    private JTextField textnom ;
    private JTextField textprenom ;
    private JTextField textpseudo ;
    private JTextField texttaille ;
    private JTextField textpoids ;
    private JPasswordField textpassword ;
    private JButton valider ;
    private JButton annuler ;
    private JButton back;
    private JRadioButton Homme ;
    private JRadioButton Femme ;
    Utilisateur util ;
   
    
    
    public Inscription(Utilisateur util) {
    	this.util=util ;

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setSize(750 , 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setTitle("Be Fit ");

        logo = new JLabel();
        ImageIcon log = new ImageIcon("logoo99.png");
        logo.setIcon(log);
        getContentPane().add(logo);
        logo.setBounds(650,450,508,200);

        title = new JLabel("Inscription") ;
        title.setBounds(330,10,400,90);
        title.setForeground(new Color(157,157,157) ) ;
        title.setFont(new Font("Rockwell", 1, 60));
        getContentPane().add(title) ;

        nom = new JLabel("Nom :") ;
        nom.setFont(new Font("Arial", 3, 18));
        nom.setForeground(new Color(150,0 ,0) ) ;
        nom.setBounds(380,120,100,20);
        getContentPane().add(nom) ;

        prenom = new JLabel("Prenom :") ;
        prenom.setFont(new Font("Arial", 3, 18));
        prenom.setForeground(new Color(170,0 ,0) ) ;
        prenom.setBounds(380,160,100,20);
        getContentPane().add(prenom) ;

        pseudo = new JLabel("Pseudo :") ;
        pseudo.setFont(new Font("Arial", 3, 18));
        pseudo.setForeground(new Color(150,0 ,0) ) ;
        pseudo.setBounds(380,200,100,20);
        getContentPane().add(pseudo) ;

        password = new JLabel("Mot de passe :") ;
        password.setFont(new Font("Arial", 3, 18));
        password.setForeground(new Color(150,0 ,0) ) ;
        password.setBounds(380,240,140,20);
        getContentPane().add(password) ;

        taille = new JLabel("Taille (Cm) :") ;
        taille.setFont(new Font("Arial", 3, 18));
        taille.setForeground(new Color(150,0 ,0) ) ;
        taille.setBounds(380,280,120,20);
        getContentPane().add(taille) ;

        poids = new JLabel("Poids (Kg) :") ;
        poids.setFont(new Font("Arial", 3, 18));
        poids.setForeground(new Color(150,0 ,0) ) ;
        poids.setBounds(380,320,120,20);
        getContentPane().add(poids) ;

        date = new JLabel("Date naissance :") ;
        date.setFont(new Font("Arial", 3, 18));
        date.setForeground(new Color(150,0 ,0) ) ;
        date.setBounds(380,360,150,20);
        getContentPane().add(date) ;

        sexe = new JLabel("Sexe :") ;
        sexe.setFont(new Font("Arial", 3, 18));
        sexe.setForeground(new Color(150,0 ,0) ) ;
        sexe.setBounds(380,400,100,20);
        getContentPane().add(sexe) ;


        textnom = new JTextField() ;
        textnom.setForeground(new Color(50,50 ,50) ) ;
        textnom.setBounds(530,120,150,20);
        getContentPane().add(textnom) ;

        textprenom = new JTextField() ;
        textprenom.setForeground(new Color(50,50 ,50) ) ;
        textprenom.setBounds(530,160,150,20);
        getContentPane().add(textprenom) ;

        textpseudo = new JTextField() ;
        textpseudo.setForeground(new Color(50,50 ,50) ) ;
        textpseudo.setBounds(530,200,150,20);
        getContentPane().add(textpseudo) ;

        textpassword = new JPasswordField() ;
        textpassword.setForeground(new Color(50,50 ,50) ) ;
        textpassword.setBounds(530,240,150,20);
        getContentPane().add(textpassword) ;

        texttaille = new JTextField() ;
        texttaille.setForeground(new Color(50,50 ,50) ) ;
        texttaille.setBounds(530,280,150,20);
        getContentPane().add(texttaille) ;
        
       
        

        textpoids = new JTextField() ;
        textpoids.setForeground(new Color(50,50 ,50) ) ;
        textpoids.setBounds(530,320,150,20);
        getContentPane().add(textpoids) ;

        Homme = new JRadioButton("Homme" ) ;
        Femme = new JRadioButton("Femme" ) ;
        ButtonGroup g1 = new ButtonGroup() ;
        g1.add(Femme);
        g1.add(Homme);
        Femme.setBounds(630,400,100,20);
        Homme.setBounds(530,400,100,20);
        Homme.setOpaque(false);
        Homme.setContentAreaFilled(false);
        Homme.setBorderPainted(false);
        Femme.setOpaque(false);
        Femme.setContentAreaFilled(false);
        Femme.setBorderPainted(false);
        getContentPane().add(Homme) ;
        getContentPane().add(Femme) ;

        valider= new JButton("Valider") ;
        valider.setFont(new Font("Arial", 3, 16));
        getContentPane().add(valider) ;
        valider.setBounds(550,450,180,50);
        valider.setIcon(new ImageIcon("Valider.png"));
        valider.setOpaque(false);
        valider.setContentAreaFilled(false);
        valider.addActionListener(new Valider(this));
        
        
        annuler= new JButton("reinitialiser") ;
        annuler.setFont(new Font("Arial", 3, 16));
        getContentPane().add(annuler) ;
        annuler.setBounds(350,450,180,50);
        annuler.setIcon(new ImageIcon("re.png"));
        annuler.setOpaque(false);
        annuler.setContentAreaFilled(false);
        annuler.addActionListener(new Annuler(this));
        
        
        back = new JButton();
        back.setIcon(new ImageIcon("back2.png"));
        back.setBounds(10,20,80,70);
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorderPainted(false);
        getContentPane().add(back);
        back.addActionListener(new Back(this));



        wallinscri2 = new JLabel();
        ImageIcon imgThisImg = new ImageIcon("wallinscri2.jpg");
        wallinscri2.setIcon(imgThisImg);
        getContentPane().add(wallinscri2);
        wallinscri2.setBounds(0,0,750,600);


    }
    public class Back implements ActionListener {
        private Inscription  g;
        public Back(Inscription g)
        {
            this.g=g;
        }
        public void actionPerformed(ActionEvent e) {

            First c= new First();
            g.dispose();
        } }
    
    public class Valider implements ActionListener {
        private Inscription  g;
        public Valider(Inscription g)
        {
            this.g=g;
        }
        @SuppressWarnings("deprecation")
		public void actionPerformed(ActionEvent e) {

        	 String nom ; 
        	 String prenom ; 
        	 String sexe ;   /* H ou F */
        	 Date1 dateN ;   /*date naissonce */
             float taille ; /* en CM */
             float poids ;   /* en KG */
             String pseudo ;  /* un autre nom */ 
             String mp;      /*mots de pass*/
        	nom = textnom.getText();
        	prenom=textprenom.getText();
        	if(Homme.isSelected())
        		sexe="homme";
        	else 
        		sexe="femme";
        	
        	taille=Float.parseFloat(texttaille.getText());
        	poids=Float.parseFloat(textpoids.getText());
        	pseudo=textpseudo.getText();
        	mp=textpassword.getText();
        	dateN=new Date1(13,5,1996);
        	 util =new Utilisateur(nom ,prenom,sexe,  dateN, taille, poids, pseudo,  mp  );
        	util.calcul_age();
        	System.out.println(util);
        	Utilisateur.ajouterU(util);
        	Bilan c= new Bilan(util);
        	 g.dispose();
        	
        } }

    
    public class Annuler implements ActionListener {
        private Inscription  g;
        public Annuler(Inscription g)
        {
            this.g=g;
        }
        public void actionPerformed(ActionEvent e) {

        	 textnom.setText("");
        	textprenom.setText("");
        	Homme.setSelected(false);
        	Femme.setSelected(false);
        texttaille.setText("");
        textpoids.setText("");
        	textpseudo.setText("");
        	textpassword.setText("");
        	
        	
        	
        } }

    
  
    
}
