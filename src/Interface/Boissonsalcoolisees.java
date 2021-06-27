package Interface;


import javax.swing.*;

import metier.Utilisateur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;


public class Boissonsalcoolisees extends JFrame  {
    private JLabel Boisson, wallplats , logo;
    private JButton bierre  , whisky , vinblanc , vinrouge , vodka , rhum , gin  , tequila , daiquiri , pinacolada ,back ;
    Utilisateur util ;
    public Boissonsalcoolisees(Utilisateur util) {
           this.util=util;

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setSize(750 , 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setTitle("Boissons alcoolisées");





        Boisson = new JLabel("Boisson alcoolisées") ;
        Boisson.setBounds(140,10,600,90);
        Boisson.setForeground(new Color(255,255,0) ) ;
        Boisson.setFont(new Font("Rockwell", 1, 50));
        getContentPane().add(Boisson) ;

        bierre = new JButton("bièrre") ;
        getContentPane().add(bierre) ;
        bierre.setBounds(130,100,500,35);
        bierre.setForeground(new Color(0,0,0) ) ;
        bierre.setFont(new Font("Serif", 1, 25));
        bierre.setOpaque(false);
        bierre.setContentAreaFilled(false);
        bierre.addActionListener(new Cal(this));

        whisky = new JButton("Whisky") ;
        getContentPane().add(whisky) ;
        whisky.setBounds(130,140,500,35);
        whisky.setForeground(new Color(0,0,0) ) ;
        whisky.setFont(new Font("Serif", 1, 25));
        whisky.setOpaque(false);
        whisky.setContentAreaFilled(false);
        whisky.addActionListener(new Cal(this));


        vinblanc = new JButton("Vin blanc") ;
        getContentPane().add(vinblanc) ;
        vinblanc.setBounds(130,180,500,35);
        vinblanc.setForeground(new Color(0,0,0) ) ;
        vinblanc.setFont(new Font("Serif", 1, 25));
        vinblanc.setOpaque(false);
        vinblanc.setContentAreaFilled(false);
        vinblanc.addActionListener(new Cal(this));


        vinrouge = new JButton("Vin rouge") ;
        getContentPane().add(vinrouge) ;
        vinrouge.setBounds(130,220,500,35);
        vinrouge.setForeground(new Color(0,0,0) ) ;
        vinrouge.setFont(new Font("Serif", 1, 25));
        vinrouge.setOpaque(false);
        vinrouge.setContentAreaFilled(false);
        vinrouge.addActionListener(new Cal(this));


        vodka = new JButton("Vodka") ;
        getContentPane().add(vodka) ;
        vodka.setBounds(130,260,500,35);
        vodka.setForeground(new Color(0,0,0) ) ;
        vodka.setFont(new Font("Serif", 1, 25));
        vodka.setOpaque(false);
        vodka.setContentAreaFilled(false);
        vodka.addActionListener(new Cal(this));


        rhum = new JButton("Rhum") ;
        getContentPane().add(rhum) ;
        rhum.setBounds(130,300,500,35);
        rhum.setForeground(new Color(0,0,0) ) ;
        rhum.setFont(new Font("Serif", 1, 25));
        rhum.setOpaque(false);
        rhum.setContentAreaFilled(false);
        rhum.addActionListener(new Cal(this));


        gin = new JButton("Gin") ;
        getContentPane().add(gin) ;
        gin.setBounds(130,340,500,35);
        gin.setForeground(new Color(0,0,0) ) ;
        gin.setFont(new Font("Serif", 1, 25));
        gin.setOpaque(false);
        gin.setContentAreaFilled(false);
        gin.addActionListener(new Cal(this));


        tequila = new JButton("Tequila") ;
        getContentPane().add(tequila) ;
        tequila.setBounds(130,380,500,35);
        tequila.setForeground(new Color(0,0,0) ) ;
        tequila.setFont(new Font("Serif", 1, 25));
        tequila.setOpaque(false);
        tequila.setContentAreaFilled(false);
        tequila.addActionListener(new Cal(this));


        daiquiri = new JButton("Daiquiri") ;
        getContentPane().add(daiquiri) ;
        daiquiri.setBounds(130,420,500,35);
        daiquiri.setForeground(new Color(0,0,0) ) ;
        daiquiri.setFont(new Font("Serif", 1, 25));
        daiquiri.setOpaque(false);
        daiquiri.setContentAreaFilled(false);
        daiquiri.addActionListener(new Cal(this));


        pinacolada = new JButton("Pina colada") ;
        getContentPane().add(pinacolada) ;
        pinacolada.setBounds(130,460,500,35);
        pinacolada.setForeground(new Color(0,0,0) ) ;
        pinacolada.setFont(new Font("Serif", 1, 25));
        pinacolada.setOpaque(false);
        pinacolada.setContentAreaFilled(false);
        pinacolada.addActionListener(new Cal(this));


       

        logo = new JLabel();
        ImageIcon log = new ImageIcon("logoo99.png");
        logo.setIcon(log);
        getContentPane().add(logo);
        logo.setBounds(650,450,508,200);
        
        
        back = new JButton();
        back.setIcon(new ImageIcon("back1.png"));
        back.setBounds(30,20,80,70);
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorderPainted(false);
        getContentPane().add(back);
        back.addActionListener(new Back(this));
        
        
        

        wallplats = new JLabel();
        ImageIcon imgThisImg = new ImageIcon("wallplats.jpg");
        wallplats.setIcon(imgThisImg);
        getContentPane().add(wallplats);
        wallplats.setBounds(0,0,750,600);



    }


    public class Cal implements ActionListener {
        private Boissonsalcoolisees g;
        public Cal(Boissonsalcoolisees g)
        {
            this.g=g;
        }
        public void actionPerformed(ActionEvent e) {
           String s ="ml";
            Calcul c= new Calcul(s);
        } }
    public class Back implements ActionListener {
        private Boissonsalcoolisees  g;
        public Back(Boissonsalcoolisees g)
        {
            this.g=g;
        }
        public void actionPerformed(ActionEvent e) {
            
            Aliments c= new Aliments(util);
            g.dispose();
        } }

   /* public static void main (String[] args ) {

        Boissonsalcoolisees boisson2 =new Boissonsalcoolisees () ;
    }*/
}
