package Interface;

import javax.swing.*;

import metier.Utilisateur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;


public class Boissonsnonalcoolisees extends JFrame  {
    private JLabel boissons, wallplats , logo;
    private JButton eau  , soda , cafe , the , boissonenergitique , jusfruits , juslegumes , lait , smoothie , Boissonsdiététiques , back   ;
    Utilisateur util ;
    public Boissonsnonalcoolisees(Utilisateur util) {

        this.util=util;
    	
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setSize(750 , 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setTitle("Boissons non alcoolisées");





        boissons = new JLabel("Boissons Non alcoolisées") ;
        boissons.setBounds(100,10,700,90);
        boissons.setForeground(new Color(255,255,0) ) ;
        boissons.setFont(new Font("Rockwell", 1, 45));
        getContentPane().add(boissons) ;

        eau = new JButton("Eau") ;
        getContentPane().add(eau) ;
        eau.setBounds(130,100,500,35);
        eau.setForeground(new Color(0,0,0) ) ;
        eau.setFont(new Font("Serif", 1, 25));
        eau.setOpaque(false);
        eau.setContentAreaFilled(false);
        eau.addActionListener(new Cal(this));

        soda = new JButton("Soda") ;
        getContentPane().add(soda) ;
        soda.setBounds(130,140,500,35);
        soda.setForeground(new Color(0,0,0) ) ;
        soda.setFont(new Font("Serif", 1, 25));
        soda.setOpaque(false);
        soda.setContentAreaFilled(false);
        soda.addActionListener(new Cal(this));


        cafe = new JButton("Café") ;
        getContentPane().add(cafe) ;
        cafe.setBounds(130,180,500,35);
        cafe.setForeground(new Color(0,0,0) ) ;
        cafe.setFont(new Font("Serif", 1, 25));
        cafe.setOpaque(false);
        cafe.setContentAreaFilled(false);
        cafe.addActionListener(new Cal(this));


        the = new JButton("Thée") ;
        getContentPane().add(the) ;
        the.setBounds(130,220,500,35);
        the.setForeground(new Color(0,0,0) ) ;
        the.setFont(new Font("Serif", 1, 25));
        the.setOpaque(false);
        the.setContentAreaFilled(false);
        the.addActionListener(new Cal(this));


        boissonenergitique = new JButton("Boissons energitique") ;
        getContentPane().add(boissonenergitique) ;
        boissonenergitique.setBounds(130,260,500,35);
        boissonenergitique.setForeground(new Color(0,0,0) ) ;
        boissonenergitique.setFont(new Font("Serif", 1, 25));
        boissonenergitique.setOpaque(false);
        boissonenergitique.setContentAreaFilled(false);
        boissonenergitique.addActionListener(new Cal(this));


        jusfruits = new JButton("Jus fruits") ;
        getContentPane().add(jusfruits) ;
        jusfruits.setBounds(130,300,500,35);
        jusfruits.setForeground(new Color(0,0,0) ) ;
        jusfruits.setFont(new Font("Serif", 1, 25));
        jusfruits.setOpaque(false);
        jusfruits.setContentAreaFilled(false);
        jusfruits.addActionListener(new Cal(this));


        juslegumes = new JButton("Jus legumes") ;
        getContentPane().add(juslegumes) ;
        juslegumes.setBounds(130,340,500,35);
        juslegumes.setForeground(new Color(0,0,0) ) ;
        juslegumes.setFont(new Font("Serif", 1, 25));
        juslegumes.setOpaque(false);
        juslegumes.setContentAreaFilled(false);
        juslegumes.addActionListener(new Cal(this));


        lait = new JButton("Lait") ;
        getContentPane().add(lait) ;
        lait.setBounds(130,380,500,35);
        lait.setForeground(new Color(0,0,0) ) ;
        lait.setFont(new Font("Serif", 1, 25));
        lait.setOpaque(false);
        lait.setContentAreaFilled(false);
        lait.addActionListener(new Cal(this));


        smoothie = new JButton("Smoothie") ;
        getContentPane().add(smoothie) ;
        smoothie.setBounds(130,420,500,35);
        smoothie.setForeground(new Color(0,0,0) ) ;
        smoothie.setFont(new Font("Serif", 1, 25));
        smoothie.setOpaque(false);
        smoothie.setContentAreaFilled(false);
        smoothie.addActionListener(new Cal(this));


        Boissonsdiététiques = new JButton("Boissons Boissonsdiététiques ") ;
        getContentPane().add(Boissonsdiététiques) ;
        Boissonsdiététiques.setBounds(130,460,500,35);
        Boissonsdiététiques.setForeground(new Color(0,0,0) ) ;
        Boissonsdiététiques.setFont(new Font("Serif", 1, 25));
        Boissonsdiététiques.setOpaque(false);
        Boissonsdiététiques.setContentAreaFilled(false);
        Boissonsdiététiques.addActionListener(new Cal(this));


        back = new JButton();
        back.setIcon(new ImageIcon("back1.png"));
        back.setBounds(30,20,80,70);
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorderPainted(false);
        getContentPane().add(back);
        back.addActionListener(new Back(this));

        logo = new JLabel();
        ImageIcon log = new ImageIcon("logoo99.png");
        logo.setIcon(log);
        getContentPane().add(logo);
        logo.setBounds(650,450,508,200);

        wallplats = new JLabel();
        ImageIcon imgThisImg = new ImageIcon("wallplats.jpg");
        wallplats.setIcon(imgThisImg);
        getContentPane().add(wallplats);
        wallplats.setBounds(0,0,750,600);



    }


    public class Cal implements ActionListener {
        private Boissonsnonalcoolisees g;
        public Cal(Boissonsnonalcoolisees g)
        {
            this.g=g;
        }
        public void actionPerformed(ActionEvent e) {

        	String s ="ml";
            Calcul c= new Calcul(s);
        } }
    public class Back implements ActionListener {
        private Boissonsnonalcoolisees  g;
        public Back(Boissonsnonalcoolisees g)
        {
            this.g=g;
        }
        public void actionPerformed(ActionEvent e) {
           
            Aliments c= new Aliments(util);
            g.dispose();
        } }


   /* public static void main (String[] args ) {

        Boissonsnonalcoolisees boissonnon =new Boissonsnonalcoolisees () ;
    }*/
}
