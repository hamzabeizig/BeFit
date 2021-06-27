package Interface;
import javax.swing.*;

import metier.Utilisateur;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aliments extends JFrame  {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton plats ;
    private JButton boissonsnonalcoolisees ;
    private JButton boissonsalcoolisees ;
    private JButton cereales ;
    private JButton fastfood ;
    private JButton patisseries ;
    private JButton gateaux ;
    private JButton fruitsetlegumes ;
    private JButton produitslaitiers ;
    private JLabel wallaliments;
    private JLabel categories ;
    private JButton back ;
    Utilisateur util ;


    public Aliments(Utilisateur util)
    {
    	this.util=util;

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setSize(750 , 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setTitle("Be Fit ");

        categories = new JLabel("Catégories") ;
        categories.setBounds(100,10,400,90);
        categories.setForeground(new Color(157,157,157) ) ;
        categories.setFont(new Font("Rockwell", 1, 60));
        getContentPane().add(categories) ;

        plats = new JButton("Plats") ;
        ImageIcon plat = new ImageIcon("plats1.png");
        getContentPane().add(plats) ;
        plats.setIcon(plat);
        plats.setBounds(10,110,230,80);
        plats.setForeground(new Color(0,0,0) ) ;
        plats.setFont(new Font("Serif", 1, 15));
        plats.setOpaque(false);
        plats.setContentAreaFilled(false);
        plats.addActionListener(new Act(this));

        cereales = new JButton("Céréales") ;
        ImageIcon cereale = new ImageIcon("cereale1.png");
        getContentPane().add(cereales) ;
        cereales.setIcon(cereale);
        cereales.setBounds(250,110,230,80);
        cereales.setForeground(new Color(0,0,0) ) ;
        cereales.setFont(new Font("Serif", 1, 15));
        cereales.setOpaque(false);
        cereales.setContentAreaFilled(false);
        cereales.addActionListener(new Act(this));


        


        gateaux = new JButton("Gateaux") ;
        ImageIcon gateau = new ImageIcon("gateau1.png");
        getContentPane().add(gateaux) ;
        gateaux.setIcon(gateau);
        gateaux.setBounds(10,200,230,80);
        gateaux.setForeground(new Color(0,0,0) ) ;
        gateaux.setFont(new Font("Serif", 1, 15));
        gateaux.setOpaque(false);
        gateaux.setContentAreaFilled(false);
        gateaux.addActionListener(new Act(this));
       


        fastfood= new JButton("Fast Food") ;
        ImageIcon fast = new ImageIcon("fastfood1.png");
        getContentPane().add(fastfood) ;
        fastfood.setIcon(fast);
        fastfood.setBounds(250,200,230,80);
        fastfood.setForeground(new Color(0,0,0) ) ;
        fastfood.setFont(new Font("Serif", 1, 15));
        fastfood.setOpaque(false);
        fastfood.setContentAreaFilled(false);
        fastfood.addActionListener(new Act(this));



        fruitsetlegumes = new JButton("Fruits et Legumes") ;
        ImageIcon fruitlegulmes = new ImageIcon("pomme2.png");
        getContentPane().add(fruitsetlegumes) ;
        fruitsetlegumes.setIcon(fruitlegulmes);
        fruitsetlegumes.setBounds(10,290,230,80);
        fruitsetlegumes.setForeground(new Color(0,0,0) ) ;
        fruitsetlegumes.setFont(new Font("Serif", 1, 15));
        fruitsetlegumes.setOpaque(false);
        fruitsetlegumes.setContentAreaFilled(false);
        fruitsetlegumes.addActionListener(new Act(this));


        patisseries = new JButton("Patisseries") ;
        ImageIcon pat = new ImageIcon("pat1.png");
        getContentPane().add(patisseries) ;
        patisseries.setIcon(pat);
        patisseries.setBounds(250,290,230,80);
        patisseries.setForeground(new Color(0,0,0) ) ;
        patisseries.setFont(new Font("Serif", 1, 15));
        patisseries.setOpaque(false);
        patisseries.setContentAreaFilled(false);
        patisseries.addActionListener(new Act(this));


        boissonsalcoolisees = new JButton("Boissons alcoolisées") ;
        ImageIcon boissonsalcoolisee = new ImageIcon("biere1.png");
        getContentPane().add(boissonsalcoolisees) ;
        boissonsalcoolisees.setIcon(boissonsalcoolisee);
        boissonsalcoolisees.setBounds(10,380,230,80);
        boissonsalcoolisees.setForeground(new Color(0,0,0) ) ;
        boissonsalcoolisees.setFont(new Font("Serif", 1, 15));
        boissonsalcoolisees.setOpaque(false);
        boissonsalcoolisees.setContentAreaFilled(false);
        boissonsalcoolisees.addActionListener(new Act(this));

        produitslaitiers = new JButton("Produits laitiers") ;
        ImageIcon lait = new ImageIcon("lait1.png");
        getContentPane().add(produitslaitiers) ;
        produitslaitiers.setIcon(lait);
        produitslaitiers.setBounds(250,380,230,80);
        produitslaitiers.setForeground(new Color(0,0,0) ) ;
        produitslaitiers.setFont(new Font("Serif", 1, 15));
        produitslaitiers.setOpaque(false);
        produitslaitiers.setContentAreaFilled(false);
        produitslaitiers.addActionListener(new Act(this));
        
        
        
        boissonsnonalcoolisees = new JButton("Boissons") ;
        ImageIcon boisson = new ImageIcon("boissons1.png");
        getContentPane().add(boissonsnonalcoolisees) ;
        boissonsnonalcoolisees.setIcon(boisson);
        boissonsnonalcoolisees.setBounds(130,470,230,80);
        boissonsnonalcoolisees.setForeground(new Color(0,0,0) ) ;
        boissonsnonalcoolisees.setFont(new Font("Serif", 1, 15));
        boissonsnonalcoolisees.setOpaque(false);
        boissonsnonalcoolisees .setContentAreaFilled(false);
        boissonsnonalcoolisees.addActionListener(new Act(this));
        



        back = new JButton();
        back.setIcon(new ImageIcon("back2.png"));
        back.setBounds(10,20,80,70);
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorderPainted(false);
        getContentPane().add(back);
        back.addActionListener(new Back(this));


        wallaliments = new JLabel();
        ImageIcon imgThisImg = new ImageIcon("wall12.jpg");
        wallaliments.setIcon(imgThisImg);
        getContentPane().add(wallaliments);
        wallaliments.setBounds(0,0,750,600);



    }


    public class Back implements ActionListener {
        private Aliments  g;
        public Back(Aliments g)
        {
            this.g=g;
        }
        public void actionPerformed(ActionEvent e) {

            Bilan c= new Bilan(util);
            g.dispose(); 
}}
    
    public class Act implements ActionListener {
        private Aliments  g;
        public Act(Aliments g)
        {
            this.g=g;
        }
        public void actionPerformed(ActionEvent e) {
    if (e.getSource()==plats)
    { Plats c= new Plats(util);
            g.dispose(); 
    }
    if (e.getSource()==cereales)
    { Cereales c= new Cereales(util);
            g.dispose(); 
    }
    if (e.getSource()==gateaux)
    { Gateaux c= new Gateaux(util);
            g.dispose(); 
    }
    if (e.getSource()==fastfood)
    { Fastfood c= new Fastfood(util);
            g.dispose(); 
    }
    if (e.getSource()==fruitsetlegumes)
    { Fruitsetlegumes c= new Fruitsetlegumes(util);
            g.dispose(); 
    }
    if (e.getSource()==patisseries)
    {  Patisseries  c= new  Patisseries (util);
            g.dispose(); 
    }
    if (e.getSource()==boissonsalcoolisees)
    {  Boissonsalcoolisees  c= new  Boissonsalcoolisees (util);
            g.dispose(); 
    }
    if (e.getSource()==produitslaitiers)
    {  Produitslaitiers  c= new  Produitslaitiers (util);
            g.dispose(); 
    }
    if (e.getSource()==boissonsnonalcoolisees)
    {  Boissonsnonalcoolisees  c= new  Boissonsnonalcoolisees (util);
            g.dispose(); 
    }
    
}}
    
    
    
}