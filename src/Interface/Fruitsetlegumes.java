package Interface;


import javax.swing.*;

import metier.Utilisateur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;


public class Fruitsetlegumes extends JFrame  {
    private JLabel fruitsleg, wallplats , logo;
    private JButton orange  , pomme , banane , fraise , kiwi , ananas , peche , pasteque , concombres , carrote,back ;
    
    Utilisateur util  ;
    public Fruitsetlegumes(Utilisateur util ) 
    {
        this.util = util ;  
 
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setSize(750 , 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setTitle("Fruits et legumes");





        fruitsleg = new JLabel("Fruits et legumes") ;
        fruitsleg.setBounds(120,10,600,90);
        fruitsleg.setForeground(new Color(255,255,0) ) ;
        fruitsleg.setFont(new Font("Rockwell", 1, 60));
        getContentPane().add(fruitsleg) ;

        orange = new JButton("Orange") ;
        getContentPane().add(orange) ;
        orange.setBounds(130,100,500,35);
        orange.setForeground(new Color(0,0,0) ) ;
        orange.setFont(new Font("Serif", 1, 25));
        orange.setOpaque(false);
        orange.setContentAreaFilled(false);
        orange.addActionListener(new Cal(this));

        pomme = new JButton("Pomme") ;
        getContentPane().add(pomme) ;
        pomme.setBounds(130,140,500,35);
        pomme.setForeground(new Color(0,0,0) ) ;
        pomme.setFont(new Font("Serif", 1, 25));
        pomme.setOpaque(false);
        pomme.setContentAreaFilled(false);
        pomme.addActionListener(new Cal(this));


        banane = new JButton("Banane") ;
        getContentPane().add(banane) ;
        banane.setBounds(130,180,500,35);
        banane.setForeground(new Color(0,0,0) ) ;
        banane.setFont(new Font("Serif", 1, 25));
        banane.setOpaque(false);
        banane.setContentAreaFilled(false);
        banane.addActionListener(new Cal(this));


        fraise = new JButton("Fraise") ;
        getContentPane().add(fraise) ;
        fraise.setBounds(130,220,500,35);
        fraise.setForeground(new Color(0,0,0) ) ;
        fraise.setFont(new Font("Serif", 1, 25));
        fraise.setOpaque(false);
        fraise.setContentAreaFilled(false);
        fraise.addActionListener(new Cal(this));


        kiwi = new JButton("Kiwi") ;
        getContentPane().add(kiwi) ;
        kiwi.setBounds(130,260,500,35);
        kiwi.setForeground(new Color(0,0,0) ) ;
        kiwi.setFont(new Font("Serif", 1, 25));
        kiwi.setOpaque(false);
        kiwi.setContentAreaFilled(false);
        kiwi.addActionListener(new Cal(this));


        ananas = new JButton("Ananas") ;
        getContentPane().add(ananas) ;
        ananas.setBounds(130,300,500,35);
        ananas.setForeground(new Color(0,0,0) ) ;
        ananas.setFont(new Font("Serif", 1, 25));
        ananas.setOpaque(false);
        ananas.setContentAreaFilled(false);
        ananas.addActionListener(new Cal(this));


        peche = new JButton("Peche") ;
        getContentPane().add(peche) ;
        peche.setBounds(130,340,500,35);
        peche.setForeground(new Color(0,0,0) ) ;
        peche.setFont(new Font("Serif", 1, 25));
        peche.setOpaque(false);
        peche.setContentAreaFilled(false);
        peche.addActionListener(new Cal(this));


        pasteque = new JButton("Pastèque") ;
        getContentPane().add(        pasteque) ;
        pasteque.setBounds(130,380,500,35);
        pasteque.setForeground(new Color(0,0,0) ) ;
        pasteque.setFont(new Font("Serif", 1, 25));
        pasteque.setOpaque(false);
        pasteque.setContentAreaFilled(false);
        pasteque.addActionListener(new Cal(this));


        concombres = new JButton("Concombres") ;
        getContentPane().add(concombres) ;
        concombres.setBounds(130,420,500,35);
        concombres.setForeground(new Color(0,0,0) ) ;
        concombres.setFont(new Font("Serif", 1, 25));
        concombres.setOpaque(false);
        concombres.setContentAreaFilled(false);
        concombres.addActionListener(new Cal(this));


        carrote = new JButton("Carotte") ;
        getContentPane().add(carrote) ;
        carrote.setBounds(130,460,500,35);
        carrote.setForeground(new Color(0,0,0) ) ;
        carrote.setFont(new Font("Serif", 1, 25));
        carrote.setOpaque(false);
        carrote.setContentAreaFilled(false);
        carrote.addActionListener(new Cal(this));


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
        private Fruitsetlegumes g;
        public Cal(Fruitsetlegumes g)
        {
            this.g=g;
        }
        public void actionPerformed(ActionEvent e) {
 String s ="gramme";
            Calcul c= new Calcul(s );
        } }
    public class Back implements ActionListener {
        private Fruitsetlegumes  g;
        public Back(Fruitsetlegumes g)
        {
            this.g=g;
        }
        public void actionPerformed(ActionEvent e) {
           
            Aliments c= new Aliments(util );
            g.dispose();
        } }

    /*public static void main (String[] args ) {

        Fruitsetlegumes fl =new Fruitsetlegumes () ;
    }*/
}
