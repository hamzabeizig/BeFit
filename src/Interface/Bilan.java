package Interface;
import javax.swing.*;

import metier.Utilisateur;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Bilan extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel logo ;
    private JLabel wall1;
    private  JLabel petit ;
    private JLabel dejeuner ;
    private JLabel diner ;
    private JLabel sport ;
    private JButton ajouterpetit  ;
    private JButton ajouterdej  ;
    private JButton ajouterdiner  ;
    private JButton ajoutersport  ;
    private JLabel restant ;
    private JLabel aliments ;
    private JLabel exercices ;
    private JLabel objectif ;
    private JLabel valeurrestant ;
    private JLabel valeuraliments ;
    private JLabel valeurexercices ;
    private JLabel valeurobjectif ;
    public JToolBar barreOutils ;
    private JButton back;
    Utilisateur util ;



    public Bilan(Utilisateur util) {
    	this.util=util;


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setSize(750 , 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setTitle("Be Fit ");
  
        
        
        
        back = new JButton();
        back.setIcon(new ImageIcon("back2.png"));
        back.setBounds(0,0,80,70);
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorderPainted(false);
        getContentPane().add(back);
        back.addActionListener(new Back(this));



        logo = new JLabel();
        ImageIcon log = new ImageIcon("logoo.png");
        logo.setIcon(log);
        getContentPane().add(logo);
        logo.setBounds(15,0,600,150);


        petit = new JLabel() ;
        petit.setBackground(new Color(255, 255, 255));
        petit.setFont(new Font("Serif", 1, 24));

        petit.setText("Petit déjeuner");
        petit.setIcon(new ImageIcon("petit.png"));
        petit.setBounds(50,150,250,250);
        petit.setFont(new Font("Serif", 1, 24));
        petit.setForeground(new Color(0,0,0) ) ;
        getContentPane().add(petit) ;

        dejeuner = new JLabel() ;
        dejeuner.setBackground(new Color(255, 255, 255));
        dejeuner.setFont(new Font("Serif", 1, 24));
        dejeuner.setForeground(new Color(0,0,0) ) ;
        dejeuner.setText("Déjeuner");
        dejeuner.setIcon(new ImageIcon("dejeuner.png"));
        getContentPane().add(dejeuner) ;
        dejeuner.setBounds(50,200,250,250);

        diner = new JLabel() ;
        diner.setBackground(new Color(255, 255, 255));
        diner.setFont(new Font("Serif", 1, 24));
        diner.setForeground(new Color(0,0,0) ) ;
        diner.setText("dîner");
        diner.setIcon(new ImageIcon("diner.png"));
        getContentPane().add(diner) ;
        diner.setBounds(50,250,250,250);

        sport = new JLabel() ;
        sport.setBackground(new Color(255, 255, 255));
        sport.setFont(new Font("Serif", 1, 24));
        sport.setForeground(new Color(0,0,0) ) ;
        sport.setText("Sport ");
        sport.setIcon(new ImageIcon("sport.png"));
        getContentPane().add(sport) ;
        sport.setBounds(50,300,250,250);

        ajouterpetit = new JButton("Ajouter") ;
        ajouterpetit.setFont(new Font("Arial", 3, 16));
        getContentPane().add(ajouterpetit) ;
        ajouterpetit.setBounds(220,260,200,30);
        ajouterpetit.setIcon(new ImageIcon("add.png"));
        ajouterpetit.setOpaque(false);
        ajouterpetit.setContentAreaFilled(false);
        ajouterpetit.setBorderPainted(false);
        ajouterpetit.addActionListener(new ValiderB(this));



        ajouterdej = new JButton("Ajouter") ;
        ajouterdej.setFont(new Font("Arial", 3, 16));
        getContentPane().add(ajouterdej) ;
        ajouterdej.setBounds(220,310,200,30);
        ajouterdej.setIcon(new ImageIcon("add.png"));
        ajouterdej.setOpaque(false);
        ajouterdej.setContentAreaFilled(false);
        ajouterdej.setBorderPainted(false);
        ajouterdej.addActionListener(new ValiderB(this));

        ajouterdiner = new JButton("Ajouter") ;
        ajouterdiner.setFont(new Font("Arial", 3, 16));
        getContentPane().add(ajouterdiner) ;
        ajouterdiner.setBounds(220,360,200,30);
        ajouterdiner.setIcon(new ImageIcon("add.png"));
        ajouterdiner.setOpaque(false);
        ajouterdiner.setContentAreaFilled(false);
        ajouterdiner.setBorderPainted(false);
        ajouterdiner.addActionListener(new ValiderB(this));

        ajoutersport= new JButton("Ajouter") ;
        ajoutersport.setFont(new Font("Arial", 3, 16));
        getContentPane().add(ajoutersport) ;
        ajoutersport.setBounds(220,410,200,30);
        ajoutersport.setIcon(new ImageIcon("add.png"));
        ajoutersport.setOpaque(false);
        ajoutersport.setContentAreaFilled(false);
        ajoutersport.setBorderPainted(false);
        ajoutersport.addActionListener(new Validersport(this));

        barreOutils = new JToolBar(JToolBar.HORIZONTAL);
        JButton b1 = new JButton("Bilan");
        b1.setIcon(new ImageIcon("bilan.png"));
        barreOutils.add(b1);
        JButton b2 = new JButton("Poids ideal");
        b2.setIcon(new ImageIcon("poids.png"));
        barreOutils.add(b2);
        b2.addActionListener(new Poids(this));
        JButton b3 = new JButton("Historique");
        b3.setIcon(new ImageIcon("historique.png"));
        barreOutils.add(b3);
        JButton b4 = new JButton("Recettes");
        b4.setIcon(new ImageIcon("recettes.png"));
        barreOutils.add(b4);
        JButton b5 = new JButton("Profil");
        b5.setIcon(new ImageIcon("profil.png"));
        barreOutils.add(b5);
        barreOutils.setBounds(0,530,730,40);
        barreOutils.setLayout(new GridLayout(1,5));
        getContentPane().add(barreOutils);
        barreOutils.setOpaque(false);
        barreOutils.setBorderPainted(false);

        objectif = new JLabel("Objectif        -") ;
        objectif.setBounds(50,200,200,20);
        objectif.setForeground(new Color(255,0,0) ) ;
        objectif.setFont(new Font("Serif", 1, 18));
        getContentPane().add(objectif) ;

        aliments = new JLabel("Aliments       +") ;
        aliments.setBounds(200,200,200,20);
        aliments.setForeground(new Color(255,0,0) ) ;
        aliments.setFont(new Font("Serif", 1, 18));
        getContentPane().add(aliments) ;

        exercices = new JLabel("Exercices       =") ;
        exercices.setBounds(350,200,200,20);
        exercices.setForeground(new Color(255,0,0) ) ;
        exercices.setFont(new Font("Serif", 1, 18));
        getContentPane().add(exercices) ;

        restant = new JLabel("Restant") ;
        restant.setBounds(500,200,200,20);
        restant.setForeground(new Color(255,0,0) ) ;
        restant.setFont(new Font("Serif", 1, 18));
        getContentPane().add(restant) ;
        
        
        String vo= null ;
        String vr= null ;
        String vrE=null;
        String vrA=null;
      
        int k=(int) util.calories_par_jour();
        vo=String.valueOf(k);
        int u = Utilisateur.calculA();
        vrE=String.valueOf(u);
        int m =Utilisateur.calculS();
        vrA=String.valueOf(m);
        int g =k-u+m;
        vr=String.valueOf(g);
        valeurobjectif = new JLabel(vo) ;
        valeurobjectif.setBounds(50,170,200,20);
        valeurobjectif.setForeground(new Color(255,0,0) ) ;
        valeurobjectif.setFont(new Font("Serif", 1, 18));
        getContentPane().add(valeurobjectif) ;

        valeuraliments = new JLabel( vrE) ;
        valeuraliments.setBounds(200,170,200,20);
        valeuraliments.setForeground(new Color(255,0,0) ) ;
        valeuraliments.setFont(new Font("Serif", 1, 18));
        getContentPane().add(valeuraliments) ;

        valeurexercices = new JLabel(vrA) ;
        valeurexercices.setBounds(350,170,200,20);
        valeurexercices.setForeground(new Color(255,0,0) ) ;
        valeurexercices.setFont(new Font("Serif", 1, 18));
        getContentPane().add(valeurexercices) ;

        valeurrestant = new JLabel(vr) ;
        valeurrestant.setBounds(500,170,200,20);
        valeurrestant.setForeground(new Color(255,0,0) ) ;
        valeurrestant.setFont(new Font("Serif", 1, 18));
        getContentPane().add(valeurrestant) ;
        
        
        
        
       


        wall1 = new JLabel();
        ImageIcon imgThisImg = new ImageIcon("logo55.jpg");
        wall1.setIcon(imgThisImg);
        getContentPane().add(wall1);
        wall1.setBounds(0,0,750,600);



    }
    public class ValiderB implements ActionListener {
        private Bilan g;
        public ValiderB(Bilan g)
        {
            this.g=g;
        }
        public void actionPerformed(ActionEvent e) {

            Aliments c= new Aliments(util);
            g.dispose();        } }
    

    public class Validersport implements ActionListener {
        private Bilan g;
        public Validersport(Bilan g)
        {
            this.g=g;
        }
        public void actionPerformed(ActionEvent e) {

            Sport spo= new Sport(util);
            g.dispose();        } }
    
    

    public class Poids implements ActionListener {
        private Bilan g;
        public Poids(Bilan g)
        {
            this.g=g;
        }
        public void actionPerformed(ActionEvent e) {

            Poidsideale c= new Poidsideale(util);
            g.dispose();
        } }
    public class Back implements ActionListener {
        private Bilan g;
        public Back(Bilan g)
        {
            this.g=g;
        }
        public void actionPerformed(ActionEvent e) {

            First c= new First();
            g.dispose();
        } }

   
}
