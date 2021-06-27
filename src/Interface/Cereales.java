package Interface;


import javax.swing.*;

import metier.Utilisateur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;


public class Cereales extends JFrame  {
    private JLabel creal, wallplats , logo;

    private JButton cerealfruit, cerealamande , cerealecacahuete , cereallesaulait , cerealesauchocolat , rizcomplet , rizsauvage , cornflakes , grains , Noix,back ;
    
    Utilisateur util ;
    
    String s ;
    public Cereales(Utilisateur util ) {

        this.util=util;
    	
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setSize(750 , 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setTitle("Cereales");





        creal = new JLabel("Cereales") ;
        creal.setBounds(250,10,400,90);
        creal.setForeground(new Color(255,255,0) ) ;
        creal.setFont(new Font("Rockwell", 1, 60));
        getContentPane().add(creal) ;
         s="gramme";
        cerealfruit = new JButton("Cereales aux fruits") ;
        getContentPane().add(cerealfruit) ;
        cerealfruit.setBounds(130,100,500,35);
        cerealfruit.setForeground(new Color(0,0,0) ) ;
        cerealfruit.setFont(new Font("Serif", 1, 25));
        cerealfruit.setOpaque(false);
        cerealfruit.setContentAreaFilled(false);
        cerealfruit.addActionListener(new Cal(this,s));

        cerealamande = new JButton("Cereales aux amandes") ;
        getContentPane().add(cerealamande) ;
        cerealamande.setBounds(130,140,500,35);
        cerealamande.setForeground(new Color(0,0,0) ) ;
        cerealamande.setFont(new Font("Serif", 1, 25));
        cerealamande.setOpaque(false);
        cerealamande.setContentAreaFilled(false);
        cerealamande.addActionListener(new Cal(this,s));


        cerealecacahuete = new JButton("Cereales aux cacahuete") ;
        getContentPane().add(cerealecacahuete) ;
        cerealecacahuete.setBounds(130,180,500,35);
        cerealecacahuete.setForeground(new Color(0,0,0) ) ;
        cerealecacahuete.setFont(new Font("Serif", 1, 25));
        cerealecacahuete.setOpaque(false);
        cerealecacahuete.setContentAreaFilled(false);
        cerealecacahuete.addActionListener(new Cal(this,s));


        cereallesaulait = new JButton("Cereales au lait") ;
        getContentPane().add(cereallesaulait) ;
        cereallesaulait.setBounds(130,220,500,35);
        cereallesaulait.setForeground(new Color(0,0,0) ) ;
        cereallesaulait.setFont(new Font("Serif", 1, 25));
        cereallesaulait.setOpaque(false);
        cereallesaulait.setContentAreaFilled(false);
        cereallesaulait.addActionListener(new Cal(this,s));


        cerealesauchocolat = new JButton("Cereales au chocolat") ;
        getContentPane().add(cerealesauchocolat) ;
        cerealesauchocolat.setBounds(130,260,500,35);
        cerealesauchocolat.setForeground(new Color(0,0,0) ) ;
        cerealesauchocolat.setFont(new Font("Serif", 1, 25));
        cerealesauchocolat.setOpaque(false);
        cerealesauchocolat.setContentAreaFilled(false);
        cerealesauchocolat.addActionListener(new Cal(this,s ));


        rizcomplet = new JButton("Riz complet") ;
        getContentPane().add(rizcomplet) ;
        rizcomplet.setBounds(130,300,500,35);
        rizcomplet.setForeground(new Color(0,0,0) ) ;
        rizcomplet.setFont(new Font("Serif", 1, 25));
        rizcomplet.setOpaque(false);
        rizcomplet.setContentAreaFilled(false);
        rizcomplet.addActionListener(new Cal(this,s ));


        rizsauvage = new JButton("Riz sauvage") ;
        getContentPane().add(rizsauvage) ;
        rizsauvage.setBounds(130,340,500,35);
        rizsauvage.setForeground(new Color(0,0,0) ) ;
        rizsauvage.setFont(new Font("Serif", 1, 25));
        rizsauvage.setOpaque(false);
        rizsauvage.setContentAreaFilled(false);
        rizsauvage.addActionListener(new Cal(this,s ));


        cornflakes = new JButton("Corn flakes") ;
        getContentPane().add(cornflakes) ;
        cornflakes.setBounds(130,380,500,35);
        cornflakes.setForeground(new Color(0,0,0) ) ;
        cornflakes.setFont(new Font("Serif", 1, 25));
        cornflakes.setOpaque(false);
        cornflakes.setContentAreaFilled(false);
        cornflakes.addActionListener(new Cal(this,s ));


        grains = new JButton("Grains") ;
        getContentPane().add(grains) ;
        grains.setBounds(130,420,500,35);
        grains.setForeground(new Color(0,0,0) ) ;
        grains.setFont(new Font("Serif", 1, 25));
        grains.setOpaque(false);
        grains.setContentAreaFilled(false);
        grains.addActionListener(new Cal(this,s ));


        Noix = new JButton("Noix") ;
        getContentPane().add(Noix) ;
        Noix.setBounds(130,460,500,35);
        Noix.setForeground(new Color(0,0,0) ) ;
        Noix.setFont(new Font("Serif", 1, 25));
        Noix.setOpaque(false);
        Noix.setContentAreaFilled(false);
        Noix.addActionListener(new Cal(this,s) );


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
        private Cereales g;
        String s ;
        public Cal(Cereales g,String s )
        {  this.s=s;
            this.g=g;
        }
        public void actionPerformed(ActionEvent e) {
          
            Calcul c= new Calcul(s);
        } }

    public class Back implements ActionListener {
        private Cereales  g;
        public Back(Cereales g)
        {
            this.g=g;
        }
        public void actionPerformed(ActionEvent e) {
            
            Aliments c= new Aliments(util);
            g.dispose();
        } }

    /*public static void main (String[] args ) {

        Cereales c1 =new Cereales () ;
    }*/
}
